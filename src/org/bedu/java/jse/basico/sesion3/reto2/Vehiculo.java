package org.bedu.java.jse.basico.sesion3.reto2;

import java.util.Arrays;

public class Vehiculo {
    // attributes que conform un vehicular
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    // metodo para checar las llantas
    public Llanta[] getLlantas() {
        return llantas;
    }

    //metodo para checar el combustible
    public Combustible getCombustible() {
        return combustible;
    }

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

    public Vehiculo(Combustible combus){
        this.setCombustible(combus);
    }
    public Vehiculo(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getLlantas(), vehiculo.getLlantas())) return false;
        return getCombustible().equals(vehiculo.getCombustible());
    }
}

