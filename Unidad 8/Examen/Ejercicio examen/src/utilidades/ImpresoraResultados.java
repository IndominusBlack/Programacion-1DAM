package utilidades;
/**
* ImpresoraResultados
*
* @author Eduardo Heras Nuño
*/
public class ImpresoraResultados {

    public static String imprimirResultados(double puntuacionMago1, double puntuacionMago2) {   //Función que devuelve un mensaje según los resultados finales
        System.out.println("Resultado Final:");
        System.out.println("Mago 1: " + puntuacionMago1);
        System.out.println("Mago 2: " + puntuacionMago2);
        String mensaje;

        if (puntuacionMago1 > puntuacionMago2) {
            mensaje = "El ganador es el mago 1.";
        } else if (puntuacionMago1 < puntuacionMago2) {
            mensaje = "El ganador es el mago 2.";
        } else {
            mensaje = "Empate.";
        }
        return mensaje;                                                         //Devuelve el mensaje final según las puntuaciones de cada mago.
    }
}
