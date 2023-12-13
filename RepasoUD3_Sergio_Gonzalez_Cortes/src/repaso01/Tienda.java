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
			
			if (listaProductos[i].isEnVenta())
			System.out.println(listaProductos[i]);
			
		}
	}
	
	public Producto findByNombre (String nombre) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < numProductos && !encontrado) {
			
			Producto deLista = listaProductos[i];
			
			if (deLista.getNombre().equals(nombre)) {
				
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
	
	public void eliminarProducto (String nombre){
		
		findByNombre(nombre).setEnVenta(false);
	}
	
	
}
