package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.Parada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParadaRepository extends JpaRepository<Parada,Integer> {
}
