package com.bzetab.MSKEstibas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
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
    private Date diainicio;
    @Column(name = "diafin", nullable = false)
    private Date diafin;
    @Column(name = "totalganado")
    private BigDecimal totalganado;
}
