package com.example.zonaCity.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Unidades")
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numeroComun;
    private String matricula;

    @ManyToOne
    private Ruta ruta;
    @OneToMany(mappedBy = "unidad", cascade = CascadeType.ALL)
    private List<Ubicacion> ubicaciones;

    // getters y setters
}

