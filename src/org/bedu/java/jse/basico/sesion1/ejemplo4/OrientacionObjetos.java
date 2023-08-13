package org.bedu.java.jse.basico.sesion1.ejemplo4;

public class OrientacionObjetos {
    public static void main(String[] args) {

        // creando un autor
        var autor =  new Autor();
        autor.setNombre("Adrian");
        autor.setApellido("Garcia");
        autor.setEdad(100);

        // creando un libro con autor
        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo("100 years being unemployed");
        libro.setNumeroPaginas(1000);

        // print
        System.out.println("Libro: " + libro.getTitulo() );
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());

    }
}
