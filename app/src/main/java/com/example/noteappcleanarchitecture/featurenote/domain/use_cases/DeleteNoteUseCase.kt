package com.example.noteappcleanarchitecture.featurenote.domain.use_cases

import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import com.example.noteappcleanarchitecture.featurenote.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend fun invoke(note: Note) {
        return repository.deleteNote(note)
    }
}