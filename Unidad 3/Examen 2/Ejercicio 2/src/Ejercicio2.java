import java.util.Scanner;

public class Ejercicio2  {

    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN    //Definimos el color
    public static final String RESET = "\033[0m"; // Text Reset         //Definimos el reset de colores
    public static void main(String[] args) throws Exception {
        
        System.out.println("LIBRERÍA DE SUEÑOS");                     //Introducción del programa
        System.out.println("==================");

        Scanner sc = new Scanner (System.in);                           //Creación de la variable Scanner para uso temporal
        System.out.printf("Introduce código de libro: ");        //Mostramos el primer texto en pantalla
        int codigo = sc.nextInt();                                      //Creamos una variable "codigo" a partir de la temporal "sc"

        System.out.printf("Introduce precio: ");                 //Mostramos el segundo texto en pantalla
        Double precio = sc.nextDouble();                                //Creamos una variable "precio" a partir de la temporal "sc"

        System.out.printf("Introduce unidades vendidas: ");      //Mostramos el tercer texto en pantalla
        int unidades = sc.nextInt();                                    //Creamos una variable "unidades" a partir de la temporal "sc"

        System.out.printf("Introduce descuento: ");              //Mostramos el cuarto texto en pantalla
        int descuento = sc.nextInt();                                   //Creamos una variable "descuento" a partir de la temporal "sc"

        sc.close();                                                     //Cerramos la variable Scanner para evitar futuros problemas

        Double preciounidades = precio*unidades;                        //Resolución de fórmulas y creación de variables para el final de la factura
        Double preciodescuento = preciounidades*descuento/100;
        Double precioiva = (preciounidades-preciodescuento)*0.16;
        Double preciototal = preciounidades-preciodescuento+precioiva;
        Double iva = 16.0;

        System.out.println("Su ticket:");                                                                               //Creación de la factura, con sus respectivos textos y colores
        System.out.printf("┌────────────────────────────┐\n");
        System.out.printf("│ LIBRERÍA DE SUEÑOS         │\n");
        System.out.printf("├────────────────────────────┤\n");
        System.out.printf("│Cód. %-6s          %6.2f\u20ac│\n", codigo, precio);
        System.out.printf("│%-2s uds.              %6.2f\u20ac│\n", unidades, preciounidades);
        System.out.printf("│%-3s                  %6.2f\u20ac│\n", -descuento, -preciodescuento);
        System.out.printf("│%2.0f IVA               %6.2f\u20ac│\n", iva, +precioiva);
        System.out.printf("│" + CYAN_BACKGROUND + "TOTAL                %6.2f\u20ac" + RESET + "│\n", preciototal);
        System.out.printf("└────────────────────────────┘\n");
    }
}
