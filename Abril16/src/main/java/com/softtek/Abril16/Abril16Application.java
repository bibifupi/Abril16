package com.softtek.Abril16;

import com.softtek.Abril16.modelo.Conductor;
import com.softtek.Abril16.modelo.Ej4.Director;
import com.softtek.Abril16.modelo.Ej4.Jefe;
import com.softtek.Abril16.modelo.Ej4.Secretario;
import com.softtek.Abril16.modelo.Ej5.AccesoDesarrollo;
import com.softtek.Abril16.modelo.Ej5.AccesoProduccion;
import com.softtek.Abril16.modelo.Ej5.Cliente;
import com.softtek.Abril16.modelo.Saludo;
import com.softtek.Abril16.modelo.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {
    @Autowired
    private Saludo saludo;

    @Autowired
    private Conductor conductor;

    @Autowired
    private SeguroCoche seguro;

    @Autowired
    private Secretario secretario;
    @Autowired
    private Jefe jefe;
    @Autowired
    private Director director;

    @Autowired
    private AccesoDesarrollo ad;
    @Autowired
    private AccesoProduccion ap;
    @Qualifier("D")
    private Cliente clienteD=new Cliente("pepe", "123456789A");
    @Qualifier("P")
    private Cliente clienteP=new Cliente("lola", "987654321Z");



    public static void main(String[] args) {
        SpringApplication.run(Abril16Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(saludo.saludar());
        System.out.println(conductor.conducir());
        System.out.println(seguro.reparar());
        System.out.println(secretario.getTareas());
        System.out.println(secretario.getInforme());
        System.out.println(jefe.getTareas());
        System.out.println(jefe.getInforme());
        System.out.println(director.getTareas());
        System.out.println(director.getInforme());
        System.out.println(ad.insertar(clienteD));
        System.out.println(ap.insertar(clienteP));

    }
}
