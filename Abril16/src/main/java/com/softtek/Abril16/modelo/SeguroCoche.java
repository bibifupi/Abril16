package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class SeguroCoche {
    @Autowired
    @Qualifier("TM")
    private ITaller taller;

    private String aseguradora;

    public String reparar() {
        return taller.reparar();
    }
}
