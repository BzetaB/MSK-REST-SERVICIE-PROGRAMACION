package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository
        extends JpaRepository<Asistencia, Integer> {
    Asistencia findByPuntualidad(boolean puntualidad);
}
