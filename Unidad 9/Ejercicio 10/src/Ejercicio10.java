
public class Ejercicio10 {

    public static void main(String[] args) throws Exception {
        Ameba a1 = new Ameba();

        a1.come(2);
        System.out.println(a1.getPeso());

        Ameba a2 = new Ameba();

        a2.come(4);
        System.out.println(a2.getPeso());

        a1.come(a2);

        System.out.println(a1.getPeso());
        System.out.println(a2.getPeso());

        a2.come(3);

        System.out.println(a2.getPeso());

    }
}
