public class Estudiante {

    private String matricula;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante (String matricula, String nombre, int edad, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        setEdad(edad);
        setPromedio(promedio);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            this.promedio = 0.0;
        }
    }

    public String toString () {
        return "Estudiante[matrícula=" + matricula + ", nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + "]";
    }
}