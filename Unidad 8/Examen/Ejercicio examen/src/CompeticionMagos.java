
import java.util.Scanner;
import utilidades.CalculadorPuntuacion;
import utilidades.GeneradorAleatorio;
import utilidades.ImpresoraResultados;

/**
 * CompeticionMagos
 *
 * @author Eduardo Heras Nuño
 */
public class CompeticionMagos {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double puntuacionMago1 = 0;
        double puntuacionMago2 = 0;

        System.out.println("Bienvenido a la competición de magos.");
        System.out.println("¿Quiere comenzar la partida? (s/n)");
        String respuestaInicial = sc.nextLine();

        if (respuestaInicial.equals("s")) {                                  //Si la respuesta es afirmativa, el programa se desarrolla, si no, acaba.
            for (int rondas = 1; rondas < 6; rondas++) {
                int dado1 = GeneradorAleatorio.generarDado();
                int carta1 = GeneradorAleatorio.generarCarta();
                int dado2 = GeneradorAleatorio.generarDado();
                int carta2 = GeneradorAleatorio.generarCarta();

                System.out.println("Ronda " + rondas + ". Pulse enter para continuar la partida.");
                sc.nextLine();

                System.out.println("Dado mago 1: " + dado1);
                System.out.println("Carta mago 1: " + carta1);
                System.out.println("Dado mago 2: " + dado2);
                System.out.println("Carta mago 2: " + carta2);

                double puntuacionMago1ronda = CalculadorPuntuacion.calcularPuntuación(dado1, carta1);
                double puntuacionMago2ronda = CalculadorPuntuacion.calcularPuntuación(dado2, carta2);

                System.out.println("Puntuación mago 1: " + puntuacionMago1ronda);
                System.out.println("Puntuación mago 2: " + puntuacionMago2ronda);

                puntuacionMago1 += puntuacionMago1ronda;
                puntuacionMago2 += puntuacionMago2ronda;

                System.out.println("Puntuación total mago 1 tras la ronda: " + puntuacionMago1);
                System.out.println("Puntuación total mago 2 tras la ronda: " + puntuacionMago2);

                System.out.println("¿Quiere continuar la partida? Introduzca (no) en caso negativo");
                String respuestaRonda = sc.nextLine();

                if (respuestaRonda.equals("no")) {
                    rondas = +10;
                }
            }

            System.out.printf(ImpresoraResultados.imprimirResultados(puntuacionMago1, puntuacionMago2));
        } else if (respuestaInicial.equals("n")) {
            System.out.println("De acuerdo, hasta pronto.");
        } else {
            System.out.println("Reinicie el programa e introduzca una respuesta válida.");
        }
        sc.close();
    }
}
