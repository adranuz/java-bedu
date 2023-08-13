package org.bedu.java.jse.basico.sesion3.reto2;

public class Combustible {
    private int maxLitros;
    private int currLitros;

    public void llenarCombustible() {
        this.currLitros = this.maxLitros;
    }

    public void usar() {
            currLitros = currLitros - 1;
            System.out.println("Te quedan " + currLitros + " litros");
    }

    public int getMaxLitros() {
        return maxLitros;
    }

    public void setMaxLitros(int maxLitros) {
        this.maxLitros = maxLitros;
    }

    public int getCurrLitros() {
        return currLitros;
    }

    public void setCurrLitros(int currLitros) {
        this.currLitros = currLitros;
    }
}
