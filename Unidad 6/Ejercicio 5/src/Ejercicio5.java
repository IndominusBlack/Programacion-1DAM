public class Ejercicio5 {
    public static void main(String[] args) {

    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;

    for (int i = 0; i < 50; i++) {
        n = (int)(Math.random()*100) + 100;
        System.out.print(n + " ");
        suma += n;

            if (n < minimo) {
            minimo = n;
            }
    
            if (n > maximo) {
            maximo = n;
            }
    }

    int media = suma/50;
    
    System.out.println("Mínimo: " + minimo + "Máximo: " + maximo + "Media: " + media);
    }
}