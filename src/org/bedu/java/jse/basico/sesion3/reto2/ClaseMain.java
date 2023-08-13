package org.bedu.java.jse.basico.sesion3.reto2;

public class ClaseMain {
    public static void main(String[] args) {
        // crea las llantas
        Llanta llanta1 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta2 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta3 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta4 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        // crea el contenedor de combustible
        Combustible combustible = new Combustible();
        combustible.setCurrLitros((int) 0);
        combustible.setMaxLitros((int) 40);

        // crea un vehiculo
        Vehiculo vehiculo = new Vehiculo();
        // ponle el tanque
        vehiculo.setCombustible(combustible);
        // ponle las llantas
        vehiculo.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        // llena el tanque
        vehiculo.llenaTanque();


        // hazlo avanzar 10 km
        for (int i = 1; i <= 10; i++) {
            vehiculo.avanza();
        }
    }
}
