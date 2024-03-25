package com.iscoding.notesapp.feature_note.domain.use_case

import com.iscoding.notesapp.feature_note.domain.model.Note
import com.iscoding.notesapp.feature_note.domain.repo.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}