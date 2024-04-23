package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {
	private List<String> productos = new ArrayList<>();

	public static final int ADD = 1000;
	public static final int REMOVE = 2000;

	public void gestionarProducto(String producto, int operacion) throws Exception {
		
		if(productos.contains(producto)&&operacion==REMOVE) {
			productos.remove(producto);
		}
		else if(producto.contains(producto)&&operacion==ADD) {
			productos.add(producto);
		}
		
		/*
		 * bloque de posibles errores
		 * */
		else if(operacion==ADD) {
			throw new Exception("imposible añadir");
		}
		else if(operacion == REMOVE) {
			throw new Exception("Imposible borrar");	
		}
		else throw new Exception("Operación no soportada");
	}
		
}
