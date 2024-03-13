package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Playlist {

	
	//Atributos
	
	private List<Cancion> listaCanciones;
	private Random random = new Random();

	
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
	
	
	private Cancion getCancionAleatoria () {
		
		return listaCanciones.get(random.nextInt(listaCanciones.size()));
	}
	
	public double getDuracionLista(List<Cancion> listaDada) {
		
		double duracion = 0;
		
		for (Cancion cancion : listaDada) {
			duracion+= cancion.getDuracion();
		}
		
		return duracion;
	}
	
	public List<Cancion> hacerPlaylistDuracion (double duracion) {
		
		List<Cancion> listaCancionesAleatoria = new ArrayList<Cancion>();
		
		do {
			
			listaCancionesAleatoria.add(getCancionAleatoria());
			
		}while (getDuracionLista(listaCancionesAleatoria) != duracion);
		
		return listaCancionesAleatoria;
	}
	
}
