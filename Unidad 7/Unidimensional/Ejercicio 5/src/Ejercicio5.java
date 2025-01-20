import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int[] n;
        n = new int[10];
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++){
            try{
                n[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("No válido.");
            }

            if (n[i] < minimo) {
                minimo = n[i];
            }

            if (n[i] > maximo) {
                maximo = n[i];
            }
        }
        
        for (int j = 0; j < 10; j++) {
            if ((n[j] > minimo) && (n[j] < maximo)) {
                System.out.printf(n[j] + ", ");
            } else if (n[j]==minimo) {
                System.out.printf("(MÍNIMO) " + n[j] + ", ");
            } else if (n[j]==maximo) {
                System.out.printf("(MÁXIMO) " + n[j] + ", ");
            }
        }
    }
}
