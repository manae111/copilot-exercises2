package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.Product;
@Controller
public class ProductListController {
    @GetMapping("/listProducts")
    public String listProducts(Model model) {
        List<Product> products = Arrays.asList(
                new Product("Product 1", 100.0),
                new Product("Product 2", 200.0),
                new Product("Product 3", 300.0)
        );
        model.addAttribute("products", products);
        return "list-products";
    }
}
