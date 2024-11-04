import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce de qué día de la semana quieres conocer el horario: ");
        String dia = sc.nextLine();

        sc.close();

        String asignatura;

        switch (dia) {

            case "lunes":
                asignatura = "tienes Entornos de desarrollo a primera hora";
                break;

            case "martes":
                asignatura = "tienes Digitalización a primera hora";
                break;

            case "miercoles":
                asignatura = "tienes Lenguajes de marcas a primera hora";
                break;

            case "jueves":
                asignatura = "tienes Lenguajes de marcas a primera hora";
                break;

            case "viernes":
                asignatura = "tienes Bases de datos a primera hora";
                break;

            case "sabado", "domingo":
                asignatura = "no hay clase";
                break;

            default:
                asignatura = "no es un día";
        }
        System.out.println("El " + dia + " " + asignatura);
    }
}
