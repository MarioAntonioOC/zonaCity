package com.example.zonaCity.service;

import com.example.zonaCity.model.entity.Parada;
import com.example.zonaCity.model.repository.ParadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParadaServiceImpl implements ParadaService {

    @Autowired
    ParadaRepository paradaRepository;

    @Override
    public List<Parada> todasLasParadas() {
        return paradaRepository.findAll();
    }
}
