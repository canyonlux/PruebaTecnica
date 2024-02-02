
**# README para el Proyecto de Almacenamiento de Datos en Diversos Medios**

## Descripción General

Este proyecto en Java proporciona una implementación de clases para representar diferentes medios de almacenamiento de datos, incluyendo CD, discos duros, discos de vinilo (LP) y Blu-ray. Cada medio implementa una interfaz común Disco, que define operaciones básicas como girar el disco, almacenar datos, leer datos y reportar información. El proyecto utiliza Lombok para reducir el código repetitivo, facilitando la lectura y el mantenimiento del código.

## Estructura del Proyecto

El proyecto contiene las siguientes clases principales:

Disco: Una interfaz que define métodos comunes para todos los tipos de discos.
Cd: Implementa la interfaz Disco y representa un CD.
DiscoDuro: Implementa la interfaz Disco y representa un disco duro.
Vinilo: Implementa la interfaz Disco y representa un disco de vinilo.
BluRay: Implementa la interfaz Disco y representa un Blu-ray.
Main: Una clase principal que incluye un menú para probar las funcionalidades de las diferentes clases.
Funcionalidad
Girar el Disco: Cada clase implementa el método girarDisco, mostrando un mensaje específico de cómo cada tipo de disco gira.
Almacenar Datos: Cada clase implementa el método almacenarDatos, demostrando la manera en que cada tipo de disco almacena los datos.
Leer Datos: Cada clase implementa el método leerDatos, ilustrando cómo se leen los datos de cada tipo de disco.
Reportar Información: Cada clase implementa el método reportarInformación, proporcionando detalles específicos de cada disco, como marca, capacidad, nombre y tipo.
Uso

## Para utilizar este proyecto, sigue estos pasos:

Clonar/Descargar el Proyecto: Clona o descarga el proyecto en https//github.com/canyonlux/PruebaTecnica
Abrir el Proyecto: Abre el proyecto con tu IDE favorito que soporte Java (por ejemplo, IntelliJ IDEA, Eclipse).
Ejecutar la Clase Main: Ejecuta la clase Main para interactuar con el menú de pruebas.
Seleccionar una Opción del Menú: El menú te permite elegir entre probar diferentes tipos de discos y ver cómo se comportan.

## Requisitos

Java JDK 11 o superior.
Lombok Plugin instalado en tu IDE.
Lombok Dependency en tu archivo de configuración de proyecto (si estás usando Maven/Gradle).
