import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        System.out.printf("Introduce el número del cual quieres saber su tabla de multiplicar: ");
        int num = sc.nextInt();

        sc.close();

        for (int tabla = 1; tabla <= 10; tabla++) {
            int total=num*tabla;
            System.out.println(total);
        }
    }
}
