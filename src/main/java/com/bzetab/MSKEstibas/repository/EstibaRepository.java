package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Estiba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstibaRepository
        extends JpaRepository<Estiba, Integer> {
}
