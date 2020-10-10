package com.example.service;

import com.example.domain.Note;

import java.util.List;

public interface TaskManagement {
        boolean addNotes(Note note);
        boolean removeNotes(String currentValue);
        boolean updateNotes(String currentValue,Note newNote);
        List<Note> listAll();
}
