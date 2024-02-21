package com.example.zonaCity.model.repository;


import com.example.zonaCity.model.entity.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad,Integer> {
}
