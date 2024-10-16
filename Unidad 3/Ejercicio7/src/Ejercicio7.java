import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        
        Scanner n1 = new Scanner (System.in);
        System.out.println("Introduce el total de tu factura: ");
        double precio = n1.nextDouble();

        double total = precio*1.21;

        System.out.println("Tu factura ascendería a " + total + " euros tras sumarle el IVA");

        n1.close();

    }
}
