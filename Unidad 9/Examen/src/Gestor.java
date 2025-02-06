
/**
 * Ejercicio: Gestión de empleados
 * clase Gestor
 *
 * @author Eduardo Heras
 */

public class Gestor extends Empleado implements CalculosLaborales {

    private double presupuesto;         //Inicialización de variables

    /**
     * Método constructor de gestores
     *
     * @param nombre
     * @param edad
     * @param idEmpl
     * @param salBas
     * @param anosTrab
     * @param pres
     */
    public Gestor(String nombre, int edad, String idEmpl, double salBas, int anosTrab, double pres) {
        super(nombre, edad, idEmpl, salBas, anosTrab);
        this.presupuesto = pres;
    }

    /**
     * Método para calcular la bonificación de cada trabajador
     */
    @Override
    public double calcularBonificacion() {
        if (presupuesto>=0){                    //nos aseguramos de que el presupuesto sea al menos 0, porque si no, no podría darse una bonificación
            System.out.println("La bonificación obtenida es de " + presupuesto * 0.05 + "€");
            return presupuesto * 0.05;
        } else {
            System.out.println("El presupuesto debe ser positivo para que la bonificación se pueda dar");
            return 0;
        }
    }

    /**
     * Método para calcular el salario de cada trabajador en base al salario
     * base y la bonificación del anterior método.
     */
    @Override
    public double calcularSalario() {
        System.out.println("Este gestor va a recibir " + getSalarioBase() + calcularBonificacion() + "€ este mes.");
        return getSalarioBase() + calcularBonificacion();
    }

    /**
     * Método para calcular cuántos días de trabajo le equivalen a cada
     * trabajador según los años que lleve trabajando en la empresa
     */
    @Override
    public int calcularVacaciones() {
        System.out.println("A este gestor le equivalen " + getAnosDeTrabajo() * 30 + " días de vacaciones");
        return getAnosDeTrabajo() * 30;
    }

    @Override
    public String toString() {           //Método toString para mostrar por pantalla los datos del gestor
        return super.toString() + ", Presupuesto: " + presupuesto + "€.";
    }

}
