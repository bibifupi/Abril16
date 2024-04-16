package com.softtek.Abril16.modelo.Ej5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

@Component("P")
public class AccesoProduccion implements IDAO{
    public String insertar(Cliente cliente) {
        return "Producción"+cliente.toString();
    }
}
