package com.bzetab.MSKEstibas.repository;


import com.bzetab.MSKEstibas.model.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramacionRepository
        extends JpaRepository<Programacion, Integer> {

}
