package com.example.noteappcleanarchitecture.featurenote.domain.use_cases

data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCases: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
)