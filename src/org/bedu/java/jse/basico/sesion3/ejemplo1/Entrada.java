package org.bedu.java.jse.basico.sesion3.ejemplo1;

import java.io.Console;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);


        Console console = System.console();
        if (console == null) {
            System.err.println("No hay consola.");
            System.exit(1);
        }
//        System.out.println("Escribe tu nombre: ");
//        String nombre = console.readLine();
        String nombree = console.readLine("%s", "Escribe tu nombre: ");


        System.out.println("Hola " + nombree);
//      $ java org.bedu.java.jse.basico.sesion3.ejemplo1.Entrada
    }
}
