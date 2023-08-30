package com.example.library.service;

import com.example.library.entity.Publisher;
import com.example.library.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher getPublisher(Long id) {
        return publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("No found"));
    }

    public void addPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        publisherRepository.deleteById(id);
    }
}
