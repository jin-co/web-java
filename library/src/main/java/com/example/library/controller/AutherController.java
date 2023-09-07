package com.example.library.controller;

import com.example.library.entity.Author;
import com.example.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AutherController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorService.getAuthors());
        return "authors";
    }

    @GetMapping("/add")
    public String addAuthor(Model model, Author author) {
        return "add-author";
    }

    @PostMapping("/save")
    public String saveAuthor(Model model, Author author, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-author";
        }
        authorService.addAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/update/{id}")
    public String updateAuthor(Model model, @PathVariable Long id, Author author) {
        model.addAttribute("author", authorService.getAuthor(id));
        return "update-author";
    }

    @PostMapping("/save/{id}")
    public String saveAuthor(Model model, @PathVariable Long id, Author author, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "update-author";
        }
        authorService.updateAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/remove/{id}")
    public String removeAuthor(Model model, @PathVariable Long id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }
}
