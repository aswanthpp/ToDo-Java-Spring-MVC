package com.example.dataaccess.notes;

import com.example.domain.Note;

import java.sql.ResultSet;
import java.util.List;

public interface NotesDao {

    boolean create(Note note);
    List read();
    boolean update(Note currentNote,Note newNote);
    boolean delete(Note deleteNote);

}
