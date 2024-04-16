package com.softtek.Abril16.modelo.Ej5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

@Component("D")
public class AccesoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente cliente) {
        return "Desarrollo"+cliente.toString();
    }
}
