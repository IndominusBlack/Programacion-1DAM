public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        int[] numero;
        numero = new int[20];

        int[] cuadrado;
        cuadrado = new int[20];

        int[] cubo;
        cubo = new int[20];

        System.out.println("20 números aleatorios entre 1 y 100:");

        for (int i = 0; i <20; i++) {
            numero [i] = (int) (Math.random()*100) + 1;
            System.out.printf(numero[i] + ", ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Cuadrados de los 20 números aleatorios entre 1 y 100:");

        for (int j = 0; j < 20; j++) {
            cuadrado [j] = numero[j]*numero[j];
            System.out.printf(cuadrado[j] + ", ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Cubos de los 20 números aleatorios entre 1 y 100:");

        for (int k = 0; k < 20; k++) {
            cubo [k] = numero[k]*numero[k]*numero[k];
            System.out.printf(cubo[k] + ", ");
        }
    }
}