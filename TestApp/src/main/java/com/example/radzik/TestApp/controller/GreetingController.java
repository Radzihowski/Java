package com.example.radzik.TestApp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "I like pizza!";
    }
}
