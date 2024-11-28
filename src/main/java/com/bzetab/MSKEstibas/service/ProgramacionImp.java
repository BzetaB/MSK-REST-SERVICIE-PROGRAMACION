package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Programacion;

import java.util.List;

public interface ProgramacionImp {
    Programacion obtenerProgramacionPorId(int idprogramacion);
    List<Programacion> listarProgramacion();
    List<Programacion> listarProgramacionPorNroDocumentoEstiba(String nroDocumento);
    Programacion guardarProgramacion(Programacion programacion);
    Programacion actualizarProgramacion(Programacion programacion);
    String eliminarProgramacion(int idprogramacion);
}
