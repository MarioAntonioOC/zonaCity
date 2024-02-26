package com.example.zonaCity.controller;

import com.example.zonaCity.model.entity.Parada;
import com.example.zonaCity.model.entity.ParadaRuta;
import com.example.zonaCity.model.entity.Ruta;
import com.example.zonaCity.service.ParadaService;
import com.example.zonaCity.service.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HolaMundoController {
    @Autowired
    RutaService rutaService;
    @Autowired
    ParadaService paradaService;
    @Autowired



    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "¡Hola Mundo!";
    }
    @GetMapping("/todasRutas")
    public ResponseEntity<List<Ruta>> TodasRutas() {
        List<Ruta> rutas = rutaService.todasLasRutas();
        for (Ruta ruta : rutas) {
            System.out.println("Ruta: " + ruta.toString());
        }
        return ResponseEntity.ok(rutas);
    }
    @GetMapping("/todasParadas")
    public ResponseEntity<List<Parada>> TodasParadas() {
        List<Parada> paradas = paradaService.todasLasParadas();
        for (Parada parada : paradas) {
            System.out.println("Parada: " + parada.toString());
        }
        return ResponseEntity.ok(paradas);
    }
    @GetMapping("/por-ruta/{idRuta}")
    public ResponseEntity<List<Parada>> getParadasPorRuta(@PathVariable Integer idRuta) {
        List<Parada> paradasPorRuta = rutaService.obtenerParadasPorRuta(idRuta);
        for (Parada parada: paradasPorRuta) {
            System.out.println(parada.toString());
        }
        System.out.println(paradasPorRuta.size());
        return ResponseEntity.ok(paradasPorRuta);
    }

}
