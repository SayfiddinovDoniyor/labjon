package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Course {
    private String title = "Computer science";
    private double duration = 2;

    @GetMapping("/course")
    public String getcourse () {
        return "Title: " + title + ", Duration: " + duration; }


}
