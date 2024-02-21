package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, HttpSession session) {
        session.setAttribute("username", username);
        return "redirect:/welcome-user";
    }
}
