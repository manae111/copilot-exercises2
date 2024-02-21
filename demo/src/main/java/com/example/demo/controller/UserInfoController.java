package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserInfoController {
    @PostMapping("/submitUserInfo")
    public String submitUserInfo(@RequestParam("name") String name, @RequestParam("age") String age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "show-user-info";
    }
}
