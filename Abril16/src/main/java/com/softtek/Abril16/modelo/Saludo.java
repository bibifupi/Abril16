package com.softtek.Abril16.modelo;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor

public class Saludo {
    private String mensaje;

    public String saludar(){
        return "Hola";
    }
}
