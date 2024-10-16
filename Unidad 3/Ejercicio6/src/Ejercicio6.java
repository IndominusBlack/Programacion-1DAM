import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        
        Scanner base = new Scanner (System.in);
        System.out.println("¿Cuánto mide la base del triángulo? ");
        double num1 = base.nextDouble();

        Scanner alto = new Scanner (System.in);
        System.out.println("¿Cuánto mide la altura del triángulo? ");
        double num2 = alto.nextDouble();

        double Resultado = (num1*num2)/2;

        System.out.println("El resultado es: " + Resultado);
    }
}