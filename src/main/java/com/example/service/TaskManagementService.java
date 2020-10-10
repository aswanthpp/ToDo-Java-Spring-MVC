package com.example.service;

import com.example.dataaccess.notes.NotesDao;
import com.example.dataaccess.notes.NotesMySQLDao;
import com.example.domain.Note;

import java.util.List;

public class TaskManagementService implements TaskManagement {
    private NotesDao notesDao=new NotesMySQLDao();
    public boolean addNotes(Note note) {
        return this.notesDao.create(note);
    }

    public boolean removeNotes(String currentValue) {
        return this.notesDao.delete(currentValue);
    }

    public boolean updateNotes(String currentValue,Note newNote) {

        return this.notesDao.update(currentValue,newNote);
    }

    public List listAll() {
//        List<Note> notes=this.notesDao.read();
//        List<String> lists=new ArrayList<String>();
//        notes.forEach((note) -> lists.add(note.getNote()));
//        return lists;

//        This needs custom toString methd in Note class
        return this.notesDao.read();
    }
}
