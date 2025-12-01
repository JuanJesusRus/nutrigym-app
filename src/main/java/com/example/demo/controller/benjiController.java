package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class benjiController {
    @GetMapping("/benji")
    public String hola(){
        return "Soy Benjamin, un saludo cordial.";
    }
}
