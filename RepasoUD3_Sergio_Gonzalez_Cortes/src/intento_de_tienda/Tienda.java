package intento_de_tienda;

public class Tienda {

	
	//Atributos
	
	private Producto [] listaProductos;
	private int numProductos;
	
	
	//Constructor
	
	public Tienda(Producto[] listaProductos, int numProductos) {
		
		this.listaProductos = listaProductos;
		this.numProductos = numProductos;
	}
	
	//Métodos
	
	public void agregarProducto (Producto p) {
		
		listaProductos[numProductos] = p;
		
		numProductos++;
		
	}
	
	public Producto encontrarPorId(String id) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < numProductos && !encontrado) {
			
			Producto deLista = listaProductos [i];
			
			if (deLista.getId().equals(id)) {
				
				encontrado = true;
			}
			
			else {
				
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
	
	public void eliminarProductos (String id) {
		
		encontrarPorId(id).setEnVenta(false);
	}
	
	public void mostrarEnVenta () {
		
		for (int i = 0; i < numProductos; i++) {
			
			if (listaProductos[i].isEnVenta()) {
				
				System.out.println(listaProductos[i]);
				System.out.println();
			}
		}
		
	}
	
	public Producto [] buscarNoEnVenta () {
		
		int i = 0;
		Producto [] noEnVenta = new Producto [numProductos];
		
		while (i < numProductos) {
			
			if (!listaProductos[i].isEnVenta()) {
				
				noEnVenta[i] = listaProductos [i];
				
			}
		}
		
		return noEnVenta;
	}
	
	public void mostrarNoEnVenta () {
		
		for (int i = 0; i < numProductos; i++) {
			
			if (buscarNoEnVenta()[i] != null) {
				
				System.out.println(buscarNoEnVenta()[i]);
				System.out.println();
			}
		}
	}
	
	
}
