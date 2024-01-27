package ejemplo01;

import java.util.ArrayList;

public class Tienda {

	//Atributos
	
	private ArrayList<Producto> listaProductos;

	
	//Constructor
	
	public Tienda(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}
	
	
	//Métodos 
	
	public void listarProductos () {
		
		for (Producto producto : listaProductos) {
			System.out.println(listaProductos);
		}
		
	}
}
