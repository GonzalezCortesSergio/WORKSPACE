package ejercicio01;

import java.util.List;

public class CRUDNota {

	//Atributos
	
	private List<Nota> listaNotas;

	
	//Constructor
	
	public CRUDNota(List<Nota> listaNotas) {
		super();
		this.listaNotas = listaNotas;
	}


	//Getters and Setters
	
	public List<Nota> getListaNotas() {
		return listaNotas;
	}


	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}


	//toString
	
	@Override
	public String toString() {
		return "CRUDNota [listaNotas=" + listaNotas + "]";
	}
	
	
	
	//Métodos
	
	public void mostrarLista () {
		
		for (Nota nota : listaNotas) {
			
			System.out.println(nota);
		}
	}
	
	public void agregarNota (Nota n) {
		
		listaNotas.add(n);
		
	}
	
	public Nota buscarPorId (int idNota) {
		
		boolean encontrado = false;
		Nota n = null;
		
		for (int i = 0; i < listaNotas.size() && !encontrado; i++) {
			
			if (listaNotas.get(i).getIdNota() == idNota) {
				
				n = listaNotas.get(i);
				
				encontrado = true;
			}
		}
		
		return n;
	}
	
	public void verContenidoNota (Nota n) {
		
		System.out.println(n.getContenido());
	}
	
	public void cambiarContenidoNota (Nota n, String contenido) {
		
		n.setContenido(contenido);
		
	}
	
	public void cambiarNombreNota (Nota n, String titulo) {
		
		n.setTitulo(titulo);
	}
	
	public void eliminarNota (Nota n) {
		
		listaNotas.remove(n);
	}
}
