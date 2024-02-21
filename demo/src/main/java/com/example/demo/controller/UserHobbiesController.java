package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserHobbiesController {

    @GetMapping("")
    public String showHobbiesForm() {
        return "user-hobbies-form";
    }

    @PostMapping("/submitHobbies")
    public String submitHobbies(@RequestParam String name, @RequestParam String hobbies, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("hobbies", hobbies.split(","));
        return "show-hobbies";
    }
}
