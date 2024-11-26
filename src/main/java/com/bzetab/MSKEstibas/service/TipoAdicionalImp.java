package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.TipoAdicional;

import java.util.List;

public interface TipoAdicionalImp {
    TipoAdicional obtenerTipoAdicionalPorID(int idTipoAdicional);
    TipoAdicional obtenerTipoAdicionalPorDescripcion(String descripcion);
    List<TipoAdicional> listarTipoAdicional();
    TipoAdicional guardarTipoAdicional(TipoAdicional tipoAdicional);
    TipoAdicional actualizarTipoAdicional(TipoAdicional tipoAdicional);
    String eliminarTipoAdicional(int idtipoadicional);
}
