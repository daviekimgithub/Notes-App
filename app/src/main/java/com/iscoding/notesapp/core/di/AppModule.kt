package com.iscoding.notesapp.core.di

import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import androidx.room.Room
import android.app.Application
import com.iscoding.notesapp.feature_note.data.data_source.NoteDatabase
import com.iscoding.notesapp.feature_note.data.repo.NoteRepositoryImpl
import com.iscoding.notesapp.feature_note.domain.repo.NoteRepository
import com.iscoding.notesapp.feature_note.domain.use_case.DeleteNote
import com.iscoding.notesapp.feature_note.domain.use_case.GetNote
import com.iscoding.notesapp.feature_note.domain.use_case.GetNotes
import com.iscoding.notesapp.feature_note.domain.use_case.NoteUseCases
import com.iscoding.notesapp.feature_note.domain.use_case.AddNote
import dagger.Module

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}