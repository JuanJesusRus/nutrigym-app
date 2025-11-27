package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JesusController {
    
     @GetMapping("/jesus")
    public String saludo() {
        return "Hola, somos el Grupo E y queremos saludar a la clase";
    }
}
