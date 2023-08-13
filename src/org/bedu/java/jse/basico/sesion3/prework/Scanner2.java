package org.bedu.java.jse.basico.sesion3.prework;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");

        int numero1 = teclado.nextInt();

        System.out.println("Escribe otro numero");

        int numero2 = teclado.nextInt();

        System.out.println("La suma es: " + (numero1 + numero2));
    }
}
