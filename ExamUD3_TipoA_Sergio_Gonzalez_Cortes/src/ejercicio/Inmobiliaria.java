package ejercicio;

public class Inmobiliaria {

	
	//Atributos
	
	private Piso [] listaPisos;
	private int numPisos;
	private int numTrabajadores;
	
	
	//Constructor
	
	public Inmobiliaria(Piso[] listaPisos, int numPisos, int numTrabajadores) {
	
		this.listaPisos = listaPisos;
		this.numPisos = numPisos;
		this.numTrabajadores = numTrabajadores;
	}
	
	
	//Getters and Setters
	
	public Piso[] getListaPisos() {
		return listaPisos;
	}


	public void setListaPisos(Piso[] listaPisos) {
		this.listaPisos = listaPisos;
	}


	public int getNumPisos() {
		return numPisos;
	}


	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}


	public int getNumTrabajadores() {
		return numTrabajadores;
	}


	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	
	
	//Métodos

	public void agregar (Piso p) {
		
		listaPisos [numPisos] = p;
		
		numPisos++;
	}
	
	public Piso [] buscarPisosNuevos () {
		
		int i = 0;
		
		Piso [] listaNuevos = new Piso [numPisos];
		while (i < numPisos) {
			
			if (listaPisos[i].getEstado() == 1) {
				
				listaNuevos[i] = listaPisos[i];
			}
			i++;
		}
		
		return listaNuevos;
	}
	
	public void mostrarPisosNuevos (Piso [] listaNuevos) {
		
		for (int i = 0; i < numPisos; i++) {
			
			if (listaNuevos[i] != null) {
				
				System.out.println(listaNuevos[i]);
			}
		}
	}
	
	
}
