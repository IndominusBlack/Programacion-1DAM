import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.printf("Introduce un número y te diré los cuadrados y cubos de los mismos: ");
        int num = sc.nextInt();

        for (int i = num+1; i <= num+5; i++) {
            System.out.println(i + " | " + i*i + " | " + i*i*i);
        }
    }
}
