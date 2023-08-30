package com.example.thymeleaf.service;

import com.example.thymeleaf.entity.Author;
import com.example.thymeleaf.repository.AuthorRepository;
import com.example.thymeleaf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthor(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("No found"));
    }

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public void updateAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
