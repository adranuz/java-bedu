package org.bedu.java.jse.basico.sesion3.reto2;

public class Vehiculo {
    // atributos que conforman un vehiculo
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    // metodo para establecer el maximo de combustible
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    // metodo para establecer medidas de las llantas
    public void colocaLlantas(
            Llanta delanteraIzquierda,
            Llanta delanteraDerecha,
            Llanta traseraIzquierda,
            Llanta traseraDerecha
    ) {
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    // metodo para llenar el tanque
    public void llenaTanque() {
        combustible.setCurrLitros(combustible.getMaxLitros());
    }

    // metodo para que el vehiculo avance
    public void avanza() {
        if (combustible.getCurrLitros() > 0) {
            for (Llanta llanta : llantas) {
                llanta.rodar();
            }
            combustible.usar();
        } else {
            System.out.println("No hay combustible");
        }
    }
}

