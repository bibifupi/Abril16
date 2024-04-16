package com.softtek.Abril16.modelo.Ej4;

import org.springframework.stereotype.Component;

@Component("IT1")

public class InformeTrimestre1 implements Informe{
    @Override
    public String getInforme() {
        return "Informe Trimestre 1";
    }
}
