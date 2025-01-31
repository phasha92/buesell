package com.example.buesell.controllers;

import com.example.buesell.model.Product;
import com.example.buesell.services.ProductService;
import com.example.buesell.validator.DataValidator;
import com.example.buesell.validator.ValidRule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String product(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product) {

        if (
                !DataValidator.isValid(product.getTitle(), ValidRule.TITLE) ||
                        !DataValidator.isValid(product.getDescription(), ValidRule.DESCRIPTION) ||
                        !DataValidator.isValid(product.getPrice(), ValidRule.PRICE) ||
                        !DataValidator.isValid(product.getCity(), ValidRule.CITY)
        ) {
            return "product-create";
        }
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
