package com.example.controller;

import com.example.domain.Note;
import com.example.service.TaskManagement;
import com.example.service.TaskManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public boolean addNewNote(@RequestBody Note newNote){
        TaskManagement taskManagement=new TaskManagementService();
        return taskManagement.addNotes(newNote);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Note> listAllNotes(){
        TaskManagement taskManagement=new TaskManagementService();
        return taskManagement.listAll();
    }

    @RequestMapping(value = "/{updatenote:[a-zA-Z &+-]+}",method = RequestMethod.POST)
    public boolean updateNote(@PathVariable("updatenote") String updateString,@RequestBody Note newNote){
        TaskManagement taskManagement=new TaskManagementService();
        return taskManagement.updateNotes(updateString,newNote);
    }

    @RequestMapping(value="/{deletenote:[a-zA-Z &+-]+}", method = RequestMethod.DELETE)
    public boolean deleteNote(@PathVariable("deletenote") String noteString){
        TaskManagement taskManagement=new TaskManagementService();
        return taskManagement.removeNotes(noteString);
    }




}
