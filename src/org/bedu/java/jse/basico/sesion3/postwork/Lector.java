package org.bedu.java.jse.basico.sesion3.postwork;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leerOpcion() {
        System.out.println("Opcion: ");
        return scanner.nextByte();
    }

}
