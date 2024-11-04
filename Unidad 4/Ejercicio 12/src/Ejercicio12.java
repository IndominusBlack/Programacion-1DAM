import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Examen tipo test Sistemas Informáticos");
        System.out.println("--------------------------------------");

        System.out.println("1. ¿Qué componente es responsable de realizar cálculos y operaciones lógicas en un sistema informático?");
        System.out.println("a) CPU");
        System.out.println("b) Disco duro");
        String respuesta1 = sc.nextLine();

        System.out.println("2. ¿Cuál es el propósito de la memoria RAM en un sistema informático?");
        System.out.println("a) Almacenar datos temporalmente");
        System.out.println("b) Proveer almacenamiento permanente");
        String respuesta2 = sc.nextLine();

        System.out.println("3. ¿Qué tipo de memoria se usa para almacenar el sistema operativo y los archivos de programas que se cargan al iniciar el computador?");
        System.out.println("a) RAM");
        System.out.println("b) ROM");
        String respuesta3 = sc.nextLine();

        System.out.println("4. ¿Cuál de los siguientes es un ejemplo de software de sistema?");
        System.out.println("a) Microsoft Word");
        System.out.println("b) Windows 10");
        String respuesta4 = sc.nextLine();

        System.out.println("5. ¿Qué dispositivo se utiliza para convertir datos analógicos a digitales y viceversa en una red?");
        System.out.println("a) Modem");
        System.out.println("b) Teclado");
        String respuesta5 = sc.nextLine();

        System.out.println("6. ¿Cuál es el término para el software que permite la interacción del usuario con el hardware del computador?");
        System.out.println("a) Sistema operativo");
        System.out.println("b) Procesador");
        String respuesta6 = sc.nextLine();

        System.out.println("7. ¿Cuál es la principal función de un servidor en una red?");
        System.out.println("a) Procesar datos gráficos");
        System.out.println("b) Proveer servicios a otros computadores");
        String respuesta7 = sc.nextLine();

        System.out.println("8. ¿Qué significa el acrónimo \"BIOS\"?");
        System.out.println("a) Basic Input/Output System");
        System.out.println("b) Binary Input/Output System");
        String respuesta8 = sc.nextLine();

        System.out.println("9. ¿Cuál de los siguientes dispositivos se utiliza para entrada de datos?");
        System.out.println("a) Monitor");
        System.out.println("b) Teclado");
        String respuesta9 = sc.nextLine();

        System.out.println("10. ¿Qué tipo de almacenamiento es típicamente más rápido?");
        System.out.println("a) SSD (Solid State Drive)");
        System.out.println("b) HDD (Hard Disk Drive)");
        String respuesta10 = sc.nextLine();

        sc.close();

        int nota = 0;

        if ("a".equals(respuesta1)){
            nota+=1;
        }

        if ("a".equals(respuesta2)){
            nota+=1;
        }

        if ("b".equals(respuesta3)){
            nota+=+1;
        }

        if ("b".equals(respuesta4)){
            nota+=1;
        }

        if ("a".equals(respuesta5)){
            nota+=1;
        }

        if ("a".equals(respuesta6)){
            nota+=1;
        }

        if ("b".equals(respuesta7)){
            nota+=1;
        }

        if ("a".equals(respuesta8)){
            nota+=1;
        }

        if ("b".equals(respuesta9)){
            nota+=1;
        }

        if ("a".equals(respuesta10)){
            nota+=1;
        }

        System.out.println("Tu nota es un " + nota);
    }
}
