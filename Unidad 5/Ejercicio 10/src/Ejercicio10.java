import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int acumuladora = 0;
        int num;
        int contador = 0;

        do {
        System.out.println("Introduce un número, si es negativo el programa acabará: ");
        num = sc.nextInt();
            if (num>0) {
                acumuladora += num;
                contador++;
            }
        } while (num>=0);
    
        double total = acumuladora/contador;

        System.out.println("La media de tus números es: " + total);
    sc.close();
    }
}
