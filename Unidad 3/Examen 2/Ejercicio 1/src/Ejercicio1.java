import java.util.Scanner;                                                       //Importamos la clase Scanner

public class Ejercicio1 {

    //Enunciado: Escribe un programa que convierta una cantidad positiva de kilómetros a su equivalente en millas. Recuerda 
    //que 1 kilómetro equivale aproximadamente a 0.621371 millas. El resultado debe mostrarse con un mensaje claro.
    //Colorea las cantidades empleando las constantes predefinidas.

    public static final String RED_BACKGROUND = "\033[41m"; // RED              //Definimos los tres colores para usarlos
    public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset                 //Definimos el reset para reiniciar los colores al final de cada uso.

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);                                   //Creación de la variable temporal a la que llamaremos "sc"
        System.out.printf("Ingrese la cantidad de kilómetros: ");        //Mostramos el primer texto en pantalla
        Double km = sc.nextDouble();                                            //Creación de la variable "km" a partir de la variable temporal "sc"

        sc.close();                                                             //Cerramos la variable Scanner para evitar futuros conflictos

        System.out.println("------------------------------------------");     //Linea separadora durante la ejecución del programa

        Double millas = km*0.621371;                                            //Creacion de la variable "millas", cuyo valor es la fórmula de "km" * 0.621371, ya que es la conversión de kilómetros a millas

        System.out.println("Cantidad de kilómetros: " + km + "km");
        System.out.printf("Equivalente en millas: " + YELLOW_BACKGROUND + millas + RESET + " mi\n");        //Muestra por pantalla del resultado de nuestro conversor de unidades añadiéndole color gracias al color que hemos definido antes como variable

        System.out.println("------------------------------------------");     //Linea separadora durante la ejecución del programa

        System.out.println("La conversión se realizó utilizando la fórmula:");
        System.out.printf(RED_BACKGROUND + "1 km" + RESET + " = " + GREEN_BACKGROUND + "0.621371 mi" + RESET);  //Muestra final del resultado del programa en el que expresamos qué fórmula hemos empleado para elaborar el programa, también acompañada de colores para decorar como el ejemplo del ejercicio

    }
}
