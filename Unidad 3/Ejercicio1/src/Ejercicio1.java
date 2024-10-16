import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double multiplicacion1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce otro número: ");
        double multiplicacion2 = sc2.nextInt();

        sc1.close();
        sc2.close();

        double total = multiplicacion1*multiplicacion2;

        System.out.println("El resultado es: " + total);

    }
}

