package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Estiba;
import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.repository.EstibaRepository;
import com.bzetab.MSKEstibas.repository.ProgramacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProgramacionService implements ProgramacionImp{

    private ProgramacionRepository programacionRepository;
    private EstibaRepository estibaRepository;

    @Override
    public Programacion obtenerProgramacionPorId(int idprogramacion) {
        return programacionRepository.findById(idprogramacion).orElse(null);
    }

    @Override
    public List<Programacion> listarProgramacion() {
        return programacionRepository.findAll();
    }

    @Override
    public List<Programacion> listarProgramacionPorNroDocumentoEstiba(String nroDocumento) {
        Estiba estiba = estibaRepository.findByNrodocumento(nroDocumento);
        return programacionRepository.findAllByEstiba_Nrodocumento(estiba.getNrodocumento());
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

        Estiba estiba = estibaRepository.findById(programacion.getEstiba().getIdestiba()).orElse(null);

        updateProgramacion.setEstiba(estiba);

        return programacionRepository.save(updateProgramacion);
    }

    @Override
    public String eliminarProgramacion(int idprogramacion) {
        if (programacionRepository.existsById(idprogramacion)) {
            programacionRepository.deleteById(idprogramacion);
            return "Programacion eliminada";
        }
        return "No se puede eliminar porque no se encuentra el ID "+idprogramacion+".";
    }
}
