package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.ProgramacionQuincena;
import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.model.pk.ProgramacionQuincenaID;
import com.bzetab.MSKEstibas.repository.ProgramacionQuincenaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProgramacionQuincenaService implements ProgramacionQuincenaImp{

    private ProgramacionQuincenaRepository programacionQuincenaRepository;

    @Override
    public ProgramacionQuincena asignarProgramacionQuincena(ProgramacionQuincena programacionQuincena) {
        if(programacionQuincenaRepository.existsById(programacionQuincena.getId())){
            throw new IllegalArgumentException("La programación ya exisste en la quincena");
        }
        return programacionQuincenaRepository.save(programacionQuincena);
    }

    @Override
    public List<ProgramacionQuincena> listarProgramacionesDeQuincena(Quincena idquincena) {
        return programacionQuincenaRepository.findAllByQuincena_Idquincena(idquincena);
    }

    @Override
    public String eliminarProgramacionQuincena(ProgramacionQuincenaID programacionQuincenaID) {
        if (programacionQuincenaRepository.existsById(programacionQuincenaID)) {
            programacionQuincenaRepository.deleteById(programacionQuincenaID);
            return "Programacion eliminada de la quincena";
        }
        return "No se puede eliminar la programacion porque no se encuentra el ID";
    }
}
