package com.bzetab.MSKEstibas.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespuestaGeneral {
    private boolean respuesta;
    private String mensaje;
}
