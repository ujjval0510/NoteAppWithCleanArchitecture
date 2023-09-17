package com.example.noteappcleanarchitecture.featurenote.presentation.notes.component

import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import com.example.noteappcleanarchitecture.featurenote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
