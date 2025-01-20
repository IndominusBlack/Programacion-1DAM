public class Ejercicio12 {

    public static int numeroAleatorio() {
        return (int) (Math.random() * 401) + 500;
    }

    public static void main(String[] args) throws Exception {

        int[][] n = new int[9][9];
        int minimo = 900;
        int maximo = 500;
        double media = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n[i][j] = numeroAleatorio();
                System.out.printf(n[i][j] + " || ");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Números de la diagonal inversa:");

        int fila = 0;

        for (int k = 8; k >= 0; k--) {
            System.out.printf(n[k][fila] + " || ");

            if (n[k][fila] < minimo) {
                minimo = n[k][fila];
            }
            if (n[k][fila] > maximo) {
                maximo = n[k][fila];
            }
            media += n[k][fila];
            fila++;
        }

        System.out.println("");
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("La media de los números es: " + media/9);
    }
}