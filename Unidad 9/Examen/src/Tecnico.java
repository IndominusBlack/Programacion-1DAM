
/**
 * Ejercicio: Gestión de empleados
 * clase Empleado
 *
 * @author Eduardo Heras
 */

public class Tecnico extends Empleado implements CalculosLaborales {

    String especialidad;            //Inicialización de variables

    /**
     * Método constructor de técnicos
     *
     * @param nombre
     * @param edad
     * @param idEmpl
     * @param salBas
     * @param anosTrab
     * @param espec
     */
    public Tecnico(String nombre, int edad, String idEmpl, double salBas, int anosTrab, String espec) {
        super(nombre, edad, idEmpl, salBas, anosTrab);
        this.especialidad = espec;
    }

    /**
     * Método para calcular la bonificación de cada trabajador
     */
    @Override
    public double calcularBonificacion() {
        System.out.printf("Este trabajador recibirá una bonificación de " + calcularBonificacion() + "€ ");
        if (especialidad.toLowerCase().equals("redes")) {
            System.out.println("por formar parte del equipo de " + especialidad);
            return 1000;
        } else if (especialidad.toLowerCase().equals("seguridad")) {
            System.out.println("por formar parte del equipo de " + especialidad);
            return 1200;
        } else {
            return 800;
        }
    }

    /**
     * Método para calcular el salario de cada trabajador en base al salario
     * base y la bonificación del anterior método.
     */
    @Override
    public double calcularSalario() {
        System.out.println("Este trabajador va a recibir " + getSalarioBase() + calcularBonificacion() + "€ este mes.");
        return getSalarioBase() + calcularBonificacion();
    }

    /**
     * Método para calcular cuántos días de trabajo le equivalen a cada
     * trabajador según los años que lleve trabajando en la empresa
     */
    @Override
    public int calcularVacaciones() {
        System.out.println("A este trabajador le equivalen " + getAnosDeTrabajo() * 20 + " días de vacaciones");
        return getAnosDeTrabajo() * 20;
    }

    @Override
    public String toString() {           //Método toString para mostrar por pantalla los datos del tecnico
        return super.toString() + ", Especialidad: " + especialidad;
    }
}
