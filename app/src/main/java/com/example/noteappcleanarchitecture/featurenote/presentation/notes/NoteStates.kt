package com.example.noteappcleanarchitecture.featurenote.presentation.notes

import com.example.noteappcleanarchitecture.featurenote.domain.model.Note
import com.example.noteappcleanarchitecture.featurenote.domain.util.NoteOrder
import com.example.noteappcleanarchitecture.featurenote.domain.util.OrderType

data class NoteStates(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)