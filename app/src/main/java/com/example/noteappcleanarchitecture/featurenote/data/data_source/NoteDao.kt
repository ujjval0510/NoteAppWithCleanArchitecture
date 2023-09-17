package com.example.noteappcleanarchitecture.featurenote.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    /**
     * A flow in Kotlin is a type that can emit multiple values sequentially, as opposed to suspend functions
     * that return only a single value. Flows are built on top of coroutines and can provide multiple values.
     * A flow is conceptually a stream of data that can be computed asynchronously.
     * The emitted values must be of the same type.
     */
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id= :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}