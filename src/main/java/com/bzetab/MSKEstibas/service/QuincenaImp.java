package com.bzetab.MSKEstibas.service;


import com.bzetab.MSKEstibas.model.Quincena;
import java.util.List;

public interface QuincenaImp {
    Quincena obtenerQuincenaPorId(int id);
    List<Quincena> listarQuincena();
    Quincena guardarQuincena(Quincena quincena);
    Quincena actualizarQuincena(Quincena quincena);
    String eliminarQuincena(int idquincena);
}
