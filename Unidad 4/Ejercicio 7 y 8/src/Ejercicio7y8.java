import java.util.Scanner;

public class Ejercicio7y8 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = sc.nextDouble();

        sc.close();

        double notaMedia = (nota1 + nota2 + nota3) / 3;
        String calificacion;

        if ((notaMedia >= 0) && (notaMedia < 5)) {
            calificacion = " es un insuficiente";
            
        } else if ((notaMedia >= 5) && (notaMedia < 6)) {
            calificacion = ", y eso es un suficiente";

        } else if ((notaMedia >= 6) && (notaMedia < 7)) {
            calificacion = ", y eso es un bien";

        } else if ((notaMedia >= 7) && (notaMedia < 9)) {
            calificacion = ", y eso es un notable";

        } else if ((notaMedia >= 9) && (notaMedia <= 10)) {
            calificacion = ", y eso es un sobresaliente";

        } else {
            calificacion = ", y eso no es coherente, no me tomes el pelo.";
        }

        System.out.println("Tu nota es un " + notaMedia + calificacion);

    }
}
