
public class GestorEstudiantes {

    private Estudiante[] estudiantes = new Estudiante[20]; // Definición e inicialización de las variables
    // correspondientes
    private int cantidadEstudiantes = 0;

    /**
     * Creación de la gestión de estudiantes con los parámetros "Estudiantes" y
     * "CantidadEstudiantes"
     */
    public GestorEstudiantes() {
        this.estudiantes = new Estudiante[20];
        this.cantidadEstudiantes = 0;
    }

    /**
     * Agrega estudiantes siempre y cuando no haya más de 20, y suma 1 a la cantidad de estudiantes,
     * además muestra por pantalla mensajes de error y de éxito según la eficacia del mismo.
     * 
     * @param nombre
     */
    public void agregarEstudiante(String nombre) {
        if (cantidadEstudiantes < 20) {
            estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
            cantidadEstudiantes++;
            System.out.println("Estudiante agregado exitosamente");
        } else {
            System.out.println("No se puede agregar más estudiantes.");
        }
    }

    /**
     * Función que sirve para buscar al estudiante requerido.
     * 
     * @param nombre
     * @return null (en caso de no encontrar estudiante) o estudiantes[i] (en caso de encontrar el estudiante)
     */
    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    /**
     * Agrega una nota al estudiante con el nombre que indiques.
     * 
     * @param nombre
     * @param nota
     */
    public void agregarNotaAEstudiante(String nombre, double nota) {
        Estudiante estudianteNota = buscarEstudiante(nombre);
        if (estudianteNota != null) {
            estudianteNota.agregarNota(nota);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    /**
     * Muestra estudiantes por pantalla siempre y cuando la cantidad de estudiantes sea superior a 0.
     */
    public void mostrarEstudiantes() {
        if (cantidadEstudiantes > 0) {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println(estudiantes[i]);
            }
        } else {
            System.out.println("No hay estudiantes registrados.");
        }
    }

    /**
     * Función sin realizar, pero que teóricamente debería mostrar los estudiantes con mayor promedio a X
     * 
     * @param promedio
     */
    public void mostrarEstudiantesConPromedioMayorA(double promedio) {

    }
}
