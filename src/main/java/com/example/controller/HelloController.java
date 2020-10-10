package com.example.controller;

import com.example.domain.Note;
import com.example.service.TaskManagement;
import com.example.service.TaskManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
