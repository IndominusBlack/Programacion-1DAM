import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        
        Scanner n1 = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        double num1 = n1.nextDouble();
        
        Scanner n2 = new Scanner (System.in);
        System.out.println("Introduce otro número: ");
        double num2 = n2.nextDouble();

        n1.close();
        n2.close();

        double suma = num1+num2;
        double resta = num1-num2;
        double multiplicacion = num1*num2;
        double division = num1/num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta);
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a " + multiplicacion);
        System.out.println("La division de " + num1 + " / " + num2 + " es igual a " + division);       
    }
}
