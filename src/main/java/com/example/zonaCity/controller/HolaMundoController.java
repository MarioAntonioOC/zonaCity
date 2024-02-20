package com.example.zonaCity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "¡Hola Mundo!";
    }
}
