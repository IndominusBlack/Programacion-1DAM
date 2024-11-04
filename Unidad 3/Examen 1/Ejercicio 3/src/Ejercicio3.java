public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        //Enunciado: Escribe un programa que imprima en pantalla (sin bucles) una pirámide invertida rellena de asteriscos. 
        //La base de la pirámide debe estar formada por 7 asteriscos. Todos los asteriscos que ocupen la posición n
        //en cada fila serán del mismo color (los primeros de un color, los siguientes de otro, etc.).

        System.out.println("\033[0;90m*\033[0;91m*\033[0;92m*\033[0;93m*\033[0;94m*\033[0;95m*\033[0;96m*");
        System.out.println(" \033[0;90m*\033[0;91m*\033[0;92m*\033[0;93m*\033[0;94m* ");
        System.out.println("  \033[0;90m*\033[0;91m*\033[0;92m*  ");
        System.out.println("   \033[0;90m*\033[0m   ");                                                         // Código del color, el asterisco (*), código para resetear colores.

        //Resumen: en este caso, ha sido tan sencillo como hacer una pirámide invertida con 7 asteriscos en su base y, acto
        //seguido, colorearlos uno a uno con el comando \033[0;9xm, seguido del propio asterisco.
    }
}
