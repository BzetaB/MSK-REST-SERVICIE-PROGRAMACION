package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.model.ProgramacionAdicional;
import com.bzetab.MSKEstibas.model.pk.ProgramacionAdicionalID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramacionAdicionalRepository
        extends JpaRepository<ProgramacionAdicional, ProgramacionAdicionalID> {

    List<ProgramacionAdicional> findByProgramacion_Idprogramacion(Programacion idprogramacion);
}
