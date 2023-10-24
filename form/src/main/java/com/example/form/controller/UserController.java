package com.example.form.controller;

import com.example.form.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Value("${genders}")
    private List<String> genders;

    @Value("${levels}")
    private List<String> levels;

    @Value("${hobbies}")
    private List<String> hobbies;

    @GetMapping("/userForm")
    public String displayForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        model.addAttribute("genders", genders);
        model.addAttribute("levels", levels);
        model.addAttribute("hobbies", hobbies);
        return "user-form";
    }

    @PostMapping("/showResult")
    public String showResult(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        System.out.println("bindingResult = " + bindingResult.toString());
        return "user-confirmation";
    }
}
