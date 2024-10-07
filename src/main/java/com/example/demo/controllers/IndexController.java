package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    static final String TEXT = "Spring Boot Application";

    @GetMapping("/")
    public String index() {
        return TEXT;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return getGreeting(name);
    }

    public static String getGreeting(String name) {
        return "Hello " + name + "!";
    }

}
