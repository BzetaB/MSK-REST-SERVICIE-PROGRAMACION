package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Quincena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface QuincenaRepository
        extends JpaRepository<Quincena, Integer> {
    List<Quincena> findAllByDiainicioAndDiafin(LocalDate diainicio, LocalDate diafin);
}
