package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cd implements Disco {
    private String brand; // Marca del disco
    private double capacidad; // Capacidad de almacenamiento
    private String nombre; // Nombre del disco
    private String tipo; // Tipo de disco

    // Constante para el tipo de láser
    private static final String TIPO_LASER = "Tipo de Láser X";

    @Override
    public void gírarDisco() {
        System.out.println("CD girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Datos almacenados en el CD usando " + TIPO_LASER + ".");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD con " + TIPO_LASER + ".");
    }

    @Override
    public void reportarInformación() {
        System.out.println("CD: " + this.toString());
        // got you!
    }
}
