package ejercicio02;

public class Ventas {

	//Atributos
	
	private Producto [] listaProductos;
	private int numProductos;
	
	
	//Constructor
	
	public Ventas(Producto[] listaProductos, int numProductos) {
		super();
		this.listaProductos = listaProductos;
		this.numProductos = numProductos;
	}


	//Getters and Setters
	
	public Producto[] getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}


	public int getNumProductos() {
		return numProductos;
	}


	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	
	
	//Métodos
	
	public int contarProductosPorVender () {
		
		int cuenta = 0;
		
		for (int i = 0; i < numProductos; i++) {
			if (!listaProductos[i].isVendido()) {
				cuenta++;
			}
		}
		
		return cuenta;
	}
	
	public Producto [] buscarProductosVendidos () {
		
		Producto [] listaProductosVendidos = new Producto[numProductos];
		
		for (int i = 0; i < listaProductosVendidos.length; i++) {
			
			if (listaProductos[i].isVendido()) {
				listaProductosVendidos[i] = listaProductos[i];
			}
		}
		
		return listaProductosVendidos;
	}
	
	public double calcularTotalRecaudado (Producto [] listaProductosVendidos, double porcentaje, double espadaDoble) {
		
		double suma = 0;
		
		for (int i = 0; i < listaProductosVendidos.length; i++) {
			if (listaProductosVendidos[i] != null) {
				suma+= listaProductosVendidos[i].calcularPVP(porcentaje, espadaDoble);
			}
		}
		
		return suma;
	}
	
	public Producto buscarPorId (int id) {
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < numProductos && !encontrado) {
			
			if (listaProductos[i].getIdProducto() == id) {
				encontrado = true;
			}
			
			else  {
				i++;
			}
		}
		
		if (encontrado) {
			return listaProductos[i];
		}
		
		else {
			
			return null;
		}
	}
	
	public double calcularPVPProducto (Producto p, double porcentaje, double espadaDoble) {
		
		return p.calcularPVP(porcentaje, espadaDoble);
	}
	
	
	public double devolverCambio (Producto p, double dineroEntregado, double porcentaje, double espadaDoble) {
		
		return dineroEntregado - calcularPVPProducto(p, porcentaje, espadaDoble);
	}
}
