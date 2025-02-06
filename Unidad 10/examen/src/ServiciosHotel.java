
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Sistema de Gestión de Servicios de un hotel.
 *
 * @author Eduardo Heras
 *
 * Clase: PruebaServiciosHotel Esta clase contiene ela definición del Hashmap y
 * todos los métodos.
 */
public class ServiciosHotel {

    private HashMap<String, ArrayList<String>> serviciosPorHotel = new HashMap<>();     //Inicialización del HashMap

    /**
     * Método constructor.
     */
    public ServiciosHotel() {
        this.serviciosPorHotel = new HashMap<>();
    }

    /**
     * Este método te permite consultar los servicios de un hotel siempre y
     * cuando ese hotel exista.
     *
     * @param hotel
     */
    public void consultarServicios(String hotel) {
        if (serviciosPorHotel.containsKey(hotel)) {
            System.out.println("Servicios del hotel " + hotel + ": " + serviciosPorHotel.get(hotel));
        } else {
            System.out.println("El hotel " + hotel + " no existe en el registro.");
        }
    }

    /**
     * Este método te permite añadirle un servicio a un hotel.
     *
     * @param hotel
     * @param servicio
     */
    public void añadirServicio(String hotel, String servicio) {
        serviciosPorHotel.put(hotel, new ArrayList<>());
        ArrayList<String> servicios = serviciosPorHotel.get(hotel);
        servicios.add(servicio);
        System.out.println("Servicio " + servicio + " añadido al hotel " + hotel + ".");
    }

    /**
     * Este método te permite borrar un hotel.
     *
     * @param hotel
     */
    public void borrarHotel(String hotel) {
        serviciosPorHotel.remove(hotel);
        System.out.println("El hotel " + hotel + " ha sido eliminado del registro.");
    }

    /**
     * Este método te permite borrar un servicio de un hotel (bueno, en este caso no).
     *
     * @param hotel
     * @param servicio
     */
    public void borrarServicio(String hotel, String servicio) {
        serviciosPorHotel.remove(hotel, new ArrayList<>());
        ArrayList<String> servicios = serviciosPorHotel.get(hotel);
        System.out.println("Servicio " + servicio + " eliminado del hotel " + hotel + ".");
    }

    /**
     * Este método te permite mostrar un hotel.
     *
     * @param key
     * @param value
     * @return
     */
    public String mostrarHotel(String key, ArrayList<String> value) {
        return "Hotel:" + key + " || Servicios: " + value;
    }
}
