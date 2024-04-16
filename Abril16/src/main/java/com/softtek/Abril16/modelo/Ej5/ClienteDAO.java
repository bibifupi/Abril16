package com.softtek.Abril16.modelo.Ej5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class ClienteDAO {
    private IDAO conexion;
}
