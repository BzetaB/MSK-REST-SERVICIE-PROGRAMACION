package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.repository.ProgramacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProgramacionService implements ProgramacionImp {

    private ProgramacionRepository programacionRepository;

    @Override
    public Programacion obtenerProgramacionPorId(int id) {
        return programacionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Programacion> listarProgramacion() {
        return programacionRepository.findAll();
    }

    @Override
    public Programacion guardarProgramacion(Programacion programacion) {
        return programacionRepository.save(programacion);
    }

    @Override
    public Programacion actualizarProgramacion(Programacion programacion) {
        Programacion updateProgramacion = this.obtenerProgramacionPorId(programacion.getIdprogramacion());
        updateProgramacion.setFecha(programacion.getFecha());
        updateProgramacion.setCuenta(programacion.getCuenta());
        updateProgramacion.setLugar(programacion.getLugar());
        updateProgramacion.setCoordenada(programacion.getCoordenada());
        updateProgramacion.setHora(programacion.getHora());
        updateProgramacion.setTipocontenedor(programacion.getTipocontenedor());
        updateProgramacion.setCantidadcontenedores(programacion.getCantidadcontenedores());
        updateProgramacion.setProductos(programacion.getProductos());
        updateProgramacion.setPagobase(programacion.getPagobase());
        updateProgramacion.setEstado(programacion.isEstado());

        return programacionRepository.save(updateProgramacion);
    }
    @Override
    public String eliminarProgramacion(int idprogramacion) {
        if (programacionRepository.existsById(idprogramacion)) {
            programacionRepository.deleteById(idprogramacion);
            return "Programacion eliminada";
        }
        return "No se encontró Programacion con el ID -> " + idprogramacion+".";
    }

}
