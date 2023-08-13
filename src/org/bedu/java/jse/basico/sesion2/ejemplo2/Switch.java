package org.bedu.java.jse.basico.sesion2.ejemplo2;

public class Switch {
    public static void main(String[] args) {


        // calificacion
        String mensaje = "Mejor prueba de nuevo";
        byte calificacion = 100;
        if (calificacion < 0 || calificacion >10) {
            System.out.println("not valid");
        } else {

            switch (calificacion) {
                case 10:
                    mensaje = "Excelente!!";
                    break;
                case 9:
                case 8:
                    mensaje = "Buen trabajo!!";
                    break;
                case 7:
                    mensaje = "Muy bien!!";
                    break;
                case 6:
                    mensaje = "Bien hecho!!";
                    break;
                default:
                    break;
            }
            System.out.println(mensaje);

        }


        // meses
        String mesActual = "junio";
        switch (mesActual){
            case "enero":
                System.out.println("febrero,");
            case "febrero":
                System.out.println(" marzo,");
            case "marzo":
                System.out.println(" abril,");
            case "abril":
                System.out.println(" mayo,");
            case "mayo":
                System.out.println(" junio,");
            case "junio":
                System.out.println(" julio,");
            case "julio":
                System.out.println(" agosto,");
            case "agosto":
                System.out.println(" septiembre,");
            case "septiembre":
                System.out.println(" octubre,");
            case "octubre":
                System.out.println(" noviembre,");
            case "noviembre":
                System.out.println("diciembre.");
        }
    }
}
