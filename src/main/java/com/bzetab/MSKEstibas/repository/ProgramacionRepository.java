package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramacionRepository
        extends JpaRepository<Programacion, Integer> {
    List<Programacion> findAllByEstiba_Nrodocumento(String nrodocumento);
}
