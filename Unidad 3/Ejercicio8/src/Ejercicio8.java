import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner n1 = new Scanner (System.in);
        System.out.println("Introduce el número de horas trabajadas: ");
        double horas = n1.nextDouble();

        n1.close();

        double total = horas*12;

        System.out.printf("Cobrarás %.0f euros", total);

    }
}
