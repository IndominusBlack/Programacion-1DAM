import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = sc.nextInt();
        sc.nextLine();
        
        System.out.println("            @");

        int posicion = 13;

        for (int i = 1; i < longitud; i++) {
            int movimiento = (int) (Math.random() * 3);

            switch (movimiento) {
                case 0:
                    posicion--;
                    break;
                case 1:
                    break;
                case 2:
                    posicion++;
                    break;
            }

            for (int j = 1; j < posicion; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
