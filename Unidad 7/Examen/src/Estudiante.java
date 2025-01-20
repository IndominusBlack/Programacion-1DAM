public class Estudiante {
    private String nombre; // Definición e inicialización de las variables correspondientes
    private double[] notas = new double[10];
    private int cantidadNotas;

    public Estudiante(String nombre) { // Clase pública Estudiante
        this.nombre = nombre;
        this.notas = notas;
        this.cantidadNotas = 0;
    }

    /**
     * Getter para obtener el nombre del estudiante
     * 
     * @return nombre (del estudiante)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Agrega una nota a un estudiante siempre que su cantidad de notas no sea mayor
     * que 10, suma 1 a la variable "CantidadNotas",
     * y muestra un mensaje por pantalla en caso de éxito/error.
     * 
     * @param nota
     */
    public void agregarNota(double nota) {
        if (cantidadNotas < 10) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
            System.out.println("Nota agregada exitosamente.");
        } else {
            System.out.println("No se puede agregar más notas. Capacidad máxima alcanzada.");
        }
    }

    /**
     * Calcula el promedio de las notas del estudiante, recibiendo la suma de todas
     * ellas y dividiendolas entre la cantidad de notas totales.
     * 
     * @return suma/cantidadNotas (el promedio de la suma de todas las notas entre
     *         la cantidad de ellas).
     */
    public double calcularPromedio() {
        double suma = 0.0;

        if (cantidadNotas == 0) {
            return 0.0;
        }

        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }

    /**
     * Método toString para mostrar por pantalla la información del estudiante
     */
    @Override
    public String toString() {
        return "Estudiante[nombre=" + nombre + "; notas=" + notas + "; promedio=" + calcularPromedio();
    }
}
