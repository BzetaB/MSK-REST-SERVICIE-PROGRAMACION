package com.bzetab.MSKEstibas.model.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {
    private String nrodocumento;
    private String contrasenia;
}