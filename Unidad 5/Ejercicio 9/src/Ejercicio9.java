import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.printf("Introduce un número y te diré cuántos dígitos tiene: ");
        long num = sc.nextLong();
        sc.close();

        int contador = 0;

        if (num < 0) {
            num = -num;
        }

        do {
            num = num / 10;
            contador++;
        } while (num > 0);
        
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
