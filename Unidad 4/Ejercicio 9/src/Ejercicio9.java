import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el valor de a:");
        Double a = sc.nextDouble();

        System.out.println("Por favor, introduzca el valor de b:");
        Double b = sc.nextDouble();

        System.out.println("Por favor, introduzca el valor de c:");
        Double c = sc.nextDouble();

        sc.close();

        double raiz = Math.pow(b, 2) - 4 * a * c;
        double resultado1 = (-b + Math.sqrt(raiz)) / (2 * a);
        double resultado2 = (-b - Math.sqrt(raiz)) / (2 * a);

        if (raiz < 0) {
            System.out.println("La ecuación no tiene ninguna solución real");
        } else if (resultado1 == resultado2) {
            System.out.println("La ecuación una única solución, y es: " + resultado1);
        } else {
            System.out.println("La ecuación tiene dos soluciones, y son: " + resultado1 + " y " + resultado2);
        }
    }
}
