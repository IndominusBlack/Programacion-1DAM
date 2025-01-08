
public class Ejercicio10 {

    public static void main(String[] args) throws Exception {
        Ameba a1 = new Ameba("pepe", 12);

        System.out.println(a1);
        a1.come(2);
        System.out.println("pepe se ha comido 2 particulas");
        System.out.println(a1);

        Ameba a2 = new Ameba("paquillo", 89);
        System.out.println(a2);

        Ameba a3 = new Ameba("odisao", 9);
        System.out.println(a3);

        a2.come(4);
        System.out.println("paquillo se ha comido 4 particulas");
        System.out.println(a2);

        a1.come(a2);
        System.out.println("pepe se ha comido a paquillo");

        System.out.println(a1);
        System.out.println(a2);

        a2.come(3);
        System.out.println("odisao se ha comido 3 particulas");

        System.out.println(a3);

    }
}
