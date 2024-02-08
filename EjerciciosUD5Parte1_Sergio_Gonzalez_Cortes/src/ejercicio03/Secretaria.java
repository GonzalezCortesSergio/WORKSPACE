package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class Secretaria {


	
	//Métodos
	
	public double calcularMediaCurso (Set<Alumno> setAlumnos) {
		
		Iterator<Alumno>it = setAlumnos.iterator();
		double suma = 0;
		int tamanio = 0;
		
		while (it.hasNext()) {
			
			suma+=it.next().getNota();
			
			tamanio++;
		}
		
		return suma / tamanio;
		
		
	
	}
	
	public int calcularNumSuspensos (Set<Alumno> setAlumnos) {
		
		Iterator<Alumno> it = setAlumnos.iterator();
		
		int numSuspensos = 0;
		
		while (it.hasNext()) {
			
			if (it.next().getNota() < 5) {
				
				numSuspensos++;
			}
		}
		
		return numSuspensos;
	}
	
	public double calcularMediaSuspensos (Set<Alumno> setAlumnos) {
		
		Iterator<Alumno> it = setAlumnos.iterator();
		
		double sumaSuspensos = 0;
		
		while (it.hasNext()) {
			
			if (it.next().getNota() < 5) {
				
				sumaSuspensos+=it.next().getNota();
			}
		}
		
		return sumaSuspensos / calcularNumSuspensos(setAlumnos);
	}
}
