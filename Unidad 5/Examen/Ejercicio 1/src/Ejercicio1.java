import java.util.Scanner;

public class Ejercicio1 {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        int intentos = 0;                                       //Creamos una variable que contabilice el número de intentos.
        boolean contrasenaValida = false;                       //Creamos una variable que detecte si la contraseña es válida o no.

        while (intentos<3){                                    //Creamos un bucle en el que dejamos que el programa funcione siempre y cuando el número de intentos no supere los 3
        System.out.printf("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        if (contrasena.length() < 8) {                          //Creamos un if que solo funcionará si el largo de la contraseña es mayor a 8 caracteres. Esto se asegurará de que el usuario no introduzca contraseñas vacías.
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");       //Mostramos el error por pantalla de que la contraseña debe tener al menos 8 caracteres
            intentos++;                                         //Añadimos 1 al contador de intentos
        } else {
            boolean contieneMayus = false;                      //Creamos variables booleanas para guardar más adelante si la contraseña cumple todos los requisitos.
            boolean contieneMinus = false;
            boolean contieneCarEsp = false;
            boolean contieneNum = false;
            boolean contieneEsp = false;
        
        for (int i = 0; i < contrasena.length(); i++) {        //Creamos un bucle en el que la condicion que debe cumplirse para que acabe es que se hayan analizado todos los caracteres uno por uno.
            char caracter = contrasena.charAt(i);

            if (caracter>='A' && caracter<='Z') {               //Comenzamos todos los if para saber si la contraseña cumple todos los requisitos
                contieneMayus = true;
            }

            if (caracter>='a' && caracter<='z') {
                contieneMinus = true;
            }

            if (caracter=='!' || caracter=='@' || caracter=='!' || caracter=='$' || caracter=='%' || caracter=='^' || caracter=='&' || caracter=='*' || caracter=='(' || caracter==')' || caracter=='-' || caracter=='_' || caracter=='+' || caracter=='=' || caracter=='<' || caracter=='>' || caracter=='?' || caracter=='/' || caracter=='.' || caracter==',' || caracter==';' || caracter==':') {
                contieneCarEsp = true;
            }

            if (caracter>='0' && caracter<='9') {
                contieneNum = true;
            }

            if (caracter==' ') {
                contieneEsp = true;
            }

            if (contieneEsp) {
                System.out.println(RED_BRIGHT + "Error: La contraseña no debe contener espacios." + RESET);
                intentos++;                                //Añadimos 1 al contador de intentos
            }

            if (!contieneMinus) {                          //Análisis de todos los requisitos gracias a las variables booleanas
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una letra minúscula." + RESET);
            } else if (!contieneMayus) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una letra mayúscula." + RESET);
            } else if (!contieneNum) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un número." + RESET);
            } else if (!contieneCarEsp) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un carácter especial." + RESET);
            } else {
                System.out.println(GREEN_BRIGHT + "Contraseña segura." + RESET);
                contrasenaValida = true;
            }

            if (!contrasenaValida) {                    //Si la contraseña es válida (es decir, pasa todos los filtros)
                intentos++;                             //Añadimos 1 al contador de intentos
                break;                                  //Finalizamos el bucle
            }

            if (intentos == 3) {                        //Si el número de intentos es igual a 3, entonces habremos acabado el número de intentos, y se finalizará el programa.
                System.out.println(YELLOW_BRIGHT + "Número máximo de intentos alcanzado." + RESET);
                break;
            }
        i++;
        }
        }
    }
}
}

//Soy consciente de que el programa solamente analiza el primer carácter de la contraseña, pero aunque no
//haya podido comprobarlo, creo que mi código tiene bastante coherencia y sentido, es una lástima que no haya
//podido completar mi programa, probablemente debido a un fallo de planteamiento desde el principio.
