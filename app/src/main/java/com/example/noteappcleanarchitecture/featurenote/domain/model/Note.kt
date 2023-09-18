package com.example.noteappcleanarchitecture.featurenote.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteappcleanarchitecture.ui.theme.BabyBlue
import com.example.noteappcleanarchitecture.ui.theme.LightGreen
import com.example.noteappcleanarchitecture.ui.theme.RedOrange
import com.example.noteappcleanarchitecture.ui.theme.RedPink
import com.example.noteappcleanarchitecture.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val createdDate: String,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    /** Companion objects are similar to static members in Java .
     * Companion objects are singletons, meaning that there can only be one instance of a companion object for a given class.
     * Companion objects can be accessed directly using the class name, without having to create an instance of the class.
     * Companion objects can contain factory methods, which can be used to create new instances of the class without having to use the new keyword.
     */
    companion object {
        val noteColors = listOf(RedOrange, BabyBlue, RedPink, Violet, LightGreen)
    }

}

class InvalidNoteException(message: String) : Exception(message)
