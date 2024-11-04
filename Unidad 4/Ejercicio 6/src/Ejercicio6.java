import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura (en metros): ");
        double h = sc.nextDouble();
        double g = 9.81;
        double t = Math.sqrt((2 * h) / g);

        if (h >= 0) {
            System.out.printf("El tiempo de caída es: %.2f segundos%n", t);
        } else {
            System.out.println("La altura no puede ser negativa");
        }
    }
}