package com.iscoding.notesapp.feature_note.domain.use_case

import com.iscoding.notesapp.feature_note.domain.model.Note
import com.iscoding.notesapp.feature_note.domain.repo.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}