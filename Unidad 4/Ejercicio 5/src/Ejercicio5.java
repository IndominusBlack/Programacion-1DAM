import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor, introduzca el valor de a:");
        Double a = sc.nextDouble();

        System.out.println("Por favor, introduzca el valor de b:");
        Double b = sc.nextDouble();

        sc.close();

        if (a != 0) {
            double x = -b / a;
            System.out.println("La solución es x = " + x);
        } else {
            if (b == 0){
                System.out.println("La ecuación tiene infinitas soluciones");
            } else {
                System.out.println("El ejercicio no tiene solución real");
            }
        }
        }
    }
