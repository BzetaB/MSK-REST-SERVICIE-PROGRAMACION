package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.TipoAdicional;
import com.bzetab.MSKEstibas.repository.TipoAdicionalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TipoAdicionalService implements TipoAdicionalImp{
    private TipoAdicionalRepository tipoAdicionalRepository;

    @Override
    public TipoAdicional obtenerTipoAdicionalPorID(int idTipoAdicional) {
        return tipoAdicionalRepository.findById(idTipoAdicional).orElse(null);
    }

    @Override
    public TipoAdicional obtenerTipoAdicionalPorDescripcion(String descripcion) {
        return tipoAdicionalRepository.findByDescripcion(descripcion);
    }

    @Override
    public List<TipoAdicional> listarTipoAdicional() {
        return tipoAdicionalRepository.findAll();
    }

    @Override
    public TipoAdicional guardarTipoAdicional(TipoAdicional tipoAdicional) {
        return tipoAdicionalRepository.save(tipoAdicional);
    }

    @Override
    public TipoAdicional actualizarTipoAdicional(TipoAdicional tipoAdicional) {
        TipoAdicional updateTipoAdicional = this.obtenerTipoAdicionalPorID(tipoAdicional.getIdtipoadicional());
        updateTipoAdicional.setDescripcion(tipoAdicional.getDescripcion());
        return tipoAdicionalRepository.save(updateTipoAdicional);
    }

    @Override
    public String eliminarTipoAdicional(int idtipoadicional) {
        if(tipoAdicionalRepository.existsById(idtipoadicional)){
            tipoAdicionalRepository.deleteById(idtipoadicional);
            return "Tipo Adicional eliminado";
        }
        return "El tipo de adicional no se puede eliminar porque no se encuentra el ID -> "+ idtipoadicional+ ".";
    }
}
