package com.example.testjstl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/")
    public String getBooks(Model model) {
        model.addAttribute("book", "book");
        return "book";
    }
}
