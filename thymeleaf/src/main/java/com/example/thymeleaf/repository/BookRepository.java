package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
