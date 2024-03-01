package ejercicio;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Diccionario {

	
	//Atributos
	
	private List<Palabra> listaPalabras;

	
	//Constructor
	
	public Diccionario(List<Palabra> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}


	
	//Getters and Setters
	
	public List<Palabra> getListaPalabras() {
		return listaPalabras;
	}


	public void setListaPalabras(List<Palabra> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}
	
	
	//Métodos
	
	public void agregarPalabra(Palabra p) {
		
		listaPalabras.add(p);
	}
	
	public Palabra buscarPorNombre (String nombre) {
		
		for (Palabra palabra : listaPalabras) {
			
			if (palabra.getNombre().equalsIgnoreCase(nombre)) {
				
				return palabra;
			}
		}
		
		return null;
	}
	
	public void mostrarPalabras () {
		
		Iterator<Palabra> it = listaPalabras.iterator();
		
		while (it.hasNext()) {
			
			Palabra p = it.next();
			
			System.out.println(p);
			
		}
	}
	
	public void modificarSignificado (String significadoNuevo, Palabra p) {
		
		p.setSignificado(significadoNuevo);
		
	}
	
	public void borrarPalabra (Palabra p) {
		
		listaPalabras.remove(p);
	}
	
	public void ordenarOrdenAlfabeticoDes() {
		
		OrdenaPorNombre on = new OrdenaPorNombre();
		Collections.sort(listaPalabras, Collections.reverseOrder(on));
			
	}
	
	public void desordenar () {
		
		Collections.shuffle(listaPalabras);
	}
	

	
}
