package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    // bloque de inicializacion
    // o constructor
    {
        curso = "Java Standard edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    // otro constructor que sobre escribe el de arriba
    {
        curso = "Java Standard Edition 2020";
    }
    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
