public class Ejercicio3 {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca un numero del 1 al 7 y te digo qué día de la semana es: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaSemana;
    
    switch (dia) {
        case 1:
            diaSemana = "Lunes";
            break;

        case 2:
            diaSemana = "Martes";
            break;

        case 3:
            diaSemana = "Miércoles";
            break;

        case 4:
            diaSemana = "Jueves";
            break;

        case 5:
            diaSemana = "Viernes";
            break;

        case 6:
            diaSemana = "Sábado";
            break;

        case 7:
            diaSemana = "Domingo";
            break;
        
        default:
            diaSemana = "Piénsatelo dos veces antes de escribir una tontería, por favor...";
            break;

    }
    
        System.out.println(diaSemana);
    
    }
}
