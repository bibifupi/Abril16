package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

@Component("TM")
public class TallerMecanica implements ITaller {
    @Override
    public String reparar() {
        return "Reparación de piezas";
    }

}