package ejercicio01;

import java.util.List;

public class CRUDNota {

	
	//Atributos
	
	private List<Nota> listaNotas;
	
	
	
	//Constructor
	
	public CRUDNota (List<Nota> listaNotas) {
		
		this.listaNotas = listaNotas;
		
	}
	
	
	//Getters and Setters
	
	public List<Nota> getListaNotas () {
		
		return listaNotas;
	}
	
	public void setListaNotas (List<Nota> listaNotas) {
		
		this.listaNotas = listaNotas;
	}
	
	//Métodos
	
	public void agregarNota (Nota n) {
		
		listaNotas.add(n);
	}
	
	public void borrarNota (Nota n) {
		
		listaNotas.remove(n);
	}
	
	public Nota buscarPorId (int id) {
		
		return listaNotas.stream()
				.filter(nota -> nota.getIdNota() == id)
				.findAny()
				.get();
	}
	
	public void listarNotas () {
		
		listaNotas.stream()
		.forEach(System.out::println);
	}
	
	public void verNota (Nota n) {
		
		System.out.println(n.getContenido());
	}
}
