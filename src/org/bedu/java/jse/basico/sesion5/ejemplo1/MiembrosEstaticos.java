package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        Contador cont3 = new Contador();
        Contador cont4 = new Contador();

        // los valores que no son estaticos pertenecen a la instancia de la clase
        System.out.println("contador de instancia 1: " + cont1.getContadorInstancia());
        System.out.println("contador de instancia 2: " + cont2.getContadorInstancia());
        System.out.println("contador de instancia 3: " + cont3.getContadorInstancia());
        System.out.println("contador de instancia 4: " + cont4.getContadorInstancia());

        // los valores estaticos son compartidos por todas las instancias de la clase
        System.out.println("contador de clase 1: " + cont1.getContadorClase());
        System.out.println("contador de clase 2: " + cont2.getContadorClase());
        System.out.println("contador de clase 3: " + cont3.getContadorClase());
        System.out.println("contador de clase 4: " + cont4.getContadorClase());

        // la clase puede mostrar los metodos y valores estaticos
        System.out.println("tambien se puede acceder a la clase y obtener atributos");
        System.out.println("contador: " + Contador.getContadorClase());

        // si tratas de mostrar algo que no sea estatico desde de la clase, da error.
//        System.out.println("contador: " + Contador.getContadorInstancia());

        Contador cont5 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont6 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont7 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont8 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());
    }
}
