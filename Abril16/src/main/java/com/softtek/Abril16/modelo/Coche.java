package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Coche implements IVehiculo {

    private int deposito;

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "Moviéndose";
        } else {
            return "Quieto";
        }
    }
}
