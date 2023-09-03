package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.entity.Category;
import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import com.example.library.service.CategoryService;
import com.example.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/book/{id}")
    public String getBook(Model model, @PathVariable Long id) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        return "book";
    }

    @GetMapping("/books/remove/{id}")
    public String deleteBook(Model model, @PathVariable Long id) {
        bookService.deleteBook(id);
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/books/update/{id}")
    public String updateBook(Model model, @PathVariable Long id) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        model.addAttribute("categories", categoryService.getCategories());
        model.addAttribute("authors", authorService.getAuthors());
        model.addAttribute("publishers", publisherService.getPublishers());
        return "update-book";
    }

    @PostMapping("/update/save/{id}")
    public String updateBook(Model model, @PathVariable Long id, Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "update-book";
        }
        bookService.updateBook(book);
        return "redirect:/books";
    }

    @GetMapping("/book/add")
    public String addBook(Model model, Book book) {
        model.addAttribute("categories", categoryService.getCategories());
        model.addAttribute("authors", authorService.getAuthors());
        model.addAttribute("publishers", publisherService.getPublishers());
        return "add-book";
    }

    @PostMapping("/book/added")
    public String saveBook(Model model, Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "add-book";
        }
        bookService.addBook(book);
        return "redirect:/books";
    }
}
