package com.bzetab.MSKEstibas.controller;

import com.bzetab.MSKEstibas.model.TipoAdicional;
import com.bzetab.MSKEstibas.service.TipoAdicionalImp;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/tipoadicional")
public class TipoAdicionalController {

    private TipoAdicionalImp tipoAdicionalImp;

    @GetMapping("/id/{idtipoadicional}")
    public ResponseEntity<TipoAdicional>obtenerTipoAdicionalPorID(@PathVariable("idtipoadicional") int idtipoadicional){
        TipoAdicional tipoAdicional = tipoAdicionalImp.obtenerTipoAdicionalPorID(idtipoadicional);
        return ResponseEntity.ok(tipoAdicional);
    }

    @GetMapping("/descripcion/{descipcion}")
    public ResponseEntity<TipoAdicional>obtenerTipoAdicionalPorDescripcion(@PathVariable("descipcion") String descripcion){
        TipoAdicional tipoAdicional = tipoAdicionalImp.obtenerTipoAdicionalPorDescripcion(descripcion);
        return ResponseEntity.ok(tipoAdicional);
    }

    @GetMapping("")
    public ResponseEntity<List<TipoAdicional>>obtenerTipoAdicionales(){
        List<TipoAdicional> adicionales = tipoAdicionalImp.listarTipoAdicional();
        return ResponseEntity.ok(adicionales);
    }

    @PostMapping
    public ResponseEntity<TipoAdicional> agregarTipoAdicional(@RequestBody TipoAdicional tipoAdicional){
        TipoAdicional nuevoTipoAdicional = tipoAdicionalImp.guardarTipoAdicional(tipoAdicional);
        return ResponseEntity.ok(nuevoTipoAdicional);
    }

    @PutMapping("/{idtipoadicional}")
    public ResponseEntity<TipoAdicional> actualizarTipoAdicional(@PathVariable("idtipoadicional") int idtipoadicional, @RequestBody TipoAdicional tipoAdicional){
        TipoAdicional tipoAdicionalupdate = tipoAdicionalImp.actualizarTipoAdicional(tipoAdicional);
        return ResponseEntity.ok(tipoAdicionalupdate);
    }

    @DeleteMapping("/{idtipoadicional}")
    public ResponseEntity<String> eliminarTipoAdicional(@PathVariable("idtipoadicional") int idtipoadicional){
        String tipoadicionalEliminar = tipoAdicionalImp.eliminarTipoAdicional(idtipoadicional);
        return ResponseEntity.ok(tipoadicionalEliminar);
    }
}