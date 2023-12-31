package org.bedu.java.jse.basico.sesion5.ejemplo3;

public class Equipo {
        private String nombre;
        private String ciudad;
        private int puntos;

        public String getNombre() {
            return nombre;
        }

        public String getCiudad() {
            return ciudad;
        }

        public int getPuntos() {
            return puntos;
        }

        public Equipo(String nombre, String ciudad, int puntos) {
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.puntos = puntos;
        }

        // ahora tenemos constructores dependiendo de los parametros enviados
        public Equipo(String nombre, String ciudad) {
            this(nombre, ciudad, 0);
        }

        // este constructor llama con this al constuctor de arriba
        public Equipo(String ciudad) {
            this("Anónimos", ciudad);
        }


        // tambien se pueden sobrecargar metodos
        public void actualiza(String nombre, int puntos){
            this.nombre = nombre;
            this.puntos = puntos;
        }
        public void actualiza(String nombre){
            this.nombre = nombre;
        }
        public void actualiza(int puntos){
            this.puntos = puntos;
        }
}
