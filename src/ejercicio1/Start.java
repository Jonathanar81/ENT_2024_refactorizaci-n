package ejercicio1;

public class Start {

	public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
        System.out.println("División: " + calc.dividir(10, 5));
    }

}
