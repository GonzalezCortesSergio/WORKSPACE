package ejercicio04;

import java.util.List;

public class GestionEventos {

	
	//Atributos
	
	private List<Evento> listaEventos;

	
	//Constructor
	
	public GestionEventos(List<Evento> listaEventos) {
		super();
		this.listaEventos = listaEventos;
	}


	//Getters and Setters
	
	public List<Evento> getListaEventos() {
		return listaEventos;
	}


	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}
	
	
	//Métodos
	
	public void agregarEvento (Evento e) {
		
		listaEventos.add(e);
	}
	
	public void borrarEvento (Evento e) {
		
		listaEventos.add(e);
	}
	
	public Evento buscarPorNombre (String nombre) {
		
		for (Evento evento : listaEventos) {
			
			
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				
				return evento;
			}
		}
		
		return null;
	}
	
	public void verEventos () {
		
		for (Evento evento : listaEventos) {
			
			System.out.println(evento);
		}
	}
}
