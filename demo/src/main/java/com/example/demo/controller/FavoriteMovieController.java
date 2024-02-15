package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FavoriteMovieController {
    @RequestMapping("/movie/show-favorite")
    public String showFavoriteMovie() {
        return "redirect:/favorite-movie";
    }
}
