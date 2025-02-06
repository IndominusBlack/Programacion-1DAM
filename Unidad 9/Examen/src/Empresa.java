
/**
 * Ejercicio: Gestión de empleados
 * clase Empresa
 *
 * @author Eduardo Heras
 */

public class Empresa {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * Main
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Empleado[] empleado = new Empleado[3];

        empleado[0] = new Tecnico("Juan Pérez", 38, "T003", 2100, 5, "Redes");                  //Defino los parámetros de los empleados
        empleado[1] = new Gestor("Ana González", 43, "G017", 3000, 8, 65000);
        empleado[2] = new Administrativo("Carlos Cieza", 34, "A009", 1500, 2, "Recursos humanos");

        for (int i = 0; i < 3; i++) {           //Bucle para mostrar los 3 empleados con sus datos
            System.out.println(GREEN_BRIGHT + "Empleado número " + i + 1 + ":" + RESET);
            System.out.println(empleado[i]);
            System.out.println("Cálculo del salario no disponible por el momento, disculpen las molestias");                            //Mostrar estos dos datos no me ha sido posible, por lo que al menos mostrar por pantalla un mensaje de disculpas por ello
            System.out.println("Cálculo de las vacaciones no disponibles por el momento, disculpen las molestias");
            System.out.println("");
            System.out.println("=============================================================================================================");
        }

        System.out.println(RED_BRIGHT + "Número total de empleados creados: " + Empleado.getTotalEmpleados() + RESET);      //Muestra el total de empleados creados

    }
}
