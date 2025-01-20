import java.util.Scanner;

public class Ejercicio13 {
    public static int numAleatorio() {
        return (int) (Math.random() * 501);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];

        int minimo = 502;
        int maximo = -1;

        for (int i = 0; i < 100; i++) {
            n[i] = numAleatorio();
            System.out.printf(n[i] + " || ");

            if (n[i] < minimo) {
                minimo = n[i];
            } else if (n[i] > maximo) {
                maximo = n[i];
            }
        }

        System.out.println("");
        System.out.println("Cuál quieres destacar (Máximo = 1, Mínimo = 2)");
        int confirmacion = sc.nextInt();

        int destacado;

        if (confirmacion == 1) {
            destacado = maximo;
            for (int j = 0; j < 100; j++) {
                if (n[j] == destacado) {
                    System.out.printf(" **" + n[j] + "** ||");
                } else {
                    System.out.printf(" " + n[j] + " ||");
                }
            }
        } else if (confirmacion == 2) {
            destacado = minimo;
            for (int j = 0; j < 100; j++) {
                if (n[j] == destacado) {
                    System.out.printf(" **" + n[j] + "** ||");
                } else {
                    System.out.printf(" " + n[j] + " ||");
                }
            }
        }
    }
}
