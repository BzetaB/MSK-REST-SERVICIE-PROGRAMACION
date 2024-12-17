package com.bzetab.MSKEstibas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "quincena")
public class Quincena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idquincena;
    @Column(name = "diainicio", nullable = false)
    private LocalDate diainicio;
    @Column(name = "diafin", nullable = false)
    private LocalDate diafin;
    @Column(name = "totalganado")
    private BigDecimal totalganado;
}
