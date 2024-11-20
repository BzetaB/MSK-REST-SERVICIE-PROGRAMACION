package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.TipoAdicional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAdicionalRepository
        extends JpaRepository<TipoAdicional, Integer> {
}
