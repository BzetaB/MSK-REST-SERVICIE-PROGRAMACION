package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.ProgramacionAdicional;
import com.bzetab.MSKEstibas.model.pk.ProgramacionAdicionalID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramacionAdicionalRepository
        extends JpaRepository<ProgramacionAdicional, ProgramacionAdicionalID> {
}
