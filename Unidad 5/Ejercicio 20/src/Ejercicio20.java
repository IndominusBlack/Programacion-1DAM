import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué símbolo deseas usar para tu pirámide? ");
        String simbolo = sc.nextLine();

        System.out.print("¿Y la altura de tu pirámide? ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == altura) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println("");
    }
}
