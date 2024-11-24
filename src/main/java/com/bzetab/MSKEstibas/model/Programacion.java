package com.bzetab.MSKEstibas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "programacion")
public class Programacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprogramacion;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "cuenta", nullable = false)
    private String cuenta;
    @Column(name = "lugar", nullable = false)
    private String lugar;
    @Column(name = "coordenada", nullable = false)
    private String coordenada;
    @Column(name = "hora", nullable = false)
    private Time hora;
    @Column(name = "tipocontenedor", nullable = false)
    private String tipocontenedor;
    @Column(name = "cantidadcontenedores", nullable = false)
    private int cantidadcontenedores;
    @Column(name = "productos")
    private String productos;
    @Column(name = "pagobase", nullable = false)
    private BigDecimal pagobase;
    @Column(name = "estado", nullable = false)
    private boolean estado;
}
