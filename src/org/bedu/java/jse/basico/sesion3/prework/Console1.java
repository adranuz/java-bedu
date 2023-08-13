package org.bedu.java.jse.basico.sesion3.prework;

import java.io.Console;

public class Console1 {
    public static void main(String[] args) {
        // objeto console
        Console console = System.console();
        if (console == null) {
            System.err.println("No hay consola.");
            System.exit(1);
        }

//         variables vacias
        String user;
        System.out.println("user name: ");
        user = console.readLine();

        char[] password;
        System.out.println("password: ");
        password = console.readPassword();

//        // parcea lo obtenido a string
        String a = String.valueOf(password);

        System.out.println("user: " + user);
        System.out.println("pass: "+a);
    }
}
