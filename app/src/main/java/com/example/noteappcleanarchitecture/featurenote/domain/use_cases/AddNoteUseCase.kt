package com.example.noteappcleanarchitecture.featurenote.domain.use_cases

import com.example.noteappcleanarchitecture.featurenote.domain.model.InvalidNoteException
import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import com.example.noteappcleanarchitecture.featurenote.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val noteRepository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content of the note can't be empty.")
        }
        noteRepository.insertNote(note)
    }
}