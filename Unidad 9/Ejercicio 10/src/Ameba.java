public class Ameba {

    private int peso;
    private String nombre;
    private int altura;

    public Ameba(String nombre, int altura) {
        this.peso = 3;
        this.nombre = nombre;
        this.altura = altura;
    }

    public void come (int pesoParticula){
        this.peso += pesoParticula-1;
    }

    public void come (Ameba otraAmeba) {
        this.peso+= otraAmeba.getPeso()-1;
        otraAmeba.setPeso(0);
    }

    public int getPeso () {
        return peso;
    }

    public String getNombre () {
        return nombre;
    }

    public int getAltura () {
        return altura;
    }

    public void setNombre (String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setPeso (int nuevoPeso) {
        peso = nuevoPeso;
    }

    public String toString() {
        return "La ameba " + nombre + " pesa " + peso + " y mide " + altura;
    }
}
