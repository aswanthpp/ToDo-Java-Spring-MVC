package com.example.dataaccess.notes;

import com.example.domain.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesMemoryDao implements NotesDao{
    private List<Note> noteList=new ArrayList<>();
    @Override
    public boolean create(Note note) {
        try {
            Note tempNote = new Note();
            tempNote.setNote(note.getNote());
            noteList.add(tempNote);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List read() {
        return noteList;
    }

    @Override
    public boolean update(Note currentNote, Note newNote) {
        try {
            for (int i = 0; i < noteList.size(); i++) {
                if (noteList.get(i).getNote().equals(currentNote.getNote())) {
                    noteList.get(i).setNote(newNote.getNote());
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(Note deleteNote) {
        try {
            List<Integer> matchingIndexes = new ArrayList<>();
            for (int i = 0; i < noteList.size(); i++) {
                if (noteList.get(i).getNote().equals(deleteNote.getNote())) {
//                    noteList.get(i).setNote(currentNote.getNote());
                    noteList.remove(i);
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
