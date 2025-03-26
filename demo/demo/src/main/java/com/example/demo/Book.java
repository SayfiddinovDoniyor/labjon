package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Book {
    private String titl = "The little prince";
    private String author= "Antoan De-Sente-Exupery";
    private int price = 50000;

    @GetMapping("/book")
    public String bookget () {
        return "Title of book: " + titl + ", price is : " + price; }
}
