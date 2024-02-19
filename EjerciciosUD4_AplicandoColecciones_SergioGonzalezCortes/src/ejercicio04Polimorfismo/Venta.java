package ejercicio04Polimorfismo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	
	public double calcularTotalVenta (double descuentoAl, double impuestoEl, double garantia) {
		
		Set<Entry<Producto, Integer>> entrySet = lineaVenta.entrySet();
		Iterator<Entry<Producto, Integer>> it = entrySet.iterator();
		double suma = 0;
		
		while (it.hasNext()) {
			
			Producto p = it.next().getKey();
			
			suma+= p.calcularPVP(descuentoAl, impuestoEl, garantia);
			
		}
		
		return suma;
	}
	
	public void mostrarVenta (double descuentoAl, double impuestoEl, double garantia) {
		
		Set <Entry<Producto, Integer>> entrySet = lineaVenta.entrySet();
		
		System.out.println("--------------------------------------------------------------------------------------");
		for (Entry<Producto, Integer> entry : entrySet) {
			
			System.out.printf("%s\tCantidad: %d\t\tPrecioCantidad: %.2f\n", entry, entry.getValue(), entry.getKey().calcularPVP(descuentoAl, impuestoEl, garantia) * entry.getValue());
		}
		System.out.printf("\t\t\tTOTAL: %.2f", calcularTotalVenta(descuentoAl, impuestoEl, garantia));
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
}
