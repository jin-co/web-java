package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
