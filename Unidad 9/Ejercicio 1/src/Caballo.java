public class Caballo {

    String nombre;
    String raza;
    String pelo;

    Caballo (String nombre, String raza, String pelo) {
        this.nombre = nombre;
        this.raza = raza;
        this.pelo = pelo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPelo () {
        return this.pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String toString() {
        return "Mi caballo se llama " + nombre + ", es de raza " + raza + " y es de pelo " + pelo;
    }

    public static void main(String[] args) {
    
    Caballo miCab = new Caballo("Bucéfalo","Árabe","Arzal");

    miCab.setPelo("Tordo");

    String nom = miCab.getNombre();

    System.out.println(miCab);
    }
}
