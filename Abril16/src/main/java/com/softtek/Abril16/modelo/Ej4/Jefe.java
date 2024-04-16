package com.softtek.Abril16.modelo.Ej4;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data

@Component
public class Jefe implements Empleado {
    @Autowired
    @Qualifier("IT2")
    private Informe informe;

    @Override
    public String getTareas() {
        return "Tareas de jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
