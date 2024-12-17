package com.bzetab.MSKEstibas.controller;

import com.bzetab.MSKEstibas.model.Quincena;
import com.bzetab.MSKEstibas.service.QuincenaImp;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/quincena")
public class QuincenaController {

    private QuincenaImp quincenaImp;

    @GetMapping("/{idquincena}")
    public ResponseEntity<Quincena> obtenerQuincenaPorID(@PathVariable("idquincena") int idquincena){
        Quincena quincena = quincenaImp.obtenerQuincenaPorID(idquincena);
        return ResponseEntity.ok(quincena);
    }

    @GetMapping("")
    public ResponseEntity<List<Quincena>> obtenerQuincenas(){
        List<Quincena> quincenas = quincenaImp.listarQuincenas();
        return ResponseEntity.ok(quincenas);
    }


    @GetMapping("/buscar-fechas")
    public ResponseEntity<List<Quincena>> listarQuincenasPorFechas(
            @RequestParam("diainicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate diainicio,
            @RequestParam("diafin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate diafin){
        List<Quincena> quincenas = quincenaImp.listarQuicenaPorDiaIncicioYDiaFin(diainicio, diafin);
        return ResponseEntity.ok(quincenas);
    }

    @PostMapping
    public ResponseEntity<Quincena> createQuincena(@RequestBody Quincena quincena){
        quincena = quincenaImp.guardarQuincena(quincena);
        return ResponseEntity.ok(quincena);
    }

    @PutMapping("/{idquincena}")
    public ResponseEntity<Quincena> updateQuincena(@RequestBody Quincena quincena, @PathVariable("idquincena") int idquincena){
        quincena = quincenaImp.actualizarQuincena(quincena);
        return ResponseEntity.ok(quincena);
    }

    @DeleteMapping("/{idquincena}")
    public ResponseEntity<String> deleteQuincena(@PathVariable("idquincena") int idquincena){
        String quincenaEliminada = quincenaImp.eliminarQuincena(idquincena);
        return ResponseEntity.ok(quincenaEliminada);
    }
}
