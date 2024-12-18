package utilidades;
/**
* CalculadoraPuntuacion
*
* @author Eduardo Heras Nuño
*/

public class CalculadorPuntuacion {
    
    public static double calcularPuntuación(int carta, int dado) {      //Función que calcula la puntuación total en base a la suma de la carta alterada y el dado.
        double puntuacionBase = carta + dado;
        if (carta % 2 == 0) {
            puntuacionBase += carta * 0.1;
        } else {
            puntuacionBase -= carta * 0.05;
        }
        return puntuacionBase;                                          //La función devuelve la puntuación sumada
    }
}
