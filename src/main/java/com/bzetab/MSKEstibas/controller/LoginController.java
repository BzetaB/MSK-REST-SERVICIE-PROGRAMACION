package com.bzetab.MSKEstibas.controller;

import com.bzetab.MSKEstibas.model.Estiba;
import com.bzetab.MSKEstibas.model.auth.LoginRequest;
import com.bzetab.MSKEstibas.model.auth.LoginResponse;
import com.bzetab.MSKEstibas.service.EstibaImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/wsmskestiba/auth")
public class LoginController {

    @Autowired
    private EstibaImp estibaImp;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        return estibaImp.login(loginRequest.getNrodocumento(), loginRequest.getContrasenia()).map(
                idestiba -> {
                    Estiba estiba = estibaImp.obtenerEstibaPorId(idestiba);

                    LoginResponse loginResponse = LoginResponse.builder()
                            .success(true)
                            .idestiba(estiba.getIdestiba())
                            .documento(estiba.isDocumento())
                            .nrodocumento(estiba.getNrodocumento())
                            .nombre(estiba.getNombre())
                            .nombre(estiba.getNombre())
                            .apellido(estiba.getApellido())
                            .edad(estiba.getEdad())
                            .telefono(estiba.getTelefono())
                            .mensaje("Ingreso exitoso").build();
                    return ResponseEntity.ok(loginResponse);
                }).orElseGet(() -> {
            LoginResponse response = LoginResponse.builder()
                    .success(false)
                    .idestiba(null)
                    .documento(false)
                    .nrodocumento(null)
                    .nombre(null)
                    .apellido(null)
                    .edad(null)
                    .telefono(null)
                    .mensaje("Ingreso no permitido. Comprueba las credenciales").build();
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        });
    }
}