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
		int edad, opc, limite;
		char inicial;
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Lista de alumnos con algunas instancias
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno ("Manolo", "Pérez Martín", "1DAM", 9.5, 18));
		listaAlumnos.add(new Alumno ("Luis", "Pérez Martín", "1AYF", 7, 25));
		listaAlumnos.add(new Alumno ("Adrián", "Pérez Martín", "2DAM", 1, 19));
		listaAlumnos.add(new Alumno ("Alvaro", "Pérez Martín", "2AYF", 9, 35));
		listaAlumnos.add(new Alumno ("Filomeno", "Pérez Martín", "1DAM", 10, 23));
		listaAlumnos.add(new Alumno ("Pedro", "Pérez Martín", "1DAM", 4.75, 20));
		
		//Instancia Secretaria
		
		Secretaria s = new Secretaria(listaAlumnos);
		
		//Apartado "visual" del programa
		
		do {
			
			System.out.println("""
					
					-----------------------------------------------------------------------------------------
					Opción 1:	Agregar alumno
					Opción 2:	Borrar alumno
					Opción 3:	Ver todos los alumnos
					Opción 4:	Ver alumnos con la misma inicial
					Opción 5:	Ver los alumnos con mejor nota media (mayor o igual a 9)
					Opción 6:	Ver número de alumnos
					Opción 7:	Ver alumnos de menor edad
					Opción 8:	Ver alumnos de nombre largo
					Opción 9:	Ver alumnos con nombre corto que empieza por A
					Opción 0:	Salir	
					-----------------------------------------------------------------------------------------
					
					""");
			
			aux = sc.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre del alumno");
					nombre = sc.nextLine();
					
					System.out.println("Apellidos");
					apellidos = sc.nextLine();
					
					System.out.println("Curso");
					nombreCurso = sc.nextLine().toUpperCase();
					
					System.out.println("Nota media");
					aux = sc.nextLine();
					notaMedia = Double.parseDouble(aux);
					
					System.out.println("Edad del alumno");
					aux = sc.nextLine();
					edad = Integer.parseInt(aux);
					
					s.agregarAlumno(new Alumno (nombre, apellidos, nombreCurso, notaMedia, edad));
					
					break;
					
				case 2:
					
					System.out.println("Nombre, apellidos y curso del alumno que quiere borrar");
					nombre = sc.nextLine();
					apellidos = sc.nextLine();
					nombreCurso = sc.nextLine();
					
					try {
						
						s.borrarAlumno(s.buscarPorNombreApellidoCurso(nombre, apellidos, nombreCurso));
					}
					
					catch (NullPointerException npe) {
						
						System.out.println("*********************************");
						System.out.println("No se ha encontrado ningún alumno");
						System.out.println("*********************************");
					}
					
					break;
					
				case 3:
					
					s.mostrarAlumnos();
					
					break;
					
				case 4:
					
					System.out.println("Inicial que quiere buscar");
					aux = sc.nextLine();
					inicial = aux.charAt(0);
					
					System.out.println("¿Quiere ver un número en concreto?");
					System.out.println("""
							
							Opción 1:	Sí
							Opción 2:	No
							
							""");
					
					aux = sc.nextLine();
					opc = Integer.parseInt(aux);
					
					switch (opc) {
						
						case 1:
							System.out.println("Cuántos quiere ver?");
							aux = sc.nextLine();
							limite = Integer.parseInt(aux);
							
							s.mostrarListaPasada(s.buscarNumAlumnos(limite, s.buscarPorLetra(inicial)));
							
							break;
							
						case 2:
							
							s.mostrarListaPasada(s.buscarPorLetra(inicial));
							
							break;
					}
					
					
					
					break;
					
				case 5:
					
					System.out.println("¿Quiere ver un número en concreto?");
					System.out.println("""
							
							Opción 1:	Sí
							Opción 2:	No
							
							""");
					
					aux = sc.nextLine();
					opc = Integer.parseInt(aux);
					
					switch (opc) {
						
						case 1:
							System.out.println("Cuántos quiere ver?");
							aux = sc.nextLine();
							limite = Integer.parseInt(aux);
							
							s.mostrarListaPasada(s.buscarNumAlumnos(limite, s.buscarPorNotaMediaDAM()));
							
							break;
							
						case 2:
							
							s.mostrarListaPasada(s.buscarPorNotaMediaDAM());
							
							break;
					}
					
					break;
					
				case 6:
					
					System.out.println("Hay " + s.obtenerNumAlumnos() + " alumnos");
					
					break;
					
				case 7:
					
					System.out.println("¿Quiere ver un número en concreto?");
					System.out.println("""
							
							Opción 1:	Sí
							Opción 2:	No
							
							""");
					
					aux = sc.nextLine();
					opc = Integer.parseInt(aux);
					
					switch (opc) {
						
						case 1:
							System.out.println("Cuántos quiere ver?");
							aux = sc.nextLine();
							limite = Integer.parseInt(aux);
							
							s.mostrarListaPasada(s.buscarNumAlumnos(limite, s.buscarAlumnoMenorEdad()));
							
							break;
							
						case 2:
							
							s.mostrarListaPasada(s.buscarAlumnoMenorEdad());
							
							break;
					}
					
					break;
					
				case 8:
					
					System.out.println("¿Quiere ver un número en concreto?");
					System.out.println("""
							
							Opción 1:	Sí
							Opción 2:	No
							
							""");
					
					aux = sc.nextLine();
					opc = Integer.parseInt(aux);
					
					switch (opc) {
						
						case 1:
							System.out.println("Cuántos quiere ver?");
							aux = sc.nextLine();
							limite = Integer.parseInt(aux);
							
							s.mostrarListaPasada(s.buscarNumAlumnos(limite, s.buscarAlumnosNombreLargo()));
							
							break;
							
						case 2:
							
							s.mostrarListaPasada(s.buscarAlumnosNombreLargo());
							
							break;
					}
					
					break;
					
				case 9:
					
					System.out.println("¿Quiere ver un número en concreto?");
					System.out.println("""
							
							Opción 1:	Sí
							Opción 2:	No
							
							""");
					
					aux = sc.nextLine();
					opc = Integer.parseInt(aux);
					
					switch (opc) {
						
						case 1:
							System.out.println("Cuántos quiere ver?");
							aux = sc.nextLine();
							limite = Integer.parseInt(aux);
							
							s.mostrarListaPasada(s.buscarNumAlumnos(limite, s.buscarAlumnosLetraACorto()));
							
							break;
							
						case 2:
							
							s.mostrarListaPasada(s.buscarAlumnosLetraACorto());
							
							break;
					}
					
					break;
					
				case 0:
					
					
					System.out.println("***********");
					System.out.println("Saliendo...");
					System.out.println("***********");
					
					break;
					
				default:
					
					System.out.println("*****************");
					System.out.println("Opción equivocada");
					System.out.println("*****************");
					
					break;
			}
			
			
			
		}while (opc != 0);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		
		

	}

}
