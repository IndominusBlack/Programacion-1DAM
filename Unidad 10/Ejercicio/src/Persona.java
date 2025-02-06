public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }

    @Override
    public boolean equals(Object o){
        return this==o || (this.getClass()==o.getClass() && this.nombre.equals(((Persona)o).nombre) && this.edad == ((Persona)o).edad);
    }
    
}