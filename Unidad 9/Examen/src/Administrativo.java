
/**
 * Ejercicio: Gestión de empleados
 * clase Administrativo
 *
 * @author Eduardo Heras
 */

public class Administrativo extends Empleado implements CalculosLaborales {

    private String area;        //Inicialización de variables

    /**
     * Método constructor de administrativos
     *
     * @param nombre
     * @param edad
     * @param idEmpl
     * @param salBas
     * @param anosTrab
     * @param area
     */
    public Administrativo(String nombre, int edad, String idEmpl, double salBas, int anosTrab, String area) {
        super(nombre, edad, idEmpl, salBas, anosTrab);
        this.area = area;
    }

    /**
     * Método para calcular la bonificación de cada trabajador
     */
    @Override
    public double calcularBonificacion() {
        if (area.toLowerCase().equals("recursos humanos")) {
            System.out.println("Este trabajador recibirá una bonificación de " + 20 * 30 + "€ por formar parte del área de " + area);
            return 20 * 30;
        } else {
            System.out.println("Este trabajador recibirá una bonificación de " + 10 * 30 + "€ por formar parte del área de " + area);
            return 10 * 30;
        }
    }

    /**
     * Método para calcular el salario de cada trabajador en base al salario
     * base y la bonificación del anterior método.
     */
    @Override
    public double calcularSalario() {
        System.out.println("Este administrativo va a recibir " + getSalarioBase() + calcularBonificacion() + "€ este mes.");
        return getSalarioBase() + calcularBonificacion();
    }

    /**
     * Método para calcular cuántos días de trabajo le equivalen a cada
     * trabajador según los años que lleve trabajando en la empresa
     */
    @Override
    public int calcularVacaciones() {
        System.out.println("A este gestor le equivalen " + getAnosDeTrabajo() * 15 + " días de vacaciones");
        return getAnosDeTrabajo() * 15;
    }

    @Override
    public String toString() {               //Método toString para mostrar por pantalla los datos del administrativo
        return super.toString() + ", Área: " + area;
    }

}
