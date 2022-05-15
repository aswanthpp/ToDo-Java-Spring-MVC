package com.example.controller;

import com.example.domain.Note;
import com.example.service.TaskManagement;
import com.example.service.TaskManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    private TaskManagement taskManagement=new TaskManagementService();

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public boolean addNewNote(@RequestBody Note newNote){
        return taskManagement.addNotes(newNote);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Note> listAllNotes(){
        return taskManagement.listAll();
    }

    @RequestMapping(value = "/{updatenote:[a-zA-Z &+-]+}",method = RequestMethod.PUT)
    public boolean updateNote(@PathVariable("updatenote") String updateString,@RequestBody Note newNote){
        return taskManagement.updateNotes(updateString,newNote);
    }

    @RequestMapping(value="/{deletenote:[a-zA-Z &+-]+}", method = RequestMethod.DELETE)
    public boolean deleteNote(@PathVariable("deletenote") String noteString){
        return taskManagement.removeNotes(noteString);
    }




}
