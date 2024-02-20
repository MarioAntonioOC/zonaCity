package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.ParadaRuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParadaRutaInterface extends JpaRepository<ParadaRuta, Integer> {
}
