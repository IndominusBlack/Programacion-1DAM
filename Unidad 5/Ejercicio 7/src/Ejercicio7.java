import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int combinacionCorrecta = 1234;
        int intentosRestantes = 4;
        int combinacionIntroducida;
        Scanner sc = new Scanner(System.in);

        while (intentosRestantes > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            combinacionIntroducida = sc.nextInt();
            
            if (combinacionIntroducida == combinacionCorrecta) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentosRestantes + " intentos.");
                } else {
                    System.out.println("Lo siento, esa no es la combinación. Has agotado todos los intentos.");
                }
            }
        }
        sc.close();
    }
}

