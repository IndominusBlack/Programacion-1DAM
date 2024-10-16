import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
    
    Scanner n1 = new Scanner (System.in);
    System.out.println("Introduce el número de Kilobytes:");
    double kb = n1.nextDouble();

    n1.close();

    double total = kb*0.001;

    System.out.printf("%.0f kb es igual a " + total + " mb", kb);
    }
}