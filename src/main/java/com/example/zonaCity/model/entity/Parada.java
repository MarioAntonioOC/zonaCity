package com.example.zonaCity.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Paradas")
public class Parada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "latitud", nullable = false)
    private Double latitud;
    @Column(name = "longitud", nullable = false)
    private Double longitud;
    @Column(name = "direccion", nullable = false)
    private String direccion;

    // getters y setters
    @Override
    public String toString() {
        return "Parada{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

