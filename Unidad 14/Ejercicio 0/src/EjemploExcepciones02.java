import java.util.Scanner;

public class EjemploExcepciones02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la media de dos números");

        try {
            System.out.print("Introduzca el primer número: ");
            double numero1 = Double.parseDouble(sc.nextLine());

            System.out.print("Introduzca el segundo número: ");
            double numero2 = Double.parseDouble(sc.nextLine());

            System.out.println("La media es " + (numero1 + numero2) / 2);

        } catch (Exception e) {
            System.out.print("No se puede calcular la media. ");
            System.out.println("Los datos introducidos no son correctos.");

        } finally {
            System.out.println("Gracias por utilizar este programa ¡hasta la próxima!");
        }
        sc.close();
    }
}
