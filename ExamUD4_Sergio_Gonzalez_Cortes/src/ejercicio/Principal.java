package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String aux;
		int idVehiculo, dias, numRuedasMin, tam = 6, opc;
		double beneficioBatmovil = 100, euroPotenciaPatin = 1;
		
		//Instancia de la clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciamos el array de Vehiculo
		
		Vehiculo [] listaVehiculos = new Vehiculo[tam];
		
		//Instanciamos unas pocas de clases tipo Vehiculo (incluyendo un Vehiculo genérico)
		
		Vehiculo vehiculoGenerico = new Vehiculo ("41402SFZ", 20, 2003, 1);		
		Vehiculo vehiculoGenerico2 = new Vehiculo ("80312OPK", 15, 2012, 2);
		
		Vehiculo batmovil = new Batmovil ("SOY BATMAN1", 40, 2020, 3, 5);
		Vehiculo batmovil2 = new Batmovil ("SOY BATMAN2", 32, 2021, 4, 3);
		
		Vehiculo patineteVolador = new PatineteVolador ("Matrícula?1", 4, 2032, 5, 125);
		Vehiculo patineteVolador2 = new PatineteVolador ("Matricula?2", 4.5, 2042, 6, 228);
		
		//Introducimos los objetos en el array de Vehiculo a cascoporro (Ángel no me mates)
		
		listaVehiculos[0] = vehiculoGenerico;
		listaVehiculos[1] = vehiculoGenerico2;
		listaVehiculos[2] = batmovil;
		listaVehiculos[3] = batmovil2;
		listaVehiculos[4] = patineteVolador;
		listaVehiculos[5] = patineteVolador2;
		
		//Instanciamos la clase TiendaAlquileres, introduciendo el array de vehiculos y especificando
		//el número de vehículos que hay (a casco porro también ._.)
		
		TiendaAlquileres ta = new TiendaAlquileres (listaVehiculos, 6);
		
		do {
			
			System.out.println("""
					
					--------------------------------------------------------------------------
					Opción 1:	Mostrar listado
					Opción 2:	Calcular alquiler de un vehículo
					Opción 3:	Ver total recaudado
					Opción 4:	Ver total recaudado únicamente con batmóviles
					Opción 5:	Calcular alquiler de varios días
					Opción 0:	Salir
					--------------------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Diga el número de ruedas de un batmóvil a resaltar");
					aux = s.nextLine();			
					numRuedasMin = Integer.parseInt(aux);
					
					ta.mostrarListado(numRuedasMin);
					
					break;
					
				case 2:
					
					System.out.println("Diga el id del vehículo que quiere alquilar");
					aux = s.nextLine();
					idVehiculo = Integer.parseInt(aux);
					
					System.out.printf("Precio de alquiler por un día: %.2f€\n", ta.calcularAlquilerVehiculo(ta.buscarPorId(idVehiculo), beneficioBatmovil, euroPotenciaPatin));
					
					break;
					
				case 3:
					
					System.out.printf("Total recaudado: %.2f€\n", ta.calcularTotalRecaudado(beneficioBatmovil, euroPotenciaPatin));
					
					break;
					
				case 4:
					
					System.out.printf("Total recaudado en batmóviles: %.2f€\n", ta.calcularTotalRecaudadoBatmoviles(ta.buscarBatmoviles(), beneficioBatmovil, euroPotenciaPatin));
					
					break;
					
				case 5:
					
					System.out.println("Diga el id del vehículo que quiere alquilar");
					aux = s.nextLine();
					idVehiculo = Integer.parseInt(aux);
					
					System.out.println("¿Por cuántos días quiere alquilarlo?");
					aux = s.nextLine();
					dias = Integer.parseInt(aux);
					
					System.out.printf("Precio de alquiler por %d días: %.2f€\n", dias, ta.calcularAlquilerVariosDias(ta.buscarPorId(idVehiculo), beneficioBatmovil, euroPotenciaPatin, dias));
					
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
