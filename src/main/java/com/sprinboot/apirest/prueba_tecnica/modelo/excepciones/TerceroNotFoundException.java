package com.sprinboot.apirest.prueba_tecnica.modelo.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TerceroNotFoundException extends RuntimeException {
    public TerceroNotFoundException(String documento) {
        super("Tercero con documento " + documento + " no existe en el sistema");
    }
}
