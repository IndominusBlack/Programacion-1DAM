import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner n1 = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        double horas = n1.nextDouble();
        double total;

        n1.close();

        if (horas <= 40) {
            total = horas * 12;
        } else if (horas > 40) {
            total = ((horas-40)*16) + 480;
        } else {
            total = 0;
        }

        System.out.printf("El sueldo semanal que le corresponde es de %.0f euros", total);

    }
}
