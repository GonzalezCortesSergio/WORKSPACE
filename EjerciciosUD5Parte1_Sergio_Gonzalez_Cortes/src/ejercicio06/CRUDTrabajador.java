package ejercicio06;

import java.util.Collections;
import java.util.List;

public class CRUDTrabajador {

	//Atributos
	
	private List<Trabajador> listaTrabajadores;

	
	//Constructor
	
	public CRUDTrabajador(List<Trabajador> listaTrabajadores) {
		super();
		this.listaTrabajadores = listaTrabajadores;
	}


	public List<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}


	public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}
	
	
	//Métodos
	
	public void agregarTrabajador (Trabajador t) {
		
		listaTrabajadores.add(t);
	}
	
	public Trabajador buscarPorDNI(String dni) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < listaTrabajadores.size() && !encontrado; i++) {
			
			if (listaTrabajadores.get(i).getDni().equals(dni)) {
				
				return listaTrabajadores.get(i);
			}
		}
		
		return null;
	}
	
	public void listarPorNombreYHoras (double sueldoHoras) {
		
		Collections.sort(listaTrabajadores);
		
		for (Trabajador trabajador : listaTrabajadores) {
			
			System.out.println(trabajador + "\tSueldo = " + trabajador.calcularSueldo(sueldoHoras));
		}
	}

	
	
	public void borrarTrabajador (Trabajador t) {
		
		listaTrabajadores.remove(t);
	}
}
