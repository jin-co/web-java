package com.example.testjstl.service;

import com.example.testjstl.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface BookService {
    Collection<Book> getBooks();

    Book addBook(Book book);
}
