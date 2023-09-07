package com.example.library.controller;

import com.example.library.entity.Publisher;
import com.example.library.repository.PublisherRepository;
import com.example.library.service.PublisherService;
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
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("")
    public String getPublishers(Model model) {
        model.addAttribute("publishers", publisherService.getPublishers());
        return "publishers";
    }

    @GetMapping("/add")
    public String addPublisher(Model model, Publisher publisher) {
        return "add-publisher";
    }

    @PostMapping("/save")
    public String savePublisher(Model model, Publisher publisher, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-publisher";
        }
        publisherService.addPublisher(publisher);
        return "redirect:/publishers";
    }

    @GetMapping("/update/{id}")
    public String updatePublisher(Model model, @PathVariable Long id, Publisher publisher) {
        model.addAttribute("publisher", publisherService.getPublisher(id));
        return "update-publisher";
    }

    @PostMapping("/save/{id}")
    public String savePublisher(Model model, @PathVariable Long id, Publisher publisher, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "update-publisher";
        }
        publisherService.updatePublisher(publisher);
        return "redirect:/publishers";
    }

    @GetMapping("/remove/{id}")
    public String savePublisher(Model model, @PathVariable Long id) {
        publisherService.deletePublisher(id);
        return "redirect:/publishers";
    }
}
