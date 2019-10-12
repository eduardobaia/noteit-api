package com.noteit.noteitapi.db;

import com.noteit.noteitapi.model.Note;
import com.noteit.noteitapi.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID> {
    List<Note> findAllByNotebook(Notebook notebook);
}
