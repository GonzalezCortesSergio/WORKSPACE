package ejercicio06_4;

import java.util.Map;

public class Venta {

	
	//Atributos
	
	private Map <Producto, Integer> lineaVenta;

	
	//Constructor
	
	public Venta(Map<Producto, Integer> lineaVenta) {
		super();
		this.lineaVenta = lineaVenta;
	}

	
	//Getters and Setters

	public Map<Producto, Integer> getLineaVenta() {
		return lineaVenta;
	}


	public void setLineaVenta(Map<Producto, Integer> lineaVenta) {
		this.lineaVenta = lineaVenta;
	}
	
	
	
	
}
