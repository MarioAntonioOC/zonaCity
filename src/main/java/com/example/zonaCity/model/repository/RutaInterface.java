package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutaInterface extends JpaRepository<Ruta,Integer> {
}
