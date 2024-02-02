package org.example;

import lombok.Getter;
import lombok.Setter;       //utizamos lombok para ahorrarnos el escribir los métodos getter y setter
import lombok.ToString;

@Getter
@Setter
@ToString
public class DiscoDuro implements Disco { // Clase para los discos duros
    private String brand; // Marca del disco
    private double capacidad; // Capacidad de almacenamiento
    private String nombre; // Nombre del disco
    private String tipo; // Tipo de disco
    private String tipoCabezal; // Específico de Disco Duro, no hacemos constante porque puede cambiar el tipo de cabezal

    @Override
    public void gírarDisco() {
        System.out.println("Disco duro girando a una velocidad específica.");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el disco duro con cabezal magnético.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del disco duro mediante cabezal magnético.");
    }

    @Override
    public void reportarInformación() {
        System.out.println("Disco Duro: " + this.toString());
    }
}
