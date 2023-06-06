# Calculadora Challenge - Sanitas

Este proyecto es un microservicio de calculadora desarrollado utilizando Maven y Spring Boot. Proporciona una API para realizar operaciones aritméticas simples, como sumas y restas de dos números.

## Requisitos

- Java Development Kit (JDK) 17 o superior
- Maven 3.11.0 o superior

## Compilación y ejecución

1. Clona el repositorio del proyecto:

   ```bash
   git clone https://github.com/JoaDiSarro/challenge-sanitas

2. Navega hasta el directorio raíz del proyecto:

   ```bash
   cd challenge

3. Compila el proyecto usando Maven:

   ```bash
   mvn clean install

Este comando descargará todas las dependencias y generará el archivo JAR ejecutable.

4. Ejecuta el proyecto:

   ```bash
    mvn spring-boot:run

El microservicio se ejecutará en http://localhost:8080.

## Generación del archivo JAR

- Puedes generar el archivo JAR ejecutable del proyecto utilizando el siguiente comando Maven:

   ```bash
   mvn clean package

El archivo JAR se generará en el directorio target del proyecto.

## Descripción

El objetivo de este proyecto es implementar un microservicio de calculadora utilizando Maven y Spring Boot. 
La API expuesta por el microservicio permite realizar operaciones aritméticas simples, como sumas y restas de dos números.

El proyecto incluye las siguientes dependencias principales:

- Spring Boot Starter Web: Proporciona las capacidades de desarrollo web de Spring Boot.
- Lombok: Biblioteca que simplifica la generación de código repetitivo, como getters, setters y constructores.
- MapStruct: Framework de generación automática de mapeos entre objetos.
- Validation API: API de validación de Java que permite validar objetos utilizando anotaciones.
- Mockito: Framework de prueba para crear objetos simulados en pruebas unitarias.
- Tracer: Librería externa que proporciona una API de trazado de operaciones.

## Autor
Este proyecto fue desarrollado por Joaquina Daniela Di Sarro. 

Si tienes alguna pregunta, puedes contactarme por correo electrónico en jooadisarro@gmail.com.