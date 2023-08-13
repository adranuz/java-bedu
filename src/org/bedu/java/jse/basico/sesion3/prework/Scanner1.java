package org.bedu.java.jse.basico.sesion3.prework;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        // un objeto tipo scanner no es un array.
        // los elementos guardados dentro de scanner
        // se pueden obtener mediante next.

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
