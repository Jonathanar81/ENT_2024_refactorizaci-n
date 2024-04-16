package ejercicio1;

public class Calculadora {
    public int sumar(int a, int b) {
        int resultadoSumar = a + b;
        return resultadoSumar;
    }

    public int restar(int a, int b) {
        int resultadoRestar = a - b;
        return resultadoRestar;
    }

    public int multiplicar(int a, int b) {
        int resultadomultiplicar = a * b;
        return resultadomultiplicar;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            int resultadoDividir = a / b;
            return resultadoDividir;
        }
    }

    
}

