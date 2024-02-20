package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorInterface extends JpaRepository<Conductor, Integer> {
}
