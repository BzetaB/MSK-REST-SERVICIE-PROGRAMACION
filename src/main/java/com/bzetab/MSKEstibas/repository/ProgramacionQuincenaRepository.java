package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.ProgramacionQuincena;
import com.bzetab.MSKEstibas.model.pk.ProgramacionQuincenaID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramacionQuincenaRepository
        extends JpaRepository<ProgramacionQuincena, ProgramacionQuincenaID> {
}
