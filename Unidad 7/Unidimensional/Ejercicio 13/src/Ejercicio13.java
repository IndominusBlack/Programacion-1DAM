public class Ejercicio13 {
    public static int numAleatorio(){
        return (int)(Math.random()*501);
    }

    public static String[] numNum(){
        String[] n = new String [100];

        for (int i=0; i<100; i++) {
            n[i] = String.valueOf(numAleatorio());
        }
        return n;
    }

    public static void main(String[] args) throws Exception {

        String[] panchito = numNum();

        for (int i=0; i<100; i++) {
            System.out.printf(panchito[i] + ", ");
        }

    }
}
