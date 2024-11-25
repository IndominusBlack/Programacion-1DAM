import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.printf("Por favor, introduzca un número entero positivo: ");
        long num = sc.nextLong();

        long pares = 0;
        long numGuardado = num;
        long numInvertido = 0;

        while (num > 0) {
            numInvertido = (numInvertido * 10) + (num % 10);
            num /= 10;
        }

        System.out.printf("Números pares: ");
        
        while (numInvertido>0) {
            numGuardado = numInvertido%10;
            if (numGuardado %2==0) {
                System.out.print(numGuardado);
                pares += numGuardado;
                System.out.printf(" ");
            }
            numInvertido/= 10;
    }
    System.out.printf("\n");
    System.out.println("Suma de los dígitos pares: " + pares);
    sc.close();
}
}
