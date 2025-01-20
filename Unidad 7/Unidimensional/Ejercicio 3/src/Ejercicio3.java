import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int[] n;
        n = new int[10];

        for (int i = 0; i <10; i++){
            System.out.printf("Introduce la variable número " + i + ": ");
            n[i] = sc.nextInt();
        }

        for (int i = 9; i>=0; i--){
            System.out.println("Variable número " + i + ": " + n[i]);
        }

        sc.close();
    }
}
