import java.util.Scanner;

public class Ejercicio31 {

    public static int dado1(){
        int dado1 = (int)(Math.random()*6+1);
        return dado1;
    }

    public static int dado2(){
        int dado2 = (int)(Math.random()*6+1);
        return dado2;
    }

    public static boolean dadosAnteriores(int dadoSumado, int dado1, int dado2, int dado1_antes, int dado2_antes){
        if(dado1 == dado1_antes && dado2 == dado2_antes){
            return false;
        }else if(dadoSumado == 7){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la cantidad de dinero que quieres apostar: ");
        int dinero = sc.nextInt();
        sc.close();

        int dado1_antes, dado2_antes;
        int dado1 = dado1();
        int dado2 = dado2();
        int dineroTotal = dinero*2;
        int dadoSumado = dado1 +dado2;

        System.out.println("Suma de los dados: " + dadoSumado);

        if (dadoSumado == 7 || dadoSumado == 11) {
        System.out.println("Has ganado " + dinero + "€. Tu total es: " + dineroTotal);
        } else if (dadoSumado==2 || dadoSumado == 3 || dadoSumado == 12) {
            System.out.println("Mala suerte hermano. Lo has perdido todo chaval.");
        }else{
            dado1_antes = dado1;
            dado2_antes = dado2;
            dado1 = dado1();
            dado2 = dado2();
            while(dadosAnteriores(dadoSumado, dado1, dado2, dado1_antes, dado2_antes)){
                dado1 = dado1();
                dado2 = dado2();
                /* Imprimelos */
            }
            if(dadoSumado == 7){
                /* Pierde, mensaje por pantalla */

            }else{
                /* Reinicias, muestra por pantalla el total y hazlo */
            }
        }
    }
}