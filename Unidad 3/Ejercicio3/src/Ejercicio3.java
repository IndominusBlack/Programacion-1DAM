import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        double peseta = sc.nextInt();

        total = peseta*0.0013;

        System.out.println(peseta + " pesetas equivalen a " + total + " euros");

        sc.close();
    }
}