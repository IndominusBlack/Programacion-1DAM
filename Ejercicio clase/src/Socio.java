public class Socio {
    private int id;
    private String nombre;
    private int estatura;
    private int edad;
    private String localidad;

    public Socio(int id, String nombre, int estatura, int edad, String localidad) {
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
        this.localidad = localidad;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", estatura: " + estatura + ", edad: " + edad + ", localidad: " + localidad + ".";
    }

}