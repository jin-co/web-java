package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
