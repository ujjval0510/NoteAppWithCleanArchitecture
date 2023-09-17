package com.example.noteappcleanarchitecture.featurenote.domain.use_cases

import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import com.example.noteappcleanarchitecture.featurenote.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}