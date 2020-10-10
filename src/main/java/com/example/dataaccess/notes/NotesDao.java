package com.example.dataaccess.notes;

import com.example.domain.Note;

import java.sql.ResultSet;
import java.util.List;

public interface NotesDao {

    boolean create(Note note);
    List read();
    boolean update(String currentValue,Note newNote);
    boolean delete(String currentValue);

}
