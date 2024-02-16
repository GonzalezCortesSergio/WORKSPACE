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
		Trabajador t = null;
		
		for (int i = 0; i < listaTrabajadores.size() && !encontrado; i++) {
			
			if (listaTrabajadores.get(i).getDni().equals(dni)) {
				
				t = listaTrabajadores.get(i);
				encontrado = true;
			}
		}
		
		return t;
	}
	
	public void listarPorHorasCreciente (double sueldoHoras) {
		
		Collections.sort(listaTrabajadores);
		
		for (Trabajador trabajador : listaTrabajadores) {
			
			System.out.println(trabajador + "\tSueldo = " + trabajador.calcularSueldo(sueldoHoras));
		}
	}
	
	public void listarPorHorasDecreciente (double sueldoHoras) {
		
		Collections.sort(listaTrabajadores, Collections.reverseOrder());
		
		for (Trabajador trabajador : listaTrabajadores) {
			
			System.out.println(trabajador + "\tSueldo = " + trabajador.calcularSueldo(sueldoHoras));
		}
	}
	
	public void listarPorSueldoCreciente (double sueldoHoras) {
		
		Collections.sort(listaTrabajadores, new ComparadorSueldoTrabajador(sueldoHoras));
		
		for (Trabajador trabajador : listaTrabajadores) {
			
			System.out.println(trabajador + "\tSueldo = " + trabajador.calcularSueldo(sueldoHoras));
		}
	}
	
	public void listarPorSueldoDecreciente (double sueldoHoras) {
		
		Collections.sort(listaTrabajadores, Collections.reverseOrder(new ComparadorSueldoTrabajador(sueldoHoras)));
		
		for (Trabajador trabajador : listaTrabajadores) {
			
			System.out.println(trabajador + "\tSueldo = " + trabajador.calcularSueldo(sueldoHoras));
		}
	}
	
	public void borrarTrabajador (Trabajador t) {
		
		listaTrabajadores.remove(t);
	}
}
