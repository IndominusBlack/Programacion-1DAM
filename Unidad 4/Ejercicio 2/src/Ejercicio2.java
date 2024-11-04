public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        System.out.print("Introduce la hora (0-23): ");

        int hora = Integer.parseInt(System.console().readLine());

        String horaDia;

        if (hora >= 6 && hora < 12) {
            horaDia = "Buenos días";
        } else if (hora >= 12 && hora < 21) {
            horaDia = "Buenas tardes";
        } else if (hora >= 21 && hora < 23 || hora >= 0 && hora <= 5) {
            horaDia = "Buenas noches";
        } else {
            horaDia = "El dato introducido es erróneo e incorrecto. Es fundamental que, al ingresar información, se asegure de que el formato y el rango de los datos sean los correctos. Por ejemplo, si se solicita una hora, debe estar comprendida entre 0 y 23, ya que estos son los únicos valores válidos para representar una hora en formato de 24 horas. Cualquier valor fuera de este rango resultará en un error, lo que puede llevar a confusiones o a un funcionamiento inesperado del programa.\n" + //
                                "\n" + //
                                "Recomendamos verificar los datos antes de proceder. Asegúrese de que no haya errores tipográficos y de que el tipo de dato ingresado coincida con lo solicitado. En caso de que se introduzca un valor inválido, el programa puede no comportarse como se espera. Para evitar esto, considere implementar validaciones adicionales en el código que verifiquen la validez de los datos antes de procesarlos.\n" + //
                                "\n" + //
                                "Si sigue encontrando dificultades, no dude en consultar la documentación o buscar ayuda. La precisión en la entrada de datos es crucial para asegurar el correcto funcionamiento del programa y evitar posibles complicaciones.";
        }

        System.out.println(horaDia);
    }
}