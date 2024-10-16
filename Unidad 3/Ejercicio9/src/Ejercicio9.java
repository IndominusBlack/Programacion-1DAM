import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner n1 = new Scanner (System.in);
        System.out.println("Introduce el radio del cono: ");
        double radio = n1.nextDouble();

        Scanner n2 = new Scanner (System.in);
        System.out.println("Introduce la altura del cono: ");
        double altura = n2.nextDouble();

        n1.close();
        n2.close();

        double total = 0.3333333333333333*altura*3.14159*(radio*radio);

        System.out.println("El volumen del cono es " + total);

    }
}