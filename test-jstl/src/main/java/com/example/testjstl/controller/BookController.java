package com.example.testjstl.controller;

import com.example.testjstl.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookController {

//    private final BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }

    @GetMapping()
    public String hello() {
        return "hello";
    }

    @GetMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", "bookService.getBooks()");
        return "book";
    }
}
