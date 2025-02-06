
import java.util.Scanner;

/**
 * Sistema de Gestión de Servicios de un hotel.
 *
 * @author Eduardo Heras
 *
 * Clase: PruebaServiciosHotel Esta clase contiene el main.
 */
public class PruebaServiciosHotel {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * Esta función muestra el menú por pantalla.
     */
    public static void menu() {
        System.out.println(GREEN_BRIGHT + "Sistema de Gestión de Servicios de un Hotel." + RESET);
        System.out.println("-----------------------------------------------------");
        System.out.println(GREEN_BRIGHT + "1." + RESET + " Consultar la tabla.");
        System.out.println(GREEN_BRIGHT + "2." + RESET + " Añadir un nuevo servicio a la tabla.");
        System.out.println(GREEN_BRIGHT + "3." + RESET + " Borrar una entrada completa de la tabla");
        System.out.println(GREEN_BRIGHT + "4." + RESET + " Borrar un servicio de la tabla");
        System.out.println(GREEN_BRIGHT + "5." + RESET + " Salir del programa");
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) throws Exception {

        boolean salir = false;                                  //Inicialización de variables.
        Scanner sc = new Scanner(System.in);
        ServiciosHotel hotel = new ServiciosHotel();

        while (!salir) {                                                //Siempre que la variable "salir" no sea true, ejecutar el programa.
            menu();
            System.out.printf("Selecciona una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {                                      //Un switch que según la elección del usuario haga una cosa u otra.
                case 1:
                    System.out.print("Ingrese el nombre del hotel a consultar: ");
                    String hotelConsulta = sc.nextLine();
                    hotel.consultarServicios(hotelConsulta);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del hotel: ");
                    String hotelNuevo = sc.nextLine();
                    System.out.print("Ingrese el servicio a agregar: ");
                    String servicioNuevo = sc.nextLine();
                    hotel.añadirServicio(hotelNuevo, servicioNuevo);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del hotel a borrar: ");
                    String hotelBorrar = sc.nextLine();
                    hotel.borrarHotel(hotelBorrar);
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del hotel: ");
                    String hotelServicio = sc.nextLine();
                    System.out.print("Ingrese el servicio a borrar: ");
                    String servicioBorrar = sc.nextLine();
                    hotel.borrarServicio(hotelServicio, servicioBorrar);
                    break;

                case 5:
                    salir = true;

                default:
                    System.out.println("");
            }
        }
        System.out.println("Saliendo del programa...");                                   //En caso de seleccionar la opción 5, salir del programa y mostrar un mensaje de salida.
        sc.close();                                                                         //Cerrar la clase Scanner.
    }
}
