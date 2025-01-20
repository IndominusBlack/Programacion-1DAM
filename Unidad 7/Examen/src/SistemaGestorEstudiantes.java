
import java.util.Scanner;

public class SistemaGestorEstudiantes {

    /**
     * Método para crear una línea. Claramente prescindible, pero, ¿quién no
     * necesita una de vez en cuando?
     */
    public static void hacerLinea() {
        System.out.println("===========================================");
    }

    /**
     * Función para crear el menú del programa
     */
    public static void menu() {
        System.out.println("1. Agregar un estudiante");
        System.out.println("2. Agregar nota a un estudiante");
        System.out.println("3. Mostrar información de todos los estudiantes");
        System.out.println("4. Mostrar estudiantes con promedio mayor a un valor");
        System.out.println("5. Buscar un estudiante por su nombre");
        System.out.println("6. Salir");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiante = new Estudiante[10];
        GestorEstudiantes gestorEstudiantes = new GestorEstudiantes();
        int opcion;

        do {                                                                                                //Bucle para ejecutar el programa siempre y cuando el usuario no quiera salirse del mismo
            System.out.println("Sistema Gestor de Estudiantes (Selecciona una opción del 1 al 6):");
            hacerLinea();
            menu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.printf("Ingrese el nombre del estudiante: ");                             //Caso 1: Ingresar el nombre del estudiante
                    String nombreEstudiante = sc.nextLine();
                    gestorEstudiantes.agregarEstudiante(nombreEstudiante);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");                                       //Caso 2: Ingresarle una nota a un estudiante
                    String nombreNota = sc.nextLine();
                    System.out.print("Ingrese la nota: ");
                    try {
                        double nota = Double.parseDouble(sc.nextLine());
                        gestorEstudiantes.agregarNotaAEstudiante(nombreNota, nota);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número real para la nota.");
                    }
                    break;
                case 3:
                    gestorEstudiantes.mostrarEstudiantes();                                                        //Caso 3: Mostrar la información de todos los estudiantes
                    break;
                case 4:                                                                                        //Caso 4: Este no he sabido hacerlo pero aquí está
                    System.out.println("Función aún sin completar.");
                    System.out.println("Disculpen las molestias.");
                    break;

                case 5:                                                                                        //Caso 5: Búsqueda de estudiantes según el nombre
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreBuscar = sc.nextLine();
                    Estudiante estudianteEncontrado = gestorEstudiantes.buscarEstudiante(nombreBuscar);
                    if (estudianteEncontrado != null) {
                        System.out.println(estudianteEncontrado);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 6:                                                                                        //Caso 6: esta cierra el programa y muestra un mensaje sobre eso
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, introduzca una opción válida.");
            }
        } while (opcion != 6);
        sc.close ();
    }
}
