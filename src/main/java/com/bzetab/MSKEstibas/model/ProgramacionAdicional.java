package com.bzetab.MSKEstibas.model;

import com.bzetab.MSKEstibas.model.pk.ProgramacionAdicionalID;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Entity
@Table(name = "programacionplusadicional")
public class ProgramacionAdicional {
    @EmbeddedId
    private ProgramacionAdicionalID id;
    @Column(name = "monto", nullable = false)
    private BigDecimal monto;

    @ManyToOne
    @MapsId("idprogramacion")
    @JoinColumn(name = "idprogramacion")
    @JsonBackReference
    private Programacion programacion;

    @ManyToOne
    @MapsId("idtipoadicional")
    @JoinColumn(name = "idtipoadicional")
    @JsonBackReference
    private Tipoadicional tipoadicional;

}
