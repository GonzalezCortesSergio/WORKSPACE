package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class Secretaria {

	private CRUDAlumno ca;
	
	public Secretaria (CRUDAlumno ca) {
		
		this.ca = ca;
	}
	
	//Métodos
	
	public double calcularMediaCurso (String curso) {
		
		Iterator<Alumno>it = ca.buscarPorCurso(curso).iterator();
		double suma = 0;

		Alumno a = null;
		while (it.hasNext()) {
			
			a = it.next();
			
			suma+=a.getNota();
			
		}
		
		return suma / ca.buscarPorCurso(curso).size();
		
		
	
	}
	
	public int calcularNumSuspensos (String curso) {
		
		Iterator<Alumno> it = ca.buscarPorCurso(curso).iterator();
		
		int numSuspensos = 0;
		Alumno a = null;
		
		while (it.hasNext()) {
			a = it.next();
			
			if (a.getNota() < 5) {
				
				numSuspensos++;
			}
		}
		
		return numSuspensos;
	}
	
	public double calcularMediaSuspensos (String curso) {
		
		Iterator<Alumno> it = ca.buscarPorCurso(curso).iterator();
		
		double sumaSuspensos = 0;
		
		Alumno a = null;
		
		while (it.hasNext() && it.next() != null) {
			
			a = it.next();
			
			if (a.getNota() < 5) {
				
				sumaSuspensos+=a.getNota();
			}
		}
		
		return sumaSuspensos / ca.buscarPorCurso(curso).size();
	}
}
