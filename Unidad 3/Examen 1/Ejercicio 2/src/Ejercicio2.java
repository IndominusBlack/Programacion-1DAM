import java.util.Scanner;               //importamos la clase Scanner al programa

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        //Escribe un programa que calcule el área de un círculo dado su radio. El área se calcula con la fórmula A=πr2.
        //El título del ejercicio debe aparecer en negrita y el valor resultante para el área debe aparecer en negrita y en color rojo.

        
        System.out.println("\033[1;30mÁREA DE UN CÍRCULO\033[0m");          //Escribimos y mostramos por pantalla la introducción del programa.
        System.out.println("==================");

        Scanner sc = new Scanner (System.in);                                  //Creamos una variable temporal a la que llamaremos "sc".
        System.out.printf("Introduzca el radio (cm): ");                //Pedimos el radio y lo guardamos en la variable temporal.
        double radio = sc.nextDouble();                                        //Creamos una variable double y guardamos en él el contenido de la variable temporal "sc".

        sc.close();                                                            //Cerramos la variable temporal "sc" para evitar problemas futuros.

        double total = Math.PI*Math.pow(radio, 2);                           //Cálculo final en el que multiplicamos el nº de años por la cantidad de segundos que tiene un año (para poder tener la cantidad de segundos total), y eso lo multiplicamos por la cantidad de km que recorre la luz en 1 segundo.

        System.out.printf("El área del círculo es: \033[1;31m" + total + "\033[0m cm\u00B2");       //Expresión por pantalla del resultado del ejercicio con los colores requeridos.
    }
}
