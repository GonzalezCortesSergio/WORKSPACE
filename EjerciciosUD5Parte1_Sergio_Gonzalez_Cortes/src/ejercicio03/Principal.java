package ejercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombre, apellidos, curso, codAlumno, aux;
		int edad, opc;
		double nota;
		
		//Instancia clase Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Creación set de alumnos e implementación de alumnos
		
		
		Set<Alumno> setAlumnos = new HashSet<Alumno>();
		setAlumnos.add(new Alumno ("Sergio", "González Cortés", 18, "1º DAM", "1121", 8.25));
		setAlumnos.add(new Alumno ("Miguel", "Garfia Bermúdez", 21, "1º DAM", "1212", 5.75));
		setAlumnos.add(new Alumno ("Sabrina", "Pérez Gálvez", 17, "2º Comercio", "2121", 4.53));
		setAlumnos.add(new Alumno ("Adolfo", "Gómez Rastrojo", 25, "2º Comercio", "2212", 10));
		
		
		
		//Creación de clase CRUDAlumnos y Secretaria
		
		CRUDAlumno ca = new CRUDAlumno (setAlumnos);
		Secretaria s = new Secretaria (ca);
		
		
		//Comienzo del programa
		
		
		do {
			
			System.out.println("""
					
					--------------------------------------------------
					Opción 1:	Agregar alumnos
					Opción 2:	Ver alumnos
					Opción 3:	Cambiar datos alumno
					Opción 4:	Eliminar alumno
					Opción 5:	Ver media de curso
					Opción 6:	Ver número de suspensos
					Opción 7:	Ver media de suspensos
					Opción 0:	Salir
					--------------------------------------------------
					
					""");
			aux = sc.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre del alumno");
					nombre = sc.nextLine();
					
					System.out.println("Apellidos");
					apellidos = sc.nextLine();
					
					System.out.println("Edad");
					aux = sc.nextLine();
					edad = Integer.parseInt(aux);
					
					System.out.println("Curso");
					curso = sc.nextLine();
					
					System.out.println("Código de alumno");
					codAlumno = sc.nextLine();
					
					System.out.println("Nota del alumno");
					aux = sc.nextLine();
					nota = Double.parseDouble(aux);
					
					ca.agregarAlumno(new Alumno (nombre, apellidos, edad, curso, codAlumno, nota));
					
					break;
					
				case 2:
					
					ca.verAlumnos();
					
					break;
					
					
				case 3:
					
					System.out.println("Código del alumno que quiere cambiar");
					codAlumno = sc.nextLine();
					
					System.out.println("Nombre");
					nombre = sc.nextLine();
					
					System.out.println("Apellidos");
					apellidos = sc.nextLine();
					
					System.out.println("Edad");
					aux = sc.nextLine();
					edad = Integer.parseInt(aux);
					
					System.out.println("Curso");
					curso = sc.nextLine();
					
					ca.cambiarAlumno(ca.buscarPorCodAlumno(codAlumno), nombre, apellidos, edad, curso);
					
					break;
					
				case 4:
					
					System.out.println("Código del alumno que quiere eliminar");
					codAlumno = sc.nextLine();
					
					ca.eliminarAlumno(ca.buscarPorCodAlumno(codAlumno));
					
					break;
					
				case 5: 
					
					System.out.println("Diga el curso que quiere ver");
					curso = sc.nextLine();
					
					System.out.printf("La nota media del curso %s es de %.2f\n", curso, s.calcularMediaCurso(curso));
					
					
					break;
					
				case 6:
					
					System.out.println("Diga el curso que quiere ver");
					curso = sc.nextLine();
					
					System.out.println("Hay un total de " + s.calcularNumSuspensos(curso) + " suspensos");
					
					break;
					
				case 7:
					
					System.out.println("Diga el curso que quiere ver");
					curso = sc.nextLine();
					
					System.out.printf("La media de suspenso del curso %s es de %.2f\n", curso, s.calcularMediaSuspensos(curso));
					
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
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
