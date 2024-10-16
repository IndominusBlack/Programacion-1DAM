import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        
        Scanner largo = new Scanner (System.in);
        System.out.println("¿Cuánto mide el largo del cuadrado? ");
        double num1 = largo.nextDouble();

        Scanner ancho = new Scanner (System.in);
        System.out.println("¿Cuánto mide el ancho del cuadrado? ");
        double num2 = ancho.nextDouble();

        double Resultado = num1*num2;

        System.out.println("El resultado es: " + Resultado);
    }
}
