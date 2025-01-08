public class SistemaGestionEstudiantes {

    public static String mayorPromedio(Estudiante estudiante1, Estudiante estudiante2) {
        if (estudiante1.getPromedio() > estudiante2.getPromedio()) {
            return "El estudiante con el mayor promedio es: " + estudiante1.getNombre();
        } else if (estudiante1.getPromedio() < estudiante2.getPromedio()) {
            return "El estudiante con el mayor promedio es: " + estudiante2.getNombre();
        } else {
            return "Ambos estudiantes tienen el mismo promedio.";
        }
    }

    public static void main(String[] args) throws Exception {

        GestionEstudiantes miEst = new GestionEstudiantes();

        System.out.println("Registro del primer estudiante:");
        Estudiante estudiante1 = miEst.registrarEstudiante();

        System.out.println("Registro del segundo estudiante:");
        Estudiante estudiante2 = miEst.registrarEstudiante();

        System.out.println("La información de los estudiantes es la siguiente:");
        miEst.mostrarEstudiante(estudiante1);
        miEst.mostrarEstudiante(estudiante2);

        mayorPromedio(estudiante1, estudiante2);
    }
}
