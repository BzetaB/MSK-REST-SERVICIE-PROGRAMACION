package com.bzetab.MSKEstibas.service;

import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.repository.QuincenaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class QuincenaService implements QuincenaImp{

    private QuincenaRepository quincenaRepository;

    @Override
    public Quincena obtenerQuincenaPorID(int idquincena) {
        return quincenaRepository.findById(idquincena).orElse(null);
    }

    @Override
    public List<Quincena> listarQuincenas() {
        return quincenaRepository.findAll();
    }

    @Override
    public List<Quincena> listarQuicenaPorDiaIncicioYDiaFin(LocalDate diainicio, LocalDate diafin) {
        return quincenaRepository.findAllByDiainicioAndDiafin(diainicio,diafin);
    }

    @Override
    public Quincena guardarQuincena(Quincena quincena) {
        return quincenaRepository.save(quincena);
    }

    @Override
    public Quincena actualizarQuincena(Quincena quincena) {
        Quincena updateQuincena = this.obtenerQuincenaPorID(quincena.getIdquincena());
        updateQuincena.setDiainicio(quincena.getDiainicio());
        updateQuincena.setDiafin(quincena.getDiafin());
        updateQuincena.setTotalganado(quincena.getTotalganado());
        return this.guardarQuincena(updateQuincena);
    }

    @Override
    public String eliminarQuincena(int idquincena) {
        if (quincenaRepository.existsById(idquincena)) {
            quincenaRepository.deleteById(idquincena);
            return "Quincena eliminada";
        }
        return "No se puede eliminar la quincena porque no se encuentra el ID";
    }
}
