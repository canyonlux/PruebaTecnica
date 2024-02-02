package org.example;
/**
 * Interfaz para representar el comportamiento común de diferentes tipos de discos.
 */
public interface Disco {

    void gírarDisco(); // Método para hacer girar el disco

    void almacenarDatos();

    void leerDatos();

    void reportarInformación();
}
