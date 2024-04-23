package ejercicio3;

public class CalculadoraImpuestos {

	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {

		double impuesto = 0;

		if (tipoImpuesto.equals("IVA")) {

			if (ingresos < 10000) {

				impuesto = ingresos * 0.10;

			} else if (ingresos >= 10000 && ingresos < 50000) {

				impuesto = ingresos * 0.15;

			} else {

				impuesto = ingresos * 0.20;

			}

		} else if (tipoImpuesto.equals("ISR")) {

			if (ingresos < 50000) {

				impuesto = ingresos * 0.20;

			} else {

				impuesto = ingresos * 0.30;

			}

		} else if (tipoImpuesto.equals("IEPS")) {

			impuesto = ingresos * 0.05;

		} else {

			System.out.println("Tipo de impuesto no válido");

		}

		return impuesto;

	}

}
