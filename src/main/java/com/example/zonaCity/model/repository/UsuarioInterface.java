package com.example.zonaCity.model.repository;

import com.example.zonaCity.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioInterface extends JpaRepository<Usuario, Integer> {
}
