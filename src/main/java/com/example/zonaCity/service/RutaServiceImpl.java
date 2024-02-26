package com.example.zonaCity.service;

import com.example.zonaCity.model.entity.Parada;
import com.example.zonaCity.model.entity.ParadaRuta;
import com.example.zonaCity.model.entity.Ruta;
import com.example.zonaCity.model.repository.ParadaRutaRepository;
import com.example.zonaCity.model.repository.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RutaServiceImpl implements RutaService {

    @Autowired
    RutaRepository rutaRepository;
    @Autowired
    private ParadaRutaRepository paradaRutaRepository;

    @Override
    public List<Ruta> todasLasRutas() {
        return rutaRepository.findAll();
    }

    @Override
    public List<Parada> obtenerParadasPorRuta(Integer idRuta) {
        List<ParadaRuta> paradasRuta = paradaRutaRepository.findByRutaId(idRuta);
        List<Parada> paradas = new ArrayList<>();
        for (ParadaRuta pr : paradasRuta) {
            paradas.add(pr.getParada());
        }
        return paradas;
    }
}
