package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombre, apellidos, nombreCurso, aux;
		double notaMedia;
		int edad, opc;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Lista de alumnos con algunas instancias
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno ("Manolo", "Pérez Martín", "1DAM", 9.5, 18));
		listaAlumnos.add(new Alumno ("Luis", "Pérez Martín", "1DAM", 7, 18));
		listaAlumnos.add(new Alumno ("Adrián", "Pérez Martín", "1DAM", 1, 18));
		listaAlumnos.add(new Alumno ("Alvaro", "Pérez Martín", "1DAM", 9, 18));
		listaAlumnos.add(new Alumno ("Filomeno", "Pérez Martín", "1DAM", 10, 18));
		listaAlumnos.add(new Alumno ("Pedro", "Pérez Martín", "1DAM", 4.75, 18));

	}

}
