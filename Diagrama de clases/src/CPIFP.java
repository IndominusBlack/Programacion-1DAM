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

    public boolean quitarEstudiante(int idEst){
        
    }

    public boolean modificarEstudiante(int idEst, String nombreEst){

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
        return String.format("%d; %s", estudiante.getId(), estudiante.getNombre());
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