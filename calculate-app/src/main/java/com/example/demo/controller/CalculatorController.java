package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator() {
        return "index"; // This refers to src/main/resources/templates/index.html
    }
}