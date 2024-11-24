package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.ProgramacionQuincena;
import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.model.pk.ProgramacionQuincenaID;

import java.util.List;

public interface ProgramacionQuincenaImp {
    ProgramacionQuincena asignarProgramacionQuincena(ProgramacionQuincena programacionQuincena);
    List<ProgramacionQuincena> listarProgramacionesDeQuincena(Quincena idquincena);
    String eliminarProgramacionQuincena(ProgramacionQuincenaID programacionQuincenaID);
}
