package com.bzetab.MSKEstibas.repository;

import com.bzetab.MSKEstibas.model.Estiba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstibaRepository
        extends JpaRepository<Estiba, Integer> {
    Estiba findByNrodocumento(String nrodocumento);
    Estiba findByNombre(String nombre);
    Estiba findByNrodocumentoAndContrasenia(String nrodocumento, String contrasenia);
}
