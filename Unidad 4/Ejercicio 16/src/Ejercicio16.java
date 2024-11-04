import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Test para parejas infieles. (Responde a las preguntas con \"Si\" o \"No\"");
        System.out.println("---------------------------");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String respuesta1 = sc.nextLine();

        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        String respuesta2 = sc.nextLine();

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        String respuesta3 = sc.nextLine();

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        String respuesta4 = sc.nextLine();

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil\r");
        String respuesta5 = sc.nextLine();

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        String respuesta6 = sc.nextLine();

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        String respuesta7 = sc.nextLine();

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        String respuesta8 = sc.nextLine();

        System.out.println("9. Has notado que últimamente se perfuma más");
        String respuesta9 = sc.nextLine();

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\r");
        String respuesta10 = sc.nextLine();

        sc.close();

        int nota = 0;

        if ("Si".equals(respuesta1)){
            nota+=3;
        }

        if ("Si".equals(respuesta2)){
            nota+=3;
        }

        if ("Si".equals(respuesta3)){
            nota+=+3;
        }

        if ("Si".equals(respuesta4)){
            nota+=3;
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
