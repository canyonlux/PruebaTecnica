package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para leer datos del usuario
        Cd cd = new Cd();   // Creación de objetos
        DiscoDuro discoDuro = new DiscoDuro();
        Vinilo vinilo = new Vinilo();
        BluRay bluRay = new BluRay();

        // Configuración inicial de los objetos
        cd.setBrand("Verbatim");
        cd.setCapacidad(700); // Capacidad en MB
        cd.setNombre("Nirvana - Nevermind");
        cd.setTipo("CD-R");
        cd.setTipo("Tipo de Láser X");

        discoDuro.setBrand("Corsair");
        discoDuro.setCapacidad(1024); // Capacidad en GB
        discoDuro.setNombre("Mi Disco Duro");
        discoDuro.setTipo("SSD");
        discoDuro.setTipoCabezal("Tipo de Cabezal Y");

        vinilo.setBrand("Sony Music");
        vinilo.setCapacidad(45); // Duración en minutos
        vinilo.setNombre("Guns N' Roses - Appetite for Destruction");
        vinilo.setTipo("LP");

        bluRay.setBrand("Sony");
        bluRay.setCapacidad(25); // Capacidad en GB
        bluRay.setNombre("the Matrix");
        bluRay.setTipo("BD-R");
        int opcion;

        do { // Menú de pruebas
            System.out.println("\nMenú de Pruebas");
            System.out.println("1. Probar CD");
            System.out.println("2. Probar Disco Duro");
            System.out.println("3. Probar Vinilo");
            System.out.println("4. Probar BluRay");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) { // Selección de opción
                case 1:
                    probarDisco(cd);
                    break;
                case 2:
                    probarDisco(discoDuro);
                    break;
                case 3:
                    probarDisco(vinilo);
                    break;
                case 4:
                    probarDisco(bluRay);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void probarDisco(Disco disco) { // Método para probar los discos
        disco.gírarDisco();
        disco.almacenarDatos();
        disco.leerDatos();
        disco.reportarInformación();
    }
}

/**
 * RUEDAS Y FRESBEE
 * No encajan basicamente porque aunque son elementos que giran, no tienen nada que ver con el almacenamiento de datos.
 * Seria mas logico tratarlos por separado.
 * si aun asi si quisieran integrar  podriamos integrar otra interfaz mas genererica con comportamientos comunes  a todo lo que gira.
 *
 * Siendo sincero no conocia los principios de SOLID, pero no quita que me informe y pueda dar una opinion.
 * sus cinco principios son:
    *  Single Responsibility Principle (SRP)
    *  - Open/Closed Principle (OCP)

    *  - Liskov Substitution Principle (LSP)

    *  - Interface Segregation Principle (ISP)

    *  - Dependency Inversion Principle (DIP)
 *   El proyecto esta bastante alineado con los principios de SOLID, ya que cada clase tiene una sola responsabilidad,
 *
 *
 */