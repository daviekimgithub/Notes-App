package com.iscoding.notesapp.feature_note.presentation.all_notes

import com.iscoding.notesapp.feature_note.domain.model.Note
import com.iscoding.notesapp.feature_note.domain.util.NoteOrder
import com.iscoding.notesapp.feature_note.domain.util.OrderType


data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)