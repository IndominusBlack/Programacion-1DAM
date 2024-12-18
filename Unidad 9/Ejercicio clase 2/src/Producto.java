public class Producto {

    private String nombre;
    private int cantidadTotal;
    private String descripcion;

    public Producto (String nombre, String descripcion, int cantidadTotal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadTotal = cantidadTotal;
    }

    public boolean vende (int cantidad) {
        if (cantidad <= cantidadTotal) {
            cantidadTotal -= cantidad;
            return true;
        } else {
            System.out.println("No hay stock suficiente.");
            return false;
        }
    }

    public void reponer (int cantidad) {
        this.cantidadTotal+=cantidad;
    }

    public void setDescripcion (String des) {
        this.descripcion = des;
    }

    public String getNombre () {
        return this.nombre;
    }

    public int getCantidad () {
        return this.cantidadTotal;
    }

    public String getDescripcion () {
        return this.descripcion;
    }

    public String toString(){
        return "El producto " + nombre + " tiene un total de " + cantidadTotal + " unidades y su descripción es " + descripcion;
    }

}