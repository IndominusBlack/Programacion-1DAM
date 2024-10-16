import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("\033[31m Introduce un número: \033[33m");
        double euro = sc.nextInt();
        
        double total = euro*166.386;

        System.out.println(euro + "\033[35m euros equivalen a " + total + " pesetas");

        sc.close();
    }
}
