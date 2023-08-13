package org.bedu.java.jse.basico.sesion2.reto1;

public class Desbordamiento {
    public static void main(String[] args) {
        // el desbordamiento de valores pasa cuando
        // asignamos un valor mayor al que soporta
        // un tipo de dato

        byte valorByte = Byte.MAX_VALUE;
        System.out.println(valorByte); // 127
        System.out.println(++valorByte); // -128

        valorByte = Byte.MIN_VALUE;
        System.out.println(valorByte); // -128
        System.out.println(--valorByte); // 127

        double valorDouble = Double.MAX_VALUE;
        System.out.println(valorDouble);
        System.out.println(valorDouble + 1);

        valorDouble = Double.MIN_VALUE;
        System.out.println(valorDouble);
        System.out.println(--valorDouble);

    }
}
