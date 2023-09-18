package com.example.noteappcleanarchitecture.featurenote.presentation.add_edit_note

data class NoteTextFieldState(
    val text : String = "",
    val hint : String = "",
    val isHintVisible : Boolean = true,
)
