package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Mazo {

	
	//Atributos
	
	private List<Carta> listaCartas;

	
	//Constructor

	public Mazo(List<Carta> listaCartas) {
		super();
		this.listaCartas = listaCartas;
	}


	//Getters and Setters
	
	public List<Carta> getListaCartas() {
		return listaCartas;
	}


	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}
	
	
	//Métodos
	
	public void agregarCarta (Carta c) {
		
		listaCartas.add(c);
	}
	
	public void borrarCarta (Carta c) {
		
		listaCartas.remove(c);
	}
	
	public Carta buscarPorNombreYPalo (String nombre, String palo) {
		
		for (Carta carta : listaCartas) {
			
			if (carta.getNombre().equalsIgnoreCase(nombre) && carta.getPalo().equalsIgnoreCase(palo)) {
				
				return carta;
			}
		}
		
		return null;
	}
	
	public List<Carta> buscarPorValorCero () {
		
		Iterator<Carta> it = listaCartas.iterator();
		List<Carta> cartasValorCero = new ArrayList<Carta>();
		Carta c = null;
		
		while (it.hasNext()) {
			
			c = it.next();
			
			if (c.obtenerPuntuacion() == 0) {
				
				cartasValorCero.add(c);
			}
			
		}
		
		return cartasValorCero;
	}
	
	public double calcularPuntuacionTotal () {
		
		double puntuacionTotal = 0;
		
		for (Carta carta : listaCartas) {
			
			puntuacionTotal+= carta.obtenerPuntuacion();
		}
		
		return puntuacionTotal;
	}
	
	public void desordenar () {
		
		Collections.shuffle(listaCartas);
	}
	
	public void modificarNombreCarta (Carta c, String nombreNuevo) {
		
		c.setNombre(nombreNuevo);
	}
	
	public void mostrarCartas () {
		
		Iterator<Carta> it = listaCartas.iterator();
		Carta c = null;
		
		while (it.hasNext()) {
			
			c = it.next();
			
			System.out.println(c);
		}
	}
	
	public void mostrarCartasSinValor (List<Carta> cartasSinValor) {
		
		Iterator<Carta> it = cartasSinValor.iterator();
		Carta c = null;
		
		while (it.hasNext()) {
			
			c = it.next();
			
			System.out.println(c);
		}
	}
	
	public void ordenarPorPalo () {
		
		Collections.sort(listaCartas);
	}
	
	public void ordenarPorPuntuacion () {
		
		Collections.sort(listaCartas, Collections.reverseOrder(new ComparaPorPuntuacion()));
	}
	
	
	
	
}
