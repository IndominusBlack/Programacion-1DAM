import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.printf("Introduce un número que usaremos como base: ");
        int base = sc.nextInt();
        sc.nextLine();

        System.out.printf("Introduce un número que usaremos como exponente: ");
        int exponente = sc.nextInt();
        sc.close();

        int i = 1;

        while (i<=exponente) {
            System.out.printf(base + "^" + i + ", ");
            i++;
        }
    }
}
