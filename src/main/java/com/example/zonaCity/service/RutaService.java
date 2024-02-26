package com.example.zonaCity.service;

import com.example.zonaCity.model.entity.Parada;
import com.example.zonaCity.model.entity.Ruta;

import java.util.List;

public interface RutaService {
    List<Ruta> todasLasRutas() ;
    List<Parada> obtenerParadasPorRuta(Integer idRuta);
}
