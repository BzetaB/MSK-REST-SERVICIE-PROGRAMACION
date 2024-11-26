package com.bzetab.MSKEstibas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
@Getter
@Setter
@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idasistencia;
    @Column(name = "horallegada", nullable = false)
    private Time horallegada;
    @Column(name = "puntualidad", nullable = false)
    private boolean puntualidad;

    @ManyToOne
    @JoinColumn(name="idprogramacion")
    private Programacion programacion;
}
