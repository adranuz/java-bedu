package org.bedu.java.jse.basico.sesion3.prework;

public class EjemploMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("John", 24, "Estadounidense", "Masculino");

        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Edad: "+p1.getEdad());
        p1.setEdad(30);
        System.out.println("Edad actualizada: "+p1.getEdad());
    }
}
