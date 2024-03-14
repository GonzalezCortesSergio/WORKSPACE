package ejercicio02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cadenas {

	
	//Atributos
	
	private List<String> listaCadenas;

	
	//Constructor
	public Cadenas(List<String> listaCadenas) {
		super();
		this.listaCadenas = listaCadenas;
	}


	
	//Getters and Setters
	
	public List<String> getListaCadenas() {
		return listaCadenas;
	}


	public void setListaCadenas(List<String> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}
	
	
	//Métodos
	
	public void agregarString (String s) {
		
		listaCadenas.add(s);
	}
	
	public void borrarCadena (String s) {
		
		listaCadenas.remove(s);
	}
	
	public void borrarCadenasImpares (List<String> cadenasImpares) {
		
		for (String string : cadenasImpares) {
			
			listaCadenas.remove(string);
		}
	}
	
	public void mostrarLista (List<String> listaCadenas) {
		
		listaCadenas.stream()
		.forEach(System.out::println);
	}
	
	public List<String> ordenarPorLetra () {
		
		return listaCadenas.stream()
				.sorted()
				.toList();
		
	}
	
	public String buscarPorCadena (String cadena) {
		
		return listaCadenas.stream()
				.filter(s -> s.toLowerCase().equalsIgnoreCase(cadena))
				.findAny()
				.get();
	}
	
	public List<String> buscarPalabrasLongitudImpar () {
		
		return listaCadenas.stream()
				.filter(s -> s.length() % 2 != 0)
				.toList();
	}
	
	public List<String> pasarPalabrasAMayusculas () {
		
		return listaCadenas.stream()
				.map(String::toUpperCase)
				.toList();
	}
	
	public String unirPrimeraLetra () {
		
		char primeraLetra;
		String letrasUnidas = "";
		
		for (String string : listaCadenas) {
			
			primeraLetra = string.charAt(0);
			letrasUnidas+= primeraLetra;
		}
		
		return letrasUnidas;
						
	}
	
}
