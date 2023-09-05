package com.example.library.controller;

import com.example.library.entity.Category;
import com.example.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public String getCategories(Model model) {
        List<Category> categories = categoryService.getCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }

    @GetMapping("/add")
    public String addCategory(Model model, Category categories) {
        model.addAttribute("categories", categories);
        return "add-category";
    }

    @GetMapping("/save")
    public String saveCategory(Model model, Category categories) {
        categoryService.addCategory(categories);
        return "redirect:/";
    }
}
