package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private List<Category> categories = new ArrayList<>(List.of(
            new Category(1, "Beverages"),
            new Category(2, "Seafood"),
            new Category(17, "Snacks")
    ));

    @GetMapping
    public List<Category> getAllCategories() {
        return categories;
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categories.stream()
                .filter(c -> c.getCategoryId() == id)
                .findFirst()
                .orElse(null);
    }
}
