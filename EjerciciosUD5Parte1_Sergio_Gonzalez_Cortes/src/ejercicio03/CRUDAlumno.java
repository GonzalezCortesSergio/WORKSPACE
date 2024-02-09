package ejercicio03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CRUDAlumno {

	//Atributos
	
	private Set<Alumno> setAlumnos;

	
	//Constructor
	
	public CRUDAlumno(Set<Alumno> setAlumnos) {
		super();
		this.setAlumnos = setAlumnos;
	}


	
	//Getters and Setters
	
	public Set<Alumno> getSetAlumnos() {
		return setAlumnos;
	}


	public void setSetAlumnos(Set<Alumno> setAlumnos) {
		this.setAlumnos = setAlumnos;
	}
	
	
	
	//Métodos
	
	public void agregarAlumno (Alumno a) {
		
		setAlumnos.add(a);
		
	}
	
	public void verAlumnos () {
		
		for (Alumno alumno : setAlumnos) {
			
			System.out.println(alumno);
		}
	}
	
	public void verAlumno (Alumno a) {
		
		System.out.println(a);
		
	}
	
	public Alumno buscarPorCodAlumno (String codAlumno) {
		
		Iterator <Alumno> it = setAlumnos.iterator();
		
		Alumno a = null;
		
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			
			a= it.next();
			
			if (a.getCodAlumno().equals(codAlumno)) {
				
				encontrado = true;
			}
		}
		
		if (encontrado) {
			
			return a;
		}
		
		else {
			
			return null;
		}
	}
	
	public Set<Alumno> buscarPorCurso (String curso) {
		
		Iterator <Alumno> it = setAlumnos.iterator();
		
		Set<Alumno> setAlumnosCurso = new HashSet<Alumno>();
		
		Alumno a = null;
		
		while (it.hasNext()) {
			
			a = it.next();
			
			if (a.getCurso().equalsIgnoreCase(curso)) {
				
				setAlumnosCurso.add(a);
			
			}
		}
		
		return setAlumnosCurso;
	}
	
	public void cambiarAlumno (Alumno a, String nombre, String apellidos, int edad, String curso) {
		
		a.setNombre(nombre);
		a.setApellidos(apellidos);
		a.setEdad(edad);
		a.setCurso(curso);
	}
	
	public void eliminarAlumno (Alumno a) {
		
		setAlumnos.remove(a);
		
	}
}
