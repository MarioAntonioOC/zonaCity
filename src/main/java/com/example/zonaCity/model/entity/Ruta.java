package com.example.zonaCity.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Rutas")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "nombre_ruta", nullable = false)
    private String nombreRuta;

    @Override
    public String toString() {
        return "Ruta{id=" + id + ", nombreRuta='" + nombreRuta + "'}";
    }


    // getters y setters
}

