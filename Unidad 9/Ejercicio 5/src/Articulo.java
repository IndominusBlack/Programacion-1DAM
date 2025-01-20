public class Articulo {
    
    private int codigo;
    private String descripcion;
    private int compra;
    private int venta;
    private int stock;

    public Articulo (int codigo, String descripcion, int compra, int venta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.compra = compra;
        this.venta = venta;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String des) {
        this.descripcion = des;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int com){
        this.compra = com;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int ven){
        this.venta = ven;
    }

    public int getStock() {
        return stock;
    }

    public void setStock (int sto){
        this.stock = sto;
    }

    public int entradaArticulos(int stock, int incremento) {
        return stock += incremento;
    }

    public int salidaArticulos(int stock, int decrecimiento) {
        return stock += decrecimiento;
    }

    @Override
    public String toString() {
        return "\nEl artículo con código " + codigo + " tiene los siguientes atributos: " + "\nDescripción: " + descripcion + "\nPrecio de compra: " + compra + "\nPrecio de venta: " + venta + "\nStock actual: " + stock;
    }
}
