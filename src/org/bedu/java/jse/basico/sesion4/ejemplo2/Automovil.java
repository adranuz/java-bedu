package org.bedu.java.jse.basico.sesion4.ejemplo2;

public class Automovil {
        // atributos
        private String marca;
        private String modelo;
        private int anioFabricacion;
        private int kilometraje;

        // constructor
        public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
            this.marca = marca;
            this.modelo = modelo;
            this.anioFabricacion = anioFabricacion;
            this.kilometraje = kilometraje;
        }

        //sobreescribiremos el metodo hashCode
        // lo declaramos con la notacion @override
        @Override
        public int hashCode() {
            // inicializamos una variable
            int hash = 0;

            // hay muchas maneras de usar un metodo hashCode
            // pero la regla general es hacer una operacion aritmetica con ellos
            // sumar restar, multiplicar o convinaciones.
            // En este caso lo sumamos usando valores de numeros
            // y el metodo hash de los objetos String
            hash = marca.hashCode();
            hash = hash + modelo.hashCode();
            hash = hash + anioFabricacion;
            hash = hash + kilometraje;
            return hash;
        }
}
