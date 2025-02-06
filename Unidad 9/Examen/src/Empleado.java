
/**
 * Ejercicio: Gestión de empleados
 * clase Empleado
 *
 * @author Eduardo Heras
 */

/**
 * Definición de la clase empleado.
 */
public abstract class Empleado {

    private String nombre;                      //Inicialización de variables
    private int edad;
    private String idEmpleado;
    private double salarioBase;
    private int anosDeTrabajo;

    private static int totalEmpleados = 0;

    /**
     * Constructor de cualquier empleado
     *
     * @param nombre
     * @param edad
     * @param idEmpl
     * @param salBas
     * @param anosTrab
     */
    public Empleado(String nombre, int edad, String idEmpl, double salBas, int anosTrab) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpl;
        this.salarioBase = salBas;
        this.anosDeTrabajo = anosTrab;
        totalEmpleados++;
    }

    public String getNombre() {         //Getter del nombre, devuelve el nombre
        return this.nombre;
    }

    public void setNombre(String nom) {         //Setter del nombre del empleado
        this.nombre = nom;
    }

    public int getEdad() {              //Getter de la edad, devuelve la edad
        return this.edad;
    }

    public void setEdad(int edad) {             //Setter de la edad del empleado
        this.edad = edad;
    }

    public String getIdEmpleado() {     //Getter del id del empleado, devuelve el id del empleado
        return this.idEmpleado;
    }

    public void setIdEmpleado(String idEmpl) {      //Setter del id del empleado
        this.idEmpleado = idEmpl;
    }

    public double getSalarioBase() {    //Getter del salario base, devuelve el salario base
        return this.salarioBase;
    }

    public void setSalarioBase(double salBas) {     //Setter del salario base del empleado
        this.salarioBase = salBas;
    }

    public int getAnosDeTrabajo() {     //Getter de los años de trabajo, devuelve los años de trabajo
        return this.anosDeTrabajo;
    }

    public void setAnosDeTrabajo(int anosTrab) {        //Setter de los años trabajados del empleado
        this.anosDeTrabajo = anosTrab;
    }

    public static int getTotalEmpleados() {      //Getter del total de empleados, devuelve el total de empleados
        return totalEmpleados;
    }

    @Override
    public String toString() {                   //Método toString para mostrar por pantalla los datos del empleado
        return "Empleado: " + nombre + ", Edad: " + edad + ", ID: " + idEmpleado + ", Salario base: " + salarioBase + ", Años de trabajo: " + anosDeTrabajo + ".";
    }
}
