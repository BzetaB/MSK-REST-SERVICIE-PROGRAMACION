package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Asistencia;

import java.util.List;

public interface AsistenciaImp {
    Asistencia obtenerAsistenciaPorId(int id);
    Asistencia obtenerAsistenciaPorPuntualidad(boolean puntualidad);
    List<Asistencia> listarAsistencias();
    Asistencia guardarAsistencia(Asistencia asistencia);
    Asistencia actualizarAsistencia(Asistencia asistencia);
    String eliminarAsistencia(int idasistencia);
}
