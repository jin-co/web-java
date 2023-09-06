package com.example.library.repository;

import com.example.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
