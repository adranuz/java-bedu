package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class Contador {

    // creamos dos variables internas
    private static short contadorClase;
    private short contadorInstancia;

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }

    // cramos un constructor que incrementa en 1 cada que se crea una instancia
    public Contador() {
        this.contadorInstancia++;
        this.contadorClase++;

    }
}
