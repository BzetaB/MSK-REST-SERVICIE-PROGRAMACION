package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.model.ProgramacionAdicional;
import com.bzetab.MSKEstibas.model.pk.ProgramacionAdicionalID;

import java.util.List;

public interface ProgramacionAdicionalImp {
    ProgramacionAdicional asignarAdicionalAProgramacion(ProgramacionAdicional programacionAdicional);
    List<ProgramacionAdicional> listarAdicionalesDeProgramacion(Programacion idprogramacion);
    ProgramacionAdicional actualizarAdicionalesAProgramacion(ProgramacionAdicional programacionAdicional);
    String elimnarAdicionalesDeProgramacion(ProgramacionAdicionalID programacionAdicionalID);
}
