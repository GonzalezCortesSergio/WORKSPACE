package crud;

import pojo.Juguetito;

public class Tiendecita {

	//Atributos
	
	private Juguetito [] listaJuguetitos;
	private int numJuguetitos;
	
	//Constructor
	
	public Tiendecita(Juguetito[] listaJuguetitos, int numJuguetitos) {
		
		this.listaJuguetitos = listaJuguetitos;
		this.numJuguetitos = numJuguetitos;
	}
	
	//Métodos
	
	public void agregarJuguete (Juguetito j) {
		
		listaJuguetitos [numJuguetitos++] = j;
	}
	
	public void mostrarJuguetesEnVenta() {
		
		for (int i = 0; i < numJuguetitos; i++) {
			
			if (listaJuguetitos[i].isEnVenta()) {
				
				System.out.println(listaJuguetitos[i]);
				System.out.println();
			}
		}
	}
	public Juguetito buscarPorId (int id) {
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < numJuguetitos && !encontrado) {
			
			if (listaJuguetitos[i].getId() == id) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
		}
		
		if (encontrado) {
			
			return listaJuguetitos[i];
		}
		
		else {
			return null;
		}
	}
	
	public void descatalogarJuguete (int id) {
		
		buscarPorId(id).setEnVenta(false);
	}
	
	public void volverEnVenta (int id) {
		
		buscarPorId(id).setEnVenta(true);
	}
	
	public Juguetito [] buscarJuguetesDescatalogados () {
		
		int i = 0;
		
		Juguetito [] listaDescatalogados = new Juguetito [numJuguetitos];
		
		while (i < numJuguetitos) {
			
			if (!listaJuguetitos[i].isEnVenta()) {
				
				listaDescatalogados[i] = listaJuguetitos[i];
			}
			
			i++;
		}
		
		return listaDescatalogados;
	}
	
	public void mostrarDescatalogados (Juguetito [] listaDescatalogados) {
		
		for (int i = 0; i < listaDescatalogados.length; i++) {
			if (listaDescatalogados [i] != null) {
				
				System.out.println(listaDescatalogados[i]);
				System.out.println();
			}
		}
	}
	
}
