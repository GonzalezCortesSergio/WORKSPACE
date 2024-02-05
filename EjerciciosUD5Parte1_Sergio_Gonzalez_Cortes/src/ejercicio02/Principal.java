package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, apellidos, dni, dniNuevo, aux;
		int opc;
		
		//Instancia clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia lista de Socios
		
		List<Socio> listaSocios = new ArrayList<Socio>();
		
		//Se introducen a cascoporro algunos socios para dar chicha al programa
		
		listaSocios.add(new Socio ("Manolito", "Pérez Galdiva", "58203657P"));
		listaSocios.add(new Socio ("Luis Reinaldo", "Núñez Lapiedra", "13122402Q"));
		listaSocios.add(new Socio ("Ermenegildo", "Pérez Cabrera", "41506774L"));
		
		
		//Se crea la clase Club introduciendo la lista de socios
		
		Club c = new Club (listaSocios);
		
		
		//Inicio del programa
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------
					Opción 1:	Agregar socio
					Opción 2:	Listar socios
					Opción 3:	Cambiar datos de socio
					Opción 4:	Eliminar socio
					Opción 0:	Salir
					-------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Apellidos");
					apellidos = s.nextLine();
					
					System.out.println("DNI");
					dni = s.nextLine();
					
					c.agregarSocio(new Socio (nombre, apellidos, dni));
					
					break;
					
				case 2:
					
					c.listarSocios();
					
					break;
					
				case 3:
					
					System.out.println("DNI del socio que quiere cambiar");
					dni = s.nextLine();
					
					System.out.println("Nombre nuevo");
					nombre = s.nextLine();
					
					System.out.println("Apellidos nuevos");
					apellidos = s.nextLine();
					
					System.out.println("DNI nuevo");
					dniNuevo = s.nextLine();
					
					c.cambiarSocio(c.buscarPorDni(dni), nombre, apellidos, dniNuevo);
					
					break;
					
				case 4:
					
					System.out.println("DNI del socio que quiere eliminar");
					dni = s.nextLine();
					
					c.eliminarSocio(c.buscarPorDni(dni));
					
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
