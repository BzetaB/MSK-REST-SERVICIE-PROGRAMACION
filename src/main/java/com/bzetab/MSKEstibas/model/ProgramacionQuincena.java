package com.bzetab.MSKEstibas.model;

import com.bzetab.MSKEstibas.model.pk.ProgramacionQuincenaID;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "programacionquincena")
public class ProgramacionQuincena {
    @EmbeddedId
    private ProgramacionQuincenaID id;

    @ManyToOne
    @MapsId("idprogramacion")
    @JoinColumn(name = "idprogramacion")
    @JsonBackReference
    private Programacion programacion;

    @ManyToOne
    @MapsId("idquincena")
    @JoinColumn(name = "idquincena")
    @JsonManagedReference
    private Quincena quincena;

}
