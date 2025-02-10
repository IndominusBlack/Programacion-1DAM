public class Estudiante {
    private int id;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Id del estudiante " + this.nombre + ": " + this.id;
    }
}
