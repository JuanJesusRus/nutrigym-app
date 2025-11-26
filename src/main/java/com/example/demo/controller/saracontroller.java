package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saracontroller {
    @GetMapping("/sara")
    public String inicio(){
        return "soy sara y esta es mi rama";
    }
}
