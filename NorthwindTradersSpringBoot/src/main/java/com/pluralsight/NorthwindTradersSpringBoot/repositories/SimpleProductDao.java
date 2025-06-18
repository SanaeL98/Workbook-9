package com.pluralsight.NorthwindTradersSpringBoot.repositories;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        products.add(new Product(1, "Chai", 18.0, 39));
        products.add(new Product(2, "Chang", 19.0, 17));
        products.add(new Product(3, "Aniseed Syrup", 10.0, 13));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product add(Product product) {
        products.add(product);
        return product;
    }
}
