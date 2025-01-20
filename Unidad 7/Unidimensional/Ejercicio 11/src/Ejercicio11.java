import java.util.Scanner;

public class Ejercicio11 {

    public static boolean esPrimo(int numero) {
        if (numero <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int[] n;
        n = new int[10];

        System.out.println("Introduce las 10 variables:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Variable " + i + ":");
            n[i] = sc.nextInt();
            }

        System.out.printf("Índice |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  ");
        System.out.println("");
        System.out.print("Valor  ");

        for (int k = 0; k < 10; k++) {
            if (n[k]==1) {
                System.out.printf("|%5s", n[k]);
            }
        }

        for (int j = 0; j < 10; j++) {
            if (esPrimo(n[j])) {
                System.out.printf("|%5s", n[j]);
            }
        }

        for (int k = 0; k < 10; k++) {
            if (!esPrimo(n[k])) {
                System.out.printf("|%5s", n[k]);
            }
        }

        sc.close();
    }
}
