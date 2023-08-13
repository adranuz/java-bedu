package org.bedu.java.jse.basico.sesion4.reto1;

public class Reto1 {
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo(2);
        Rectangulo rec3 = new Rectangulo(2, 3);

        System.out.println("rec1 area: " + rec1.getArea());
        System.out.println("rec2 area: " + rec2.getArea());
        System.out.println("rec3 area: " + rec3.getArea());

    }
}
