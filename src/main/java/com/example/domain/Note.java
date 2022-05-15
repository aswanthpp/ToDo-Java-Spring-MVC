package com.example.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        return Objects.equals(note, note1.note);
    }

}
