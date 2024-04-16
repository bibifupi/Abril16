package com.softtek.Abril16.modelo.Ej4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Secretario implements Empleado{
    @Autowired
    @Qualifier("IT1")
    private Informe informe;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return "Tareas de Secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
