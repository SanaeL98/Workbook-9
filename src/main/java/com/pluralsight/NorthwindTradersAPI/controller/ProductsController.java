package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private List<Product> products = new ArrayList<>(List.of(
            new Product(1, "Chai", 1, 18.0),
            new Product(2, "Chang", 1, 19.0),
            new Product(5, "Ikura", 2, 31.0)
    ));

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.stream()
                .filter(p -> p.getProductId() == id)
                .findFirst()
                .orElse(null);
    }
}
