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
	
	
	//Métodos
	
	public void agregarLineaVenta (Producto p, int cantidad) {
		
		
		lineaVenta.put(p, cantidad);
		
	}
	
	public void borrarLineaVenta (Producto p) {
		
		lineaVenta.remove(p);
		
	}
	
	public Producto buscarPorId (int id) {
		
		return lineaVenta.entrySet().stream()
				.filter(lv -> lv.getKey().getId() == id)
				.findAny()
				.get()
				.getKey();
	}
	
	public double calcularPrecioLineaVenta (Producto p, int cantidad, double porcentajeEl, double porcentajeAl) {
		
		return p.calcularPVP(porcentajeEl, porcentajeAl) * cantidad;
	}
	
	public double calcularPrecioTotal (double porcentajeEl, double porcentajeAl) {
		
		return lineaVenta.entrySet()
				.stream().mapToDouble(x -> calcularPrecioLineaVenta(x.getKey(), x.getValue(), porcentajeEl, porcentajeAl))
				.sum();
	}
	
	
}
