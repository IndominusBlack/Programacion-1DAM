public class Ejercicio1 {
    public static void main(String[] args) {
        
        int acumuladora = 0;

        System.out.println("Tres tiradas al azar de un dado de 6 caras: ");
        System.out.println("-------------------------------------------");
        
        for (int i = 1; i <= 3; i++) {
        System.out.printf("Tirada número " + i + ": ");
        
        int resultado = (int) (Math.random() * 6) + 1;
        switch (resultado) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
        }
    acumuladora+=resultado;
    }
    System.out.println("Resultado de la suma de los tres: " + acumuladora);
}
}