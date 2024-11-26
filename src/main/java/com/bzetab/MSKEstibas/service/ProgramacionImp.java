package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Programacion;
import java.util.Date;
import java.util.List;

public interface ProgramacionImp {
    Programacion obtenerProgramacionPorId(int id);
    List<Programacion> listarProgramacion();
    Programacion guardarProgramacion(Programacion programacion);
    Programacion actualizarProgramacion(Programacion programacion);
    String eliminarProgramacion(int idprogramacion);
}
