package com.example.domain;

public class Note {

    private String note;

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
