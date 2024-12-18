package utilidades;
/**
* GeneradorAleatorio
*
* @author Eduardo Heras Nuño
*/
public class GeneradorAleatorio {
    public static int generarCarta() {                  //Función que genera una carta aleatoria.
        int carta = (int) (Math.random()*40)+1;
        return carta;                                   //Devuelve el valor de la carta.
    }

    public static int generarDado() {                   //Función que genera un dado aleatorio.
        int dado = (int) (Math.random()*6)+1;
        return dado;                                    //Devuelve el valor del dado.
    }
}
