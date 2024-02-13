package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, apellidos, dni, aux;
		int opc, opcVeterano;
		boolean veterano;
		double cuota = 60, descuentoVeterano = 30 , horas, precioHora = 5;
		
		//Instancia clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia lista de Socios
		
		List<Socio> listaSocios = new ArrayList<Socio>();
		
		//Se introducen a cascoporro algunos socios para dar chicha al programa
		
		listaSocios.add(new Socio ("Manolito", "Pérez Galdiva", "58203657P", true));
		listaSocios.add(new Socio ("Luis Reinaldo", "Núñez Lapiedra", "13122402Q", true));
		listaSocios.add(new Socio ("Ermenegildo", "Pérez Cabrera", "41506774L", false));
		
		
		//Se crea la clase CRUDSocio introduciendo la lista de socios
		
		CRUDSocio cs = new CRUDSocio (listaSocios);
		
		//Se crea la clase Club introduciendo el CRUDSocio
		
		Club c = new Club (cs);
		
		
		//Inicio del programa
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------
					Opción 1:	Agregar socio
					Opción 2:	Listar socios
					Opción 3:	Modificar datos de socio
					Opción 4:	Eliminar socio
					Opción 5:	Pagar cuota
					Opción 6:	Alquilar pista
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
					
					System.out.println("¿Es veterano?");
					
					System.out.println("Opción 1:	Sí");
					System.out.println("Opción 2:	No");
					aux = s.nextLine();
					opcVeterano = Integer.parseInt(aux);
					
					if (opcVeterano == 1) {
						
						veterano = true;
					}
					
					else {
						
						veterano = false;
					}
					
					cs.agregarSocio(new Socio (nombre, apellidos, dni, veterano));
					
					break;
					
				case 2:
					
					cs.listarSocios();
					
					break;
					
				case 3:
					
					System.out.println("DNI del socio que quiere modificar");
					dni = s.nextLine();
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Apellidos");
					apellidos = s.nextLine();
					
					System.out.println("¿Es veterano?");
					
					System.out.println("""
							Opción 1:	Sí
							Opción 2:	No
							""");
					aux = s.nextLine();
					opcVeterano = Integer.parseInt(aux);
					
					if (opcVeterano == 1) {
						
						veterano = true;
					}
					
					else {
						
						veterano = false;
					}
				
					
					cs.modificarSocio(cs.buscarPorDni(dni), nombre, apellidos, veterano);
					
					break;
					
				case 4:
					
					System.out.println("DNI del socio que quiere eliminar");
					dni = s.nextLine();
					
					cs.eliminarSocio(cs.buscarPorDni(dni));
					
					break;
					
				case 5:
					
					System.out.println("DNI del Socio");
					dni = s.nextLine();
					
					System.out.printf("El socio %s %s deberá pagar %.2f€\n", cs.buscarPorDni(dni).getNombre(), cs.buscarPorDni(dni).getApellidos(), c.pagarCuota(dni, cuota, descuentoVeterano));
					
					break;
					
				case 6:
					
					System.out.println("DNI del socio");
					dni = s.nextLine();
					
					System.out.println("Número de horas en la pista");
					
					aux = s.nextLine();
					horas = Double.parseDouble(aux);
					
					System.out.printf("El socio %s %s tendrá que pagar %.2f€ por la pista\n", cs.buscarPorDni(dni).getNombre(), cs.buscarPorDni(dni).getApellidos(), c.alquilarPista(dni, horas, precioHora, descuentoVeterano));
					
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
