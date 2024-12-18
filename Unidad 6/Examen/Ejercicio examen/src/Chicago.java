import java.util.Scanner;

public class Chicago {

    public static final String RED_BRIGHT = "\033[0;91m";       // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";     // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m";    // YELLOW
    public static final String RESET = "\033[0m";               // Text Reset

    public static int numRandom() {                             //Funcion para tirar un dado
        int numero = (int) (Math.random() * 6) + 1;
        return numero;
    }

    public static boolean puntos(int puntos) {                  //Funcion para verificar si la cantidad de puntos es 1 o más.
        if (puntos==1){
            return true;
        } else {
            return false;
        }
    }

    public static String TextoPuntos(int puntosTexto) {
        if (puntos(puntosTexto)) {
            return "punto";
        } else {
            return "puntos";
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);                       //Inicializar variables
        int puntuacion1 = 0;
        int puntuacion2 = 0;
        int puntuacion3 = 0;
        String puntos1;
        String puntosTotales1;
        String puntos2;
        String puntosTotales2;
        String puntos3;
        String puntosTotales3;

        System.out.println(YELLOW_BRIGHT + "CHICAGO" + RESET);

        for (int rondas = 2; rondas <= 12; rondas++) {               //Bucle que se repite desde la ronda en la que el objetivo es 2 hasta la ronda en la que el objetivo es 12.
            int dado1jug1 = numRandom();
            int dado2jug1 = numRandom();
            int dado1jug2 = numRandom();
            int dado2jug2 = numRandom();
            int dado1jug3 = numRandom();
            int dado2jug3 = numRandom();
            int puntuacionActual1 = 0;
            int puntuacionActual2 = 0;
            int puntuacionActual3 = 0;

            if (dado1jug1 + dado2jug1 == rondas) {                      //Si los dados de cada jugador suman el número de ronda, su puntuacion de ronda será 1 y su puntuación total recibirá un punto.
                puntuacion1++;
                puntuacionActual1 = 1;
            }
            if (dado1jug2 + dado2jug2 == rondas) {
                puntuacion2++;
                puntuacionActual2 = 1;
            }
            if (dado1jug3 + dado2jug3 == rondas) {
                puntuacion3++;
                puntuacionActual3 = 1;
            }

            puntos1 = TextoPuntos(puntuacion1);
            puntos2 = TextoPuntos(puntuacion2);
            puntos3 = TextoPuntos(puntuacion3);
            puntosTotales1 = TextoPuntos(puntuacionActual1);
            puntosTotales2 = TextoPuntos(puntuacionActual2);
            puntosTotales3 = TextoPuntos(puntuacionActual3);

            System.out.println(RED_BRIGHT + "Ronda: " + (rondas - 1) + " ; Puntuación objetivo: " + rondas + "" + RESET);              //Mostrar el resultado de la ronda por pantalla.
            System.out.println("Tirada del jugador 1: " + dado1jug1 + "-" + dado2jug1 + " ; " + puntuacionActual1 + " " + puntos1);
            System.out.println("Tirada del jugador 2: " + dado1jug2 + "-" + dado2jug2 + " ; " + puntuacionActual2 + " " + puntos2);
            System.out.println("Tirada del jugador 3: " + dado1jug3 + "-" + dado2jug3 + " ; " + puntuacionActual3 + " " + puntos3);
            System.out.println("Puntuaciones generales: Jugador 1 - " + puntuacion1 + " " + puntosTotales1 + " ; Jugador 2 - " + puntuacion2 + " " + puntosTotales2 + "; Jugador 3 - " + puntuacion3 + " " + puntosTotales3);

            if (rondas < 12) {                                                        //Mensaje post ronda, que en la última ronda cambia.
                System.out.println("Pulse INTRO para la siguiente ronda");
                sc.nextLine();
            } else {
                System.out.println("");
                System.out.println("Fin de la partida");
            }
        }
        sc.close();
    }
}
