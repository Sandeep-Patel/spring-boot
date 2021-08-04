package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThisWillActuallyRun {

    @GetMapping("/hi")
    String home() {
        return "Hello, World!";
    }

}