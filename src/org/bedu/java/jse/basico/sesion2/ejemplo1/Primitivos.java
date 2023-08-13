package org.bedu.java.jse.basico.sesion2.ejemplo1;

public class Primitivos {
    public static void main(String[] args) {
        // declaracion numbers
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        // print numbers
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        // declaracion & print others
        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);

        // cast float to int
        float numFloat = 1.5f;
        int numInt1 = (int)numFloat;
        System.out.println("numInt1: " + numInt1);

        // cast char to int
        char numChar = 'M';
        int numInt2 = (int)numChar;
        System.out.println("numInt2: " + numInt2);

        // cast boolean to int --crash--
        // booleans cant cast
        // boolean numBool = true;
        // int numInt3 = (int)numBool;

        // operadores

        // 1
        System.out.println("valorInt: " + valorInt);

        // 2
        valorInt = valorInt + 1;
        System.out.println("valorInt: " + valorInt);

        // 3
        valorInt++;
        System.out.println("valorInt: " + valorInt);

        // C
        valorChar++;
        System.out.println("valorChar: " + valorChar);

        // F
        valorChar = (char)(valorChar + valorInt);
        System.out.println("valorChar: " + valorChar);
    }
}
