package ejercicio03;

import java.util.List;
import java.util.function.Consumer;

public class Playlist {

	
	//Atributos
	
	private List<Cancion> listaCanciones;

	
	//Constructor
	
	public Playlist(List<Cancion> listaCanciones) {
		super();
		this.listaCanciones = listaCanciones;
	}


	//Getters and Setters
	
	public List<Cancion> getListaCanciones() {
		return listaCanciones;
	}


	public void setListaCanciones(List<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
	
	
	
	//Métodos
	
	public void agregarCancion (Cancion c) {
		
		listaCanciones.add(c);
	}
	
	public void borrarCancion (Cancion c) {
		
		listaCanciones.remove(c);
	}
	
	public List<Cancion> buscarPorNombre (String nombre) {
		
		return listaCanciones.stream()
				.filter(cancion -> cancion.getNombre().toLowerCase().equalsIgnoreCase(nombre))
				.toList();
	}
	
	public Cancion buscarPorNombreYAutor (String nombre, String autor) {
		
		return listaCanciones.stream()
				.filter(cancion -> cancion.getNombre().toLowerCase().equalsIgnoreCase(nombre))
				.filter(cancion -> cancion.getAutor().toLowerCase().equalsIgnoreCase(autor))
				.findAny()
				.get();
	}
	
	public List<Cancion> buscarPorAutor (String autor) {
		
		return listaCanciones.stream()
				.filter(cancion -> cancion.getAutor().toLowerCase().equalsIgnoreCase(autor))
				.toList();
	}
	
	public List<Cancion> buscarPorDuracion (double duracion) {
		
		return listaCanciones.stream()
				.filter(cancion -> cancion.getDuracion() == duracion)
				.toList();
	}
	
	public List<Cancion> buscarPorGenero (String genero) {
		
		return listaCanciones.stream()
				.filter(cancion -> cancion.getGenero().toLowerCase().equalsIgnoreCase(genero))
				.toList();
	}
	
	public long numCancionesDuracion (List<Cancion> listaPorDuracion) {
		
		return listaPorDuracion.stream()
				.count();
	}
	
	public double duracionTotalPlaylist () {
		
		return listaCanciones.stream()
				.mapToDouble(Cancion::getDuracion)
				.sum();				
	}
	
	
	public void mostrarTodo () {
		
		listaCanciones.stream().forEach(System.out::println);
	}
	
	public void mostrarPorParametros (List<Cancion> listaParametro) {
		
		listaParametro.stream()
		.forEach(System.out::println);
	}
	
}
