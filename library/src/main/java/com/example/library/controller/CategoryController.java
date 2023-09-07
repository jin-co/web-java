package com.example.library.controller;

import com.example.library.entity.Category;
import com.example.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public String saveCategory(Model model, Category categories, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-category";
        }
        categoryService.addCategory(categories);
        return "redirect:/categories";
    }

    @GetMapping("/update/{id}")
    public String updateCategory(@PathVariable Long id, Model model, Category category) {
        Category categoryFound = categoryService.getCategory(id);
        model.addAttribute("category", categoryFound);
        return "update-category";
    }

    @PostMapping("/save/{id}")
    public String updateSaveCategory(@PathVariable Long id, Model model, Category category, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "update-category";
        }
        categoryService.updateCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/remove/{id}")
    public String removeCategory(@PathVariable Long id, Model model) {
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }
}
