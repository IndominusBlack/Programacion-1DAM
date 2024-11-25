import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();

        int sucesion = 0;
        int total = 1;
        int i = 2;
    


    if ((num==1)||(num==2)) {
        System.out.println("El total tras " + num + " números en la sucesión de Fibonacci es: 1");
    } else while (i<num) {
        sucesion = total-sucesion;
		total = total+sucesion;
        i++;
    }

    System.out.println("El total tras " + num + " números en la sucesión de Fibonacci es: " + total);
    }
}
