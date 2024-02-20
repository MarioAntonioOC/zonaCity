package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioInterface extends JpaRepository<TipoUsuario, Integer> {
}
