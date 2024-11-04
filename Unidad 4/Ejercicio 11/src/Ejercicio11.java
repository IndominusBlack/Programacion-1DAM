import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la hora");
        int hora = sc.nextInt();

        System.out.println("Introduce los minutos");
        int minutos = sc.nextInt();

        if ((hora >= 0)&&(hora<24)){
            if ((minutos>=0)&&(minutos<60)){
            int horaRestante = 23 - hora;
            int minRestante = 60 - minutos;
            int segRestante = horaRestante*3600 + minRestante*60;
            System.out.println("Quedan " + segRestante + " segundos para medianoche.");
            } else {
                System.out.println("Esa hora no existe");
            }
        } else {
            System.out.println("Esa hora no existe");
        }
    }
}
