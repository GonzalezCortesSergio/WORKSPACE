package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombre, apellidos, aux;
		int opc, opcRepetir, dorsal, categoria, numCorredores = 0, tam = 100;
		double tiempo, km, segundos;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		
		//Instanciar array
		
		Corredor [] listaCorredores = new Corredor[tam];
		
		//Pedir kilometros
		
		System.out.println("¿De cuántos kilómetros es la carrera?");
		
		aux = s.nextLine();
		km = Double.parseDouble(aux);
		
		//Instanciar Carrera
		
		Carrera ca = new Carrera(listaCorredores, numCorredores, km);
		
		System.out.println("**************");
		System.out.println("BOLT RACE 2023");
		System.out.println("**************");
		
		
		
		do {
			
			System.out.println("""
					---------------------------------------------------------------------------------------------------
					Opción 1:	Añadir corredor
					Opción 2:	Ver tiempo de un corredor en segundos
					Opción 3:	Ver corredores veteranos
					Opción 4:	Cambiar tiempo de un corredor
					Opción 5:	Ver corredor que menos ha tardado
					Opción 6:	Ver total tiempo que han tardado los corredores juveniles
					Opción 7:	Ver todos los corredores
					Opción 0:	Salir
					---------------------------------------------------------------------------------------------------
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					do {
						
						System.out.println("Nombre del corredor");
						nombre = s.nextLine();
						
						System.out.println("Apellidos del corredor");
						apellidos = s.nextLine();
						
						System.out.println("Dorsal");
						aux = s.nextLine();
						dorsal = Integer.parseInt(aux);
						
						System.out.println("Categoría");
						do {
							
							System.out.println("""
									Opción 1:	Juvenil
									Opción 2:	Senior
									Opción 3:	Veterano
									""");
							
							aux = s.nextLine();
							categoria = Integer.parseInt(aux);
							
						}while (categoria != 1 && categoria != 2 && categoria != 3);
						
						System.out.println("Tiempo que ha tardado en terminar");
						aux = s.nextLine();
						tiempo = Double.parseDouble(aux);
						
						ca.agregarCorredor(new Corredor (nombre, apellidos, dorsal, categoria, tiempo));
						
						System.out.println("¿Quiere añadir otro corredor?");
						System.out.println("Pulse cualquier botón para añadir.");
						System.out.println("Pulse 0 si no quiere añadir");
						
						aux = s.nextLine();
						opcRepetir = Integer.parseInt(aux);
					
					}while (opcRepetir != 0);
					
					break;
					
				case 2:
					
					System.out.println("Diga el dorsal del corredor");
					
					aux = s.nextLine();
					dorsal = Integer.parseInt(aux);
					
					System.out.println("Introduzca 1 minuto en segundos (es 60)");
					aux = s.nextLine();
					segundos = Double.parseDouble(aux);
					
					
					System.out.printf ("El corredor tiene un tiempo de %.2f segundos\n", ca.calcularTiempoEnSegundos(segundos, dorsal));
					
					break;
					
				case 3:
					
					ca.mostrarCVeterano();
					
					break;
					
				case 4:
					
					System.out.println("Diga el dorsal del corredor");
					
					aux = s.nextLine();
					dorsal = Integer.parseInt(aux);
					
					System.out.println("Introduzca el nuevo tiempo");
					
					aux = s.nextLine();
					tiempo = Double.parseDouble(aux);
					
					ca.cambiarTiempo(dorsal, tiempo);
					
					break;
					
					
				case 5:
					
					System.out.printf("El corredor que menos ha tardado ha sido %s %s\n", ca.buscarPorMenorTiempo().getNombre(), ca.buscarPorMenorTiempo().getApellidos());
					
					System.out.printf("Ha tenido una media de %.2f minutos por kilómetro\n", ca.calcularMediaKmMinuto());
					
					break;
					
					
					
				case 6:
					
					System.out.printf("Los corredores juveniles han tardado %.2f minutos\n", ca.sumarTotalTiempoJuvenil());
					
					break;
					
				case 7:
					
					ca.mostrarTodosCorredores();
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
					
					
			}
			
		}while (opc != 0);
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("********************************");
	}

}
