package org.bedu.java.jse.basico.sesion3.prework;

public class Persona {
    // Atributos o propiedades
    private String name;
    private int age;
    private String nac;
    private String gender;

    // Constructor
    public Persona(
            String nombre,
            int edad,
            String nacionalidad,
            String genero
            ){
        name = nombre;
        age = edad;
        nac = nacionalidad;
        gender = genero;
    }

    // Metodos setter
    public void setNombre(String nombre) {
        name = nombre;
    }
    public void setEdad(int edad) {
        age = edad;
    }
    public void setNacionalidad(String nacionalidad) {
        nac = nacionalidad;
    }
    public void setGenero(String genero) {
        gender = genero;
    }

    // metodos getter
    public String getNombre() {
        return name;
    }
    public int getEdad() {
        return age;
    }
    public String getNacionalidad() {
        return nac;
    }
    public String getGenero() {
        return gender;
    }
}
