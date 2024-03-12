package ejercicio01;

import java.util.Comparator;
import java.util.List;

public class Secretaria {

	
	//Atributos
	
	private List<Alumno> listaAlumnos;

	
	//Constructor
	
	public Secretaria(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}


	
	//Getters and Setters
	
	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
	
	//Métodos
	
	public void agregarAlumno (Alumno a) {
		
		listaAlumnos.add(a);
	}
	
	public void borrarAlumno (Alumno a) {
		
		listaAlumnos.remove(a);
	}
	
	public void mostrarAlumnos () {
		
		listaAlumnos.stream().forEach(System.out::println);
		
	}
	
	public void mostrarListaPasada (List<Alumno> listaPasada) {
		
		listaPasada.stream()
		.forEach(System.out::println);
	}
	
	
	public List<Alumno> buscarPorLetra (char letra) {
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre()
						.charAt(0) == letra)
				.toList();
	}
	
	public List<Alumno> buscarPorNotaMediaDAM () {
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombreCurso()
						.equalsIgnoreCase("1DAM"))
				.filter(alumno -> alumno.getNotaMedia() >= 9)
				.toList();
	}
	
	public long obtenerNumAlumnos () {
		
		return listaAlumnos.stream()
				.count();
	}
	
	public List<Alumno> buscarNumAlumnos (int limite) {
		
		return listaAlumnos.stream()
				.limit(limite)
				.toList();
	}
	
	public Alumno buscarAlumnoMenorEdad () {
		
		Comparator<Alumno> comparaEdad = Comparator.comparing(Alumno::getEdad);
		
		return listaAlumnos.stream()
				.sorted(comparaEdad)
				.findFirst()
				.get();
	}
	
	public Alumno buscarPrimerAlumno () {
		
		return listaAlumnos.stream()
				.findFirst()
				.get();
	}
	
	public List<Alumno> buscarAlumnosNombreLargo () {
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre().length() >= 10)
				.toList();
	}
	
	public List<Alumno> buscarAlumnosLetraACorto () {
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getNombre().charAt(0) == 'A')
				.filter(alumno -> alumno.getNombre().length() <= 6)
				.toList();
	}
}
