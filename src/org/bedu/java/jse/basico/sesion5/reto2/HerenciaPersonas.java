package org.bedu.java.jse.basico.sesion5.reto2;

import java.time.LocalDate;

public class HerenciaPersonas {
    public static void main(String[] args) {
        Programador p = new Programador(
                "Adrian",
                (byte)29,
                LocalDate.of(1994, 2, 7),
                2000F,
                "Java"
        );

        System.out.println(p.getNombre() + " " + p.getLenguajePrincipal());

        DBA d = new DBA("Jack", (byte)28, LocalDate.of(1993, 1, 21), 45000F, "My SQL");


        System.out.println("\n====Datos del programador====");

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Fecha nacimiento: " + p.getFechaNacimiento());
        System.out.println("Salario: " + p.getSalario());
        System.out.println("Lenguaje: " + p.getLenguajePrincipal());

        System.out.println("\n====Datos del DBA====");
        System.out.println("Nombre: " + d.getNombre());
        System.out.println("Edad: " + d.getEdad());
        System.out.println("Fecha nacimiento: " + d.getFechaNacimiento());
        System.out.println("Salario: " + d.getSalario());
        System.out.println("Herramiena: " + d.getHerramientaConsultas());
    }
}
