package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.repository.QuincenaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class QuincenaService implements QuincenaImp {

    private QuincenaRepository quincenaRepository;

    @Override
    public Quincena obtenerQuincenaPorId(int id) {
        return quincenaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Quincena> listarQuincena() {
        return quincenaRepository.findAll();
    }

    @Override
    public Quincena guardarQuincena(Quincena quincena) {
        return quincenaRepository.save(quincena);
    }

    @Override
    public Quincena actualizarQuincena(Quincena quincena) {
        Quincena updateQuincena = this.obtenerQuincenaPorId(quincena.getIdquincena());
        updateQuincena.setDiainicio(quincena.getDiainicio());
        updateQuincena.setDiafin(quincena.getDiafin());
        updateQuincena.setTotalganado(quincena.getTotalganado());

        return quincenaRepository.save( updateQuincena);
    }

    @Override
    public String eliminarQuincena(int idquincena) {
        if (quincenaRepository.existsById(idquincena)) {
            quincenaRepository.deleteById(idquincena);
            return "Quincena eliminada";
        }
        return "No se encontró el Quincena con el ID -> " + idquincena+".";
    }

}
