package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vinilo implements Disco { // Clase para los vinilos
    private String brand; // Marca del vinilo
    private double capacidad; // Duracion en minutos del vinilo
    private String nombre;
    private String tipo;

@Override
    public void gírarDisco() {
        System.out.println("Vinilo girando a una velocidad específica.");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Los datos se almacenan físicamente en el vinilo durante su fabricación.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del vinilo con una aguja.");
    }

    @Override
    public void reportarInformación() {
        System.out.println("Vinilo: " + this.toString());
    }
}
