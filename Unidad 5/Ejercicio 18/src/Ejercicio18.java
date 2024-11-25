import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();
        sc.close();

        if (n1 == n2) {
            System.out.println("Los números son iguales, deben ser distintos.");
        } else {
            if (n1 < n2) {
                for (int i = n1; i <= n2; i += 7) {
                    if (i + 7 > n2) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + ", ");
                    }
                }
            } else {
                for (int i = n1; i >= n2; i -= 7) {
                    if (i - 7 < n2) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + ", ");
                    }
                }
            }
        }
    }
}
