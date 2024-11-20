package com.bzetab.MSKEstibas.model.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ProgramacionQuincenaID implements Serializable {
    private int idprogramacion;
    private int idquincena;
}
