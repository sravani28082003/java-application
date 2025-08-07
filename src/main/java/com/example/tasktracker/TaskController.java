package com.example.tasktracker;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TaskController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Task Tracker!";
    }
 
    @GetMapping("/tasks")
    public String getTasks() {
        return "Here are your tasks!";
    }
}
