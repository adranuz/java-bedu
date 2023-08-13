package org.bedu.java.jse.basico.sesion2.ejemplo3;

public class For {
    public static void main(String[] args) {
        // arreglo de valores short
        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("i = " + valores[i]);
        }

        for (short valor: valores) {
            System.out.println(valor + " = current value");
        }
    }
}
