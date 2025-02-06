import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombre = new ArrayList<String>();
        
        nombre.add("Antonio");
        nombre.add("Samba");
        nombre.add("Quico");
        nombre.add("Salvador");
        nombre.add("mi abuela");
        nombre.add("compañero genérico");

        for (Object i : nombre) {
            System.out.println(i);
        }
    }
}
