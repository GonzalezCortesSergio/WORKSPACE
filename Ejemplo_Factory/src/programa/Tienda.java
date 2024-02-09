package programa;

import java.util.List;

public class Tienda {

	
	private List<Producto> listaProductos;

	public Tienda(List<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}
	
	
	//Métodos
	
	public void agregarProducto (Producto p) {
		
		listaProductos.add(p);
	}
	
	public void verProductos () {
		
		for (Producto producto : listaProductos) {
			System.out.println(producto);
		}
	}
	
	
	public Producto buscarPorId (int id) {
		
		boolean encontrado = false;
		
		Producto p = null;
		
		for (int i = 0; i < listaProductos.size() && !encontrado; i++) {
			
			if (listaProductos.get(i).getCodProducto() == id) {
				
				p = listaProductos.get(i);
				
				encontrado = true;
			}
		}
		
		return p;
	}
	
	public double calcularPVPProducto (Producto p, double porcentajeAl, double porcentajeEl) {
		
		return p.calcularPVP(porcentajeAl, porcentajeEl);
	}

}
