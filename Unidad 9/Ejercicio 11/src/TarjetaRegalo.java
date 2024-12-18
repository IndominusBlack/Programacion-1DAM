public class TarjetaRegalo {

    String id;
    double saldo;

    public TarjetaRegalo (double SaldoInicial) {
        this.saldo = SaldoInicial;
        this.id = generarId();
    }

    public double getSaldo () {
        return this.saldo;
    }

    public void gasta (double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo-=cantidad;
        } else {
            System.out.println("No hay saldo");
        }
    }

    private String generarId() {
        String id = "";
        for (int i=0; i<5; i++){
            int cifra = (int) (Math.random()*10);
            id += Integer.toString(cifra);
        }
        return id;
    }

    public TarjetaRegalo fusionaCon (TarjetaRegalo t2){
        double saldoNuevo = this.saldo + t2.getSaldo();

    TarjetaRegalo t3 = new TarjetaRegalo(saldoNuevo);

    this.saldo = 0;
    t2.setSaldo (0);
    return t3;
    }

    public void setSaldo (double miSaldo) {
        this.saldo = miSaldo;
    }

    public String toString () {
        return "Tarjeta nº " + this.id + " - Saldo " + this.saldo + "$";
    }
}
