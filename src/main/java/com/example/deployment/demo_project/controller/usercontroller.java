package com.example.deployment.demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class usercontroller {

    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }
}
