import java.util.Scanner;

public class gestorCPIFP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CPIFP instituto = new CPIFP("Alan Turing", "Frederick Terman, 3", 952789456, "estudiantes.txt");

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Mostrar un estudiante");
            System.out.println("5. Listar todos los estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int idAdd = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreAdd = scanner.nextLine();
                    instituto.añadirEstudiante(idAdd, nombreAdd);
                    break;
                case 2:
                    System.out.print("ID del estudiante a eliminar: ");
                    int idDel = scanner.nextInt();
                    instituto.quitarEstudiante(idDel);
                    break;
                case 3:
                    System.out.print("ID del estudiante a modificar: ");
                    int idMod = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nombreMod = scanner.nextLine();
                    instituto.modificarEstudiante(idMod, nombreMod);
                    break;
                case 4:
                    System.out.print("ID del estudiante a mostrar: ");
                    int idShow = scanner.nextInt();
                    System.out.println(instituto.obtenerEstudiante(idShow));
                    break;
                case 5:
                    System.out.println(instituto.listarEstudiante());
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
