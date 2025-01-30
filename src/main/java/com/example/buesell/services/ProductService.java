package com.example.buesell.services;

import com.example.buesell.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private long id = 0L;

    @Getter
    private final List<Product> products = new ArrayList<>();

    {
        products.add(new Product(++id, "title1", "description1", 100, "city1", "author1"));
        products.add(new Product(++id, "title2", "description2", 200, "city2", "author2"));
        products.add(new Product(++id, "title3", "description3", 300, "city3", "author3"));

    }

    public void saveProduct(Product product) {
        if (product.getId() == null) {
            product.setId(++id);
        }
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}