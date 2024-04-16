package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

@Component
public class TallerPintura implements ITaller{

    @Override
    public String reparar() {
        return "Pintando";
    }

}