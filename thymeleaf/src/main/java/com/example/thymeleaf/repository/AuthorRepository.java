package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
