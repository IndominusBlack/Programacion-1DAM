import java.util.Scanner;      //Importamos la clase Scanner al programa

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        //Implementa un programa que calcule la distancia total en kilómetros que la luz recorre en un número de años 
        //ingresado por el usuario. La velocidad de la luz es de aproximadamente 299.792 kilómetros por segundo. 
        //Recuerda que un año tiene 365 días. El resultado debe presentarse en un formato legible.

        System.out.println("DISTANCIA QUE RECORRE LA LUZ");                 //Escribimos y mostramos por pantalla la introducción del programa.
        System.out.println("============================");                 

        Scanner sc = new Scanner (System.in);                                 //Creamos una variable temporal a la que llamaremos "sc".
        System.out.printf("Ingrese el número de años: ");              //Pedimos el nº de años y lo guardamos en la variable temporal
        double anos = sc.nextDouble();                                        //Creamos una variable double y guardamos en él el contenido de la variable temporal "sc".

        sc.close();                                                           //Cerramos la variable temporal "sc" para evitar problemas futuros.

        double total=(anos*60*60*24*365)*299792;                              //Cálculo final en el que multiplicamos el nº de años por la cantidad de segundos que tiene un año (para poder tener la cantidad de segundos total), y eso lo multiplicamos por la cantidad de km que recorre la luz en 1 segundo.

        System.out.printf("La luz recorre aproximadamente %.4f kilómetros en %.2f años.", total, anos);          //Expresión por pantalla del resultado final con un nº de decimales controlado (por si el usuario requiriese un nº de años con decimales, por ejemplo, un año y medio) gracias a "printf" para que no sea incoherente.
    }
}
