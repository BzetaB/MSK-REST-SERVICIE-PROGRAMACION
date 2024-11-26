package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Estiba;

import java.util.List;

public interface EstibaImp {
    Estiba obtenerEstibaPorId(int id);
    Estiba obtenerEstibaPorNroDocumento(String nroDocumento);
    Estiba obtenerEstibaPorNombre(String nombre);
    List<Estiba> listarEstibas();
    Estiba guardarEstiba(Estiba estiba);
    Estiba actualizarEstiba(Estiba estiba);
    String eliminarEstiba(int idestiba);
}
