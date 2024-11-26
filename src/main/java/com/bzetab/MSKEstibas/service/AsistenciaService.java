package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Asistencia;
import com.bzetab.MSKEstibas.repository.AsistenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AsistenciaService implements AsistenciaImp {

    private AsistenciaRepository asistenciaRepository;

    @Override
    public Asistencia obtenerAsistenciaPorId(int id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia obtenerAsistenciaPorPuntualidad(boolean puntualidad) {
        return asistenciaRepository.findByPuntualidad(puntualidad);
    }

    @Override
    public List<Asistencia> listarAsistencias() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia guardarAsistencia(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia actualizarAsistencia(Asistencia asistencia) {
        Asistencia updateAsistencia = this.obtenerAsistenciaPorId(asistencia.getIdasistencia());
        updateAsistencia.setHorallegada(asistencia.getHorallegada());
        updateAsistencia.setPuntualidad(asistencia.isPuntualidad());
        return asistenciaRepository.save(updateAsistencia);
    }

    @Override
    public String eliminarAsistencia(int idasistencia) {
        if(asistenciaRepository.existsById(idasistencia)) {
            asistenciaRepository.deleteById(idasistencia);
            return "Registro eliminado";
        }else{
            throw new RuntimeException("No se puede eliminar el registro porque no se encuentra el ID -> " + idasistencia + ".");
        }
    }
}
