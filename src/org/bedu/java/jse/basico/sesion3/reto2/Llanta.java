package org.bedu.java.jse.basico.sesion3.reto2;

public class Llanta {
    private int ancho;
    private int presion;
    private int diametro;

    public void rodar(){
        System.out.println("Rodando...");
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }


    public Llanta ( int ancho, int presion, int diametro) {
        this.setAncho(ancho);
        this.setPresion(presion);
        this.setDiametro(diametro);
    }
    public Llanta (){}

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        // casteo del objeto obtenido
        Llanta llanta = (Llanta) o;
        if(llanta.getAncho() != getAncho()) return false;
        if(llanta.getDiametro() != getDiametro()) return false;
        return llanta.getPresion() != getPresion();
    }
}
