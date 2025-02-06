public class Coche implements Serializable {
    private String matricula;
    private String marca;
    private int año;

    public Coche (String matr, String marc, int año) {
        matr = this.matricula;
        marc = this.marca;
        año = this.año;
    }

    public Coche (String linea) {
        this.deserializar(linea);
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matr) {
        matr = this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marc) {
        marc = this.marca;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año){
        año = this.año;
    }

    @Override
    public String serializar(){
        return String.format("%s;%s;%d", this.matricula, this.marca, this.año);
    }

    @Override
    public void deserializar(String linea) {
        String[] datos = linea.split(";");
        this.matricula = datos[0];
        this.marca = datos[1];
        this.año = Integer.parseInt(datos[2]);
    }
}