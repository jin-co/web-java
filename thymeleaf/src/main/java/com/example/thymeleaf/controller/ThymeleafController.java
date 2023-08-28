package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class ThymeleafController {

    @GetMapping("/home")
    public String homeMain(Model model) {
        model.addAttribute("name", "dynamic");
        return "home";
    }
}
