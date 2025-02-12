import java.io.*;

public class CPIFP implements Serializable<Estudiante>{
    private String nombre;
    private String direccion;
    private int telefono;
    private String nombreFichero;

    public CPIFP(String nombre, String direccion, int telefono, String nombreFichero) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nombreFichero = nombreFichero;
    }

    public boolean añadirEstudiante(int idEst, String nombreEst){
        if (obtenerEstudiante(idEst) == null){
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero, true));
                Estudiante estudiante = new Estudiante(idEst, nombreEst);
                escritor.write(serializarEstudiante(estudiante));
                escritor.newLine();
                escritor.close();
                return true;
            } catch (IOException IOE) {
                System.out.println(IOE.getMessage());
                return false;
            }
        }
        return false;
    }

    public boolean quitarEstudiante(int idEst) {
        File archivoOriginal = new File(nombreFichero);
        File archivoTemporal = new File(nombreFichero + ".tmp");
        boolean encontrado = false;
    
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {
    
            String linea;
            while ((linea = br.readLine()) != null) {
                Estudiante estudiante = deserializarEstudiante(linea);
                if (estudiante.getId() != idEst) {
                    bw.write(linea);
                    bw.newLine();
                } else {
                    encontrado = true; // Marcar que el estudiante fue encontrado y eliminado
                }
            }
    
        } catch (IOException e) {
            System.out.println("Error al leer o escribir archivos: " + e.getMessage());
            return false;
        }
    
        // Cerrar los flujos antes de eliminar/renombrar
        if (!encontrado) {
            System.out.println("Estudiante con ID " + idEst + " no encontrado.");
            archivoTemporal.delete(); // Eliminamos el archivo temporal si no hubo cambios
            return false;
        }
    
        // Intentamos eliminar el archivo original
        if (!archivoOriginal.delete()) {
            System.out.println("Error: No se pudo eliminar el archivo original.");
            return false;
        }
    
        // Renombramos el archivo temporal para que sea el definitivo
        if (!archivoTemporal.renameTo(archivoOriginal)) {
            System.out.println("Error: No se pudo renombrar el archivo temporal.");
            return false;
        }
    
        return true;
    }
    

    public boolean modificarEstudiante(int idEst, String nombreEst){
        if (quitarEstudiante(idEst)) {
            return añadirEstudiante(idEst, nombreEst);
        }
        return false;
    }

    public String obtenerEstudiante(int idEst){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String linea;
            Estudiante estudiante = new Estudiante(0, "");
            while ((linea = reader.readLine()) != null){
                estudiante = deserializarEstudiante(linea);
                if (estudiante.getId()==idEst){
                    reader.close();
                    return estudiante.toString();
                }
            }
            reader.close();
            return null;
        } catch (IOException IOE) {
            System.out.println(IOE.getMessage());
            return null;
        }
    }

    public String listarEstudiante(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String linea = "";
            StringBuilder constructorListado = new StringBuilder();
            Estudiante estudiante = new Estudiante(0, "");
            while ((linea = reader.readLine()) != null) {
                estudiante = deserializarEstudiante(linea);
                constructorListado.append(estudiante.toString() + "\n");
            }
            reader.close();
            return constructorListado.toString();
        } catch (IOException IOE) {
            System.out.println(IOE.getMessage());
            return null;
        }
    }

    @Override
    public String serializarEstudiante(Estudiante estudiante){
        return String.format("%d;%s", estudiante.getId(), estudiante.getNombre());
    }

    @Override
    public Estudiante deserializarEstudiante(String datos){
        String[] datosArray = datos.split(";");
        int id = Integer.parseInt(datosArray[0]);
        String nombre = datosArray[1];
        Estudiante estudiante = new Estudiante(id, nombre);
        return estudiante;
    }
}
