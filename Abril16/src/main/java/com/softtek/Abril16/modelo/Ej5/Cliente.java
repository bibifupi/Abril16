package com.softtek.Abril16.modelo.Ej5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Cliente {
    @Qualifier("D")
    private String nombre;
    private String NIF;

    public String insertar(Cliente cliente) {
        return "Cliente" + cliente.toString();
    }
}
