package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Conductor {

    private IVehiculo vehiculo=new IVehiculo() {
        @Override
        public String moverse() {
            return "El vehículo se ha movido";
        }
    };
    public String conducir() {
        return vehiculo.moverse();
    }

}
