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
    public Combustible (int max, int curr) {
        this.setCurrLitros(curr);
        this.setMaxLitros(max);
    }
    public Combustible () {}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Combustible that = (Combustible) o;

        if (getMaxLitros() != that.getMaxLitros()) return false;
        return getCurrLitros() == that.getCurrLitros();
    }
}
