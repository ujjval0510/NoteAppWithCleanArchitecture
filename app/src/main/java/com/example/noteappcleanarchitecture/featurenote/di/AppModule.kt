package com.example.noteappcleanarchitecture.featurenote.di

import android.app.Application
import androidx.room.Room
import com.example.noteappcleanarchitecture.featurenote.data.data_source.NoteDatabase
import com.example.noteappcleanarchitecture.featurenote.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import com.example.noteappcleanarchitecture.featurenote.data.repository.NoteRepositoryImpl
import com.example.noteappcleanarchitecture.featurenote.domain.repository.NoteRepository
import com.example.noteappcleanarchitecture.featurenote.domain.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCases = AddNoteUseCase(repository),
            getNoteUseCase = GetNoteUseCase(repository)
        )
    }
}