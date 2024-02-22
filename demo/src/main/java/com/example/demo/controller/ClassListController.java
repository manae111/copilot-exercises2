package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.Clazz;
import com.example.demo.repository.ClassRepository;

@Controller
public class ClassListController {
    @Autowired
    private ClassRepository classRepository;

    @GetMapping("/classes")
    public String listClasses(Model model) {
        List<Clazz> classes = classRepository.findAll();
        model.addAttribute("classes", classes);
        return "list-classes";
    }
}