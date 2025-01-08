import java.util.Scanner;

public class GestionEstudiantes {
    
    public Estudiante registrarEstudiante() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la matrícula del estudiante:");
        String matricula = sc.nextLine();

        System.out.println("Introduce el nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Introduce la edad del estudiante:");
        int edad = sc.nextInt();

        System.out.println("Introduce el promedio del estudiante:");
        double promedio = sc.nextDouble();

        sc.close();

    return new Estudiante(matricula, nombre, edad, promedio);
    }

    public void mostrarEstudiante(Estudiante estudiante) {
        System.out.println(estudiante);
    }
}

