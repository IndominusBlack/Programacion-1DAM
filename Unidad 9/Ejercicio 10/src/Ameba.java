public class Ameba {

    private int peso;
    public Ameba() {
        this.peso = 3;
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

    public void setPeso (int nuevoPeso) {
        peso = nuevoPeso;
    }
}
