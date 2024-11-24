package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Estiba;
import com.bzetab.MSKEstibas.repository.EstibaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class EstibaService implements EstibaImp{

    private EstibaRepository estibaRepository;

    @Override
    public Estiba obtenerEstibaPorId(int id) {
        return estibaRepository.findById(id).orElse(null);
    }

    @Override
    public Estiba obtenerEstibaPorNroDocumento(String nrodocumento) {
        return estibaRepository.findByNrodocumento(nrodocumento);
    }

    @Override
    public Estiba obtenerEstibaPorNombre(String nombre) {
        return estibaRepository.findByNombre(nombre);
    }

    @Override
    public List<Estiba> listarEstibas() {
        return estibaRepository.findAll();
    }

    @Override
    public Estiba guardarEstiba(Estiba estiba) {
        return estibaRepository.save(estiba);
    }

    @Override
    public Estiba actualizarEstiba(Estiba estiba) {
        Estiba updateEstiba = this.obtenerEstibaPorId(estiba.getIdestiba());
        updateEstiba.setDocumento(estiba.isDocumento());
        updateEstiba.setNrodocumento(estiba.getNrodocumento());
        updateEstiba.setNombre(estiba.getNombre());
        updateEstiba.setApellido(estiba.getApellido());
        updateEstiba.setEdad(estiba.getEdad());
        updateEstiba.setTelefono(estiba.getTelefono());
        return estibaRepository.save(updateEstiba);
    }

    @Override
    public String eliminarEstiba(Estiba estiba) {
        if (estibaRepository.existsById(estiba.getIdestiba())) {
            estibaRepository.deleteById(estiba.getIdestiba());
            return "Estiba eliminada";
        }
        return "No se encontró el estiba con el ID -> " + estiba.getIdestiba()+".";
    }
}
