public class Ejercicio1Bid {
    public static void main(String[] args) throws Exception {
        int [][] n = new int[4][6];

        n [0][0] = 0;
        n [0][1] = 30;
        n [0][2] = 2;
        n [0][5] = 5;
        n [1][0] = 75;
        n [1][4] = 2;
        n [2][2] = -2;
        n [2][3] = 9;
        n [2][5] = 11;

        int fila;
        int columna;

        System.out.println("Array num | Columna 0 | Columna 1 | Columna 2 | Columna 3 | Columna 4 | Columna 5 ");

        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila " + fila + "    ");
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("| %9d ", n[fila][columna]);
            }
            System.out.println();
        }
    }
}