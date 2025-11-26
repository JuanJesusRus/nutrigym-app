package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JesusController {
    
     @GetMapping("/jesus")
    public String saludo() {
        return "Hola, soy Jesús y este es mi controlador";
    }
}
