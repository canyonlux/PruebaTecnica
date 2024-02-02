package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BluRay implements Disco { // Clase para los Blu-ray
    private String brand; // Marca del Blu-ray
    private double capacidad; // Capacidad de almacenamiento
    private String nombre; // Nombre del Blu-ray
    private String tipo; // Tipo de Blu-ray

    // Constante
    private static final String METODO_LASER = "láser azul";
    @Override
    public void gírarDisco() {
        System.out.println("Blu-ray girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el Blu-ray mediante láser azul.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del Blu-ray con láser azul.");
    }

    @Override
    public void reportarInformación() {
        System.out.println("Blu-ray: " + this.toString());
    }
}
