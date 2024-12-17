package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Quincena;

import java.time.LocalDate;
import java.util.List;

public interface QuincenaImp {
    Quincena obtenerQuincenaPorID(int idquincena);
    List<Quincena> listarQuincenas();
    List<Quincena> listarQuicenaPorDiaIncicioYDiaFin(LocalDate diainicio, LocalDate diafin);
    Quincena guardarQuincena(Quincena quincena);
    Quincena actualizarQuincena(Quincena quincena);
    String eliminarQuincena(int idquincena);
}
