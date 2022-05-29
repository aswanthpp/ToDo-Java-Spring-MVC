package com.example;

import com.example.domain.Note;
import com.example.service.TaskManagement;
import com.example.service.TaskManagementService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        TaskManagement taskManagement=new TaskManagementService();

        Note note=new Note();
        note.setNote("abc");
        taskManagement.addNotes(note);
        note.setNote("def");
        taskManagement.addNotes(note);
        note.setNote("ghi");
        taskManagement.addNotes(note);

        System.out.println("Initial list: ");
        List<Note> notes= taskManagement.listAll();
        notes.forEach((x) -> System.out.println(x.getNote()));


        System.out.println("After update: ");
        note.setNote("xyz");
        taskManagement.updateNotes("abc", note);
        notes= taskManagement.listAll();
        notes.forEach((x) -> System.out.println(x.getNote()));


        System.out.println("After deletion: ");
        taskManagement.removeNotes("def");
        notes= taskManagement.listAll();
        notes.forEach((x) -> System.out.println(x.getNote()));


    }
}
