package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.FavoriteFoodForm;
@Controller
public class FavoriteFoodController {
    @PostMapping("/food/submit")
    public String submitFavoriteFood(@ModelAttribute FavoriteFoodForm form) {
        System.out.println("Favorite Food: " + form.getFoodName());
        return "favorite-food-confirmation";
    }
}
