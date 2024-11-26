package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.ProgramacionQuincena;
import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.model.pk.ProgramacionQuincenaID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramacionQuincenaRepository
        extends JpaRepository<ProgramacionQuincena, ProgramacionQuincenaID> {
    List<ProgramacionQuincena> findAllByQuincena_Idquincena(Quincena idquincena);
}
