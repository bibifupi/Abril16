package com.softtek.Abril16.modelo.Ej4;

import org.springframework.stereotype.Component;

@Component("IT2")
public class InformeTrimestre2 implements Informe{
    @Override
    public String getInforme() {
        return "Informe Trimestre 2";
    }
}
