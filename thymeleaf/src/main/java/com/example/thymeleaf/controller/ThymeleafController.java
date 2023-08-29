package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/home")
    public String homeMain(Model model) {
        model.addAttribute("name", "dynamic");
        model.addAttribute("elvis", false);
        List<Integer> list = List.of(1, 2, 3);
        model.addAttribute("iteration", list);
        return "home";
    }
}
