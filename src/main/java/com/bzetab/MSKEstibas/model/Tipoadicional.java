package com.bzetab.MSKEstibas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipoadicional")
public class Tipoadicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipoadicional;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}
