import java.util.Scanner;

public class DreamTeam implements Interactuador {

    public static void menu(){
    System.out.println("Menú:");
    System.out.println("--------------------------------------");
    System.out.println("1. Añadir socio");
    System.out.println("2. Baja socio");
    System.out.println("3. Modificar socio");
    System.out.println("4. Listar todos los socios");
    System.out.println("5. Buscar socio");
    System.out.println("6. Salir del programa");
    }

    public int leerOpcion(){

    }

    public void añadirSocio(){
        System.out.println("Dime el nombre del socio");
        GestorSocios.create();
    }

    public bajaSocio(){

    }
    
    public modificarSocio(){

    }
    
    public listarTodos(){
        GestorSocios.query();

    }
    
    public buscarSocio(){

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        boolean salir = false;
        
        while (salir != true) {
        menu();
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                añadirSocio();
                break;
            
            case 2:
                bajaSocio();
                break;

            case 3:
                modificarSocio();
                break;

            case 4:
                listarTodos();
                break;

            case 5:
                buscarSocio();
                break;

            case 6:
                salir = true;

            default:
                System.out.println("Seleccione una opción válida.");;
        }
    }
    System.out.println("Saliendo del programa...");
    sc.close();
    }
}
