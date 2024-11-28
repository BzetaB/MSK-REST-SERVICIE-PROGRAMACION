package com.bzetab.MSKEstibas.controller;

import com.bzetab.MSKEstibas.model.Programacion;
import com.bzetab.MSKEstibas.service.EstibaImp;
import com.bzetab.MSKEstibas.service.ProgramacionImp;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programacion")
@AllArgsConstructor
public class ProgramacionController {

    private ProgramacionImp programacionImp;
    private EstibaImp estibaImp;

    @GetMapping("/id/{idprogramacion}")
    public ResponseEntity<Programacion> obtenerProgramacionPorId(int idprogramacion){
        Programacion programacion = programacionImp.obtenerProgramacionPorId(idprogramacion);
        return ResponseEntity.ok(programacion);
    }

    @GetMapping("/programacion-estiba/{nrodocumento}") //este nos permitirá buscar las programaciones de los estibas por su DNI/CI
    public ResponseEntity<List<Programacion>>listarProgramacionPorEstibaNroDocumento(@PathVariable("nrodocumento") String nrodocumento){
        List<Programacion> programaciones = programacionImp.listarProgramacionPorNroDocumentoEstiba(nrodocumento);
        return ResponseEntity.ok(programaciones);
    }

    @GetMapping("")
    public ResponseEntity<List<Programacion>>listarProgramaciones(){
        List<Programacion> lista = programacionImp.listarProgramacion();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<Programacion> insertarProgramacion(@RequestBody Programacion programacion){
        Programacion programacionInsertar = programacionImp.guardarProgramacion(programacion);
        return ResponseEntity.ok(programacionInsertar);
    }

    @PutMapping("/{idprogramacion}")
    public ResponseEntity<Programacion> updateProgramacion(@PathVariable("idprogramacion")int idprogramacion,@RequestBody Programacion programacion){
        programacion = programacionImp.actualizarProgramacion(programacion);
        return ResponseEntity.ok(programacion);
    }

    @DeleteMapping("/{idprogramacion}")
    public ResponseEntity<String> eliminarProgramacion(@PathVariable("idprogramacion") int idprogramacion){
        String programacionEliminar = programacionImp.eliminarProgramacion(idprogramacion);
        return ResponseEntity.ok(programacionEliminar);
    }

}
