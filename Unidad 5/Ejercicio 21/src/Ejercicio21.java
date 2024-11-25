import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        sc.nextLine();

        int acumuladoraPar = 0;
        int acumuladoraImpar = 0;
        int acumuladoraMedia = 0;
        int acumuladoraTotal = 0;

        while (num >= 0) {
            acumuladoraTotal++;
            if (num % 2 != 0) {
                acumuladoraImpar += num;
                acumuladoraMedia++;
            } else {
                if (num > acumuladoraPar) {
                    acumuladoraPar = num;
                }
            }
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }

        int mediaImpares = acumuladoraImpar / acumuladoraMedia;
        System.out.println("La media de los números impares es: " + mediaImpares);
        System.out.println("El mayor número par introducido es: " + acumuladoraPar);
        System.out.println("El número total de números introducidos es: " + acumuladoraTotal);
    }
}