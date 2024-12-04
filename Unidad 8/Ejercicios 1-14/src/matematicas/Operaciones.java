package matematicas;

public class Operaciones {
    public static boolean esCapicua(int numero) {

        int numeroInvertido = voltea(numero);

        if (numero == numeroInvertido) {
            return true;
        } else {
            return false;
        }
        }


        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public static int menorPrimoMayorQue(int numero) {
            int candidato = numero + 1;
            
            while (!esPrimo(candidato)) {
                candidato++;
            }
            
            return candidato;
        }
    
        public static boolean siguientePrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public static int potencia(int base, int exponente) {
            int resultado = 1;
            
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            
            return resultado;
        }


        public static int voltea (int numero) {
            int numeroInvertido = 0;
            
            while (numero != 0) {
                int digito = numero % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                numero /= 10;
            }
            return numeroInvertido;
    }
}