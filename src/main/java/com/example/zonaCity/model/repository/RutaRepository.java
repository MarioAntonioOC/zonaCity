package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RutaRepository extends JpaRepository<Ruta,Integer> {
    @Query("select a.id, a.nombreRuta from Ruta a ")
    List<Ruta> todasLasRutas();
}
