import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
    
    Scanner n1 = new Scanner (System.in);
    System.out.println("Introduce el número de Megabytes:");
    double mb = n1.nextDouble();

    n1.close();

    double total = mb*1000;

    System.out.printf("%.0f mb es igual a %.0f kb", mb, total);
    }
}
