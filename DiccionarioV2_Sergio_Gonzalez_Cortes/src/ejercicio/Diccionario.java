package ejercicio;

import java.util.Map;
import java.util.SortedMap;

public class Diccionario {

	
	//Atributos
	
	private SortedMap <Palabra, String> mapPalabras;

	//Constructor
	public Diccionario(SortedMap<Palabra, String> mapPalabras) {
		super();
		this.mapPalabras = mapPalabras;
	}

	
	//Getters and Setters
	
	public SortedMap<Palabra, String> getMapPalabras() {
		return mapPalabras;
	}

	public void setMapPalabras(SortedMap<Palabra, String> mapPalabras) {
		this.mapPalabras = mapPalabras;
	}
	
	
	//Métodos
	
	public void agregarPalabra (Palabra p, String significado) {
		
		mapPalabras.put(p, significado);
	}
	
	public void mostrarPalabras () {
		
		for (Map.Entry<Palabra, String> entry : mapPalabras.entrySet()) {
			
			System.out.println(entry.getKey());
		}
	}
	
	public Map.Entry<Palabra, String> buscarPorNombre (String nombre) {
		
		for (Map.Entry<Palabra, String> entry : mapPalabras.entrySet()) {
			
			if (entry.getKey().getNombre().equalsIgnoreCase(nombre)) {
				
				return entry;
			}
		}
		
		return null;
		
	}
	
	public void borrarPalabra (Map.Entry <Palabra, String> entry) {
		
		mapPalabras.remove(entry.getKey());
	}
	
	public void modificarSignificado (String sigificadoNuevo, Map.Entry<Palabra, String> entry) {
		
		entry.setValue(sigificadoNuevo);
	}
}
