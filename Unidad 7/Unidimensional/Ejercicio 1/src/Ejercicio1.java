public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int[] n;
        n = new int[12];

        n[0] = 39;
        n[1] = -2;
        n[4] = 0;
        n[6] = 14;
        n[8] = 5;
        n[9] = 120;

        System.out.println("Índice   0   1   2   3   4   5   6   7   8   9   10  11");
        System.out.printf("Valor:   ");
        
        for (int i =0; i <12; i++) {
            System.out.print(n[i] + ",  ");
        }
    }
}