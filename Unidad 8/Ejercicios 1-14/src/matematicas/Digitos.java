package matematicas;

public class Digitos {
    public static int digitos(int numero) {
        numero = Math.abs(numero);
        
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        
        return contador;
    }


    public static int digitoN(int numero, int n) {
        String numeroStr = String.valueOf(Math.abs(numero));
        if (n >= 0 && n < numeroStr.length()) {
            return Character.getNumericValue(numeroStr.charAt(n));
        }
        return -1;
    }
    

    public static int posicionDeDigito(int numero, int digito) {
        String numeroStr = String.valueOf(Math.abs(numero));
        String digitoStr = String.valueOf(digito);
        int posicion = numeroStr.indexOf(digitoStr);
        return posicion;
    }
    

    public static int quitaPorDetras(int numero, int n) {
        String numeroStr = String.valueOf(Math.abs(numero));
        if (n >= numeroStr.length()) {
            return 0;
        }
        String resultadoStr = numeroStr.substring(0, numeroStr.length() - n);
        return Integer.parseInt(resultadoStr);
    }
    

    public static int quitaPorDelante(int numero, int n) {
        String numeroStr = String.valueOf(Math.abs(numero));
        if (n >= numeroStr.length()) {
            return 0;
        }
        String resultadoStr = numeroStr.substring(n);
        return Integer.parseInt(resultadoStr);
    }


    public static int pegaPorDetras(int numero, int digito) {
        String numeroStr = String.valueOf(numero);
        return Integer.parseInt(numeroStr + digito);
    }

    
    public static int pegaPorDelante(int numero, int digito) {
        String numeroStr = String.valueOf(numero);
        return Integer.parseInt(digito + numeroStr);
    }
    
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numeroStr = String.valueOf(Math.abs(numero));
        if (inicio >= 0 && fin < numeroStr.length() && inicio <= fin) {
            String trozoStr = numeroStr.substring(inicio, fin + 1);
            return Integer.parseInt(trozoStr);
        }
        return -1;
    }

    
    public static int juntaNumeros(int numero1, int numero2) {
        String resultadoStr = String.valueOf(numero1) + String.valueOf(numero2);
        return Integer.parseInt(resultadoStr);
    }
    
}

