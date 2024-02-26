package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.ParadaRuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParadaRutaRepository extends JpaRepository<ParadaRuta, Integer> {
    List<ParadaRuta> findByRutaId(Integer idRuta);
}
