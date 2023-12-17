package repaso01;

import java.util.Arrays;

public class Tienda {

	//Atributos
	
	private Producto [] listaProductos;
	private int numProductos;
	
	
	//Constructor
	
	public Tienda(Producto[] listaProductos, int numProductos) {
		
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
	
	
	
	//toString
	
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + Arrays.toString(listaProductos) + ", numProductos=" + numProductos + "]";
	}
	
	
	//Métodos
	
	//VERBO EN INFINITIVO, SIN "Ñ" NI TILDE, QUE INDIQUE QUÉ HACE EL MÉTODO,
	//LA PRIMERA PALABRA EN MINÚSCULA, Y LA SIGUIENTE EN MAYÚSCULA, SIEMPRE,
	//EN SERIO, SIEMPRE, QUERIDO YO DEL FUTURO ¡¡¡SIEMPRE!!!

	public void agregarProducto (Producto p) {
		
		listaProductos [numProductos] = p;
		
		numProductos++;
			
	}
	
	public void mostrarProductos () {
		
		for (int i = 0; i < numProductos; i++) {
			
			if (listaProductos[i].isEnVenta()) {
				
				System.out.println(listaProductos[i]);
			}
		}
	}
	
	public Producto [] buscarBySeccion (int seccion) {
		
		int i = 0;
		
		Producto [] listaEncontrados = new Producto [numProductos];
		
		while (i < numProductos) {
			
			if (listaProductos[i].getSeccion() == seccion) {
				
				listaEncontrados[i] = listaProductos[i];
			}
			i++;
		}
		
		return listaEncontrados;
	
	}
	
	public void mostrarLista (Producto[] listaEncontrados) {
		
		for (int i = 0; i < listaEncontrados.length; i++) {
			
			if (listaEncontrados[i] != null) {
				System.out.println(listaEncontrados[i]);
			}
		}
	}
	
	public Producto buscarPorId (String id) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < numProductos && !encontrado) {
			
			Producto deLista = listaProductos[i];
			
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
	
	public double calcularPrecioVentaPublico (double porcentaje, String id) {
		
		return buscarPorId(id).getPrecioFabrica()+(buscarPorId(id).getPrecioFabrica()*porcentaje);
	}
	
	
	
	
}
