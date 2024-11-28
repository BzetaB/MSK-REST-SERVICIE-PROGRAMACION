package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.model.ProgramacionAdicional;
import com.bzetab.MSKEstibas.model.pk.ProgramacionAdicionalID;
import com.bzetab.MSKEstibas.repository.ProgramacionAdicionalRepository;
import com.bzetab.MSKEstibas.repository.ProgramacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ProgramacionAdicionalService implements ProgramacionAdicionalImp{

    private ProgramacionAdicionalRepository programacionAdicionalRepository;
    private ProgramacionRepository programacionRepository;

    @Override
    public ProgramacionAdicional asignarAdicionalAProgramacion(ProgramacionAdicional programacionAdicional) {
        if(programacionAdicionalRepository.existsById(programacionAdicional.getId())){
            throw new IllegalArgumentException("El adicional ya existe en la programación");
        }
        return programacionAdicionalRepository.save(programacionAdicional);
    }

    @Override
    public List<ProgramacionAdicional> listarAdicionalesDeProgramacion(Programacion idprogramacion) {
        return programacionAdicionalRepository.findByProgramacion_Idprogramacion(idprogramacion);
    }

    @Override
    public ProgramacionAdicional actualizarAdicionalesAProgramacion(ProgramacionAdicional programacionAdicional) {
        ProgramacionAdicional updateProgramacionAdicional = programacionAdicionalRepository.findById(programacionAdicional.getId())
                .orElseThrow(() -> new NoSuchElementException("No se encontró una relacion entre la programacion y el adicional"));
        updateProgramacionAdicional.setMonto(programacionAdicional.getMonto());
        return programacionAdicionalRepository.save(updateProgramacionAdicional);
    }

    @Override
    public String elimnarAdicionalesDeProgramacion(ProgramacionAdicionalID programacionAdicionalID) {
        if (programacionAdicionalRepository.existsById(programacionAdicionalID)) {
            programacionAdicionalRepository.deleteById(programacionAdicionalID);
            return "Adicional eliminado";
        }
        return "No se puede eliminar porque no se encuentra el ID";
    }
}
