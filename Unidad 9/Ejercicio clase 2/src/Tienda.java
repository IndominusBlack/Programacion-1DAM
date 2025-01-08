public class Tienda {
    public static void main(String[] args) throws Exception {

        Producto chanclas = new Producto("Chanclas", "<<Estas son las de goku>>", 6);
        Producto zapatillas = new Producto("Zapatillas", "<<Unas zapatillas to guapas>>", 70);

        System.out.println(zapatillas);
        System.out.println(chanclas);

        zapatillas.vende(20);
        chanclas.reponer(70);

        try{
        System.out.println("------------------");
        System.out.println("Después de vender 20 zapatillas y reponer 70 chanclas, los productos se quedan así:");
        System.out.println(chanclas);
        System.out.println(zapatillas);
        } catch (Exception e) {
            System.out.println("no me toques lo cojone");
        }finally {  
            System.out.println("se ha acabao el programa bicho.");
        }

        chanclas.vende(30);
        zapatillas.reponer(10);

        System.out.println("------------------");
        System.out.println("Después de vender 30 chanclas y reponer 10 zapatillas, los productos se quedan así:");
        System.out.println(chanclas);
        System.out.println(zapatillas);

        /* Crear la tienda donde tienes los productos :D
        Supongamos que eres el dueño de una zapatería, pues hacer una tienda online básicamente.*/
    }
}