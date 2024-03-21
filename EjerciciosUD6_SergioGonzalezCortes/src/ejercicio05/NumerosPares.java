package ejercicio05;

import java.util.List;

public class NumerosPares {

	
	private List<Integer> listaNumerosPares;
	
	public NumerosPares (List <Integer> listaNumerosPares) {
		
		this.listaNumerosPares = listaNumerosPares;
	}
	
	public List<Integer> getListaNumerosPares () {
		
		return listaNumerosPares;
	}
	
	public void setListaNumerosPares (List<Integer> listaNumerosPares) {
		
		this.listaNumerosPares = listaNumerosPares;
	}
	
	
	//Métodos
	
	public void agregarNumeros (int numero) throws NumImpar {
		
		if (numero % 2 == 0)
			throw new NumImpar("El número introducido es impar");
		
		listaNumerosPares.add(numero);
	}
	
	public void verNumeros () {
		
		listaNumerosPares.stream()
		.forEach(System.out::println);
	}
}
