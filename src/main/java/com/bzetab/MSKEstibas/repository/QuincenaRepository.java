package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Quincena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuincenaRepository
        extends JpaRepository<Quincena, Integer> {
}
