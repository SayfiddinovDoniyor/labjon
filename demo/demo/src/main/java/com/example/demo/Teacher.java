package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teacher {
    private String name = "August";
    private String subject= "Atrofimizdagi olam";
    @GetMapping("/teacher")
    public String getTeacher () {
        return "Teacher: " + name + ", Subject: " + subject; }

}