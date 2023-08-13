package org.bedu.java.jse.basico.sesion4.reto1;

public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    public Rectangulo(int ancho){
        this.ancho = ancho;
        this.alto = ancho;
    }

    public Rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return this.alto*this.ancho;
    }
}
