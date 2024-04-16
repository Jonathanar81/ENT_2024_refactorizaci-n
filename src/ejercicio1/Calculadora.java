package ejercicio1;

public class Calculadora {
    public int sumar(int sumando1, int sumando2) {
        int resultado = sumando1 + sumando2;
        return resultado;
    }

    public int restar(int minuendo, int sustraendo) {
        int resultado = minuendo - sustraendo;
        return resultado;
    }

    public int multiplicar(int factor1, int factor2) {
        int resultado = factor1 * factor2;
        return resultado;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            // TODO DIVISIÓN POR CERO ¿LANZAR EXCEPCIÓN?
            return 0;
        } else {
            int resultado = dividendo / divisor;
            return resultado;
        }
    }

    
}

