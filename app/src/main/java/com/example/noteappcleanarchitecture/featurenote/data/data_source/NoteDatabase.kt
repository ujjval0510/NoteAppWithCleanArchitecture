package com.example.noteappcleanarchitecture.featurenote.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteappcleanarchitecture.featurenote.domain.model.Note

@Database(
    entities = [Note::class],
    version = 2
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao : NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}