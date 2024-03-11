package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	
	public static void main (String [] args) {
		
		
		//Variables
		
		String aux, nombre, nombreNuevo, palo;
		int numCarta, opc;
		
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Lista de cartas, incluyendolas para ejemplo
		
		List<Carta> listaCartas = new ArrayList<Carta>();
		
		listaCartas.add(new Carta ("As", "Espadas", 1));
		listaCartas.add(new Carta ("Huevo frito", "Oros", 1));
		listaCartas.add(new Carta ("Nueve", "Copas", 9));
		listaCartas.add(new Carta ("Caballo", "Bastos", 11));
		listaCartas.add(new Carta ("Rey", "Oros", 12));
		listaCartas.add(new Carta ("Sota", "Bastos", 10));
		listaCartas.add(new Carta ("Caballo", "Espadas", 11));
		
		//Instancia de la clase Mazo, incluyendo la lista de cartas
		
		Mazo m = new Mazo (listaCartas);
		
		//Inicio del apartado "visual"
		
		do {
			
			System.out.println("""
					
					----------------------------------------------------------
					Opción 1:	Agregar carta
					Opción 2:	Borrar carta
					Opción 3:	Ver cartas sin valor
					Opción 4:	Ver puntuación mazo
					Opción 5:	Modificar nombre de una carta
					Opción 6:	Ver mazo
					Opción 7:	Ver mazo en orden de palos
					Opción 8:	Ver mazo en orden de puntuación
					Opción 0:	Salir
					----------------------------------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre de la carta");
					nombre = s.nextLine();
					
					System.out.println("Palo");
					palo = s.nextLine();
					
					System.out.println("Número de la carta");
					aux = s.nextLine();
					numCarta = Integer.parseInt(aux);
					
					m.agregarCarta(new Carta (nombre, palo, numCarta));
					
					break;
					
				case 2:
					
					System.out.println("Número y palo de la carta que quiere borrar");
					aux = s.nextLine();
					numCarta = Integer.parseInt(aux);
					palo = s.nextLine();
					
					if (m.buscarPorNumeroYPalo(numCarta, palo) != null) {
						
						m.borrarCarta(m.buscarPorNumeroYPalo(numCarta, palo));
					}
					
					else {
						
						System.out.println();
						System.out.println("*********************************");
						System.out.println("No se ha encontrado ninguna carta");
						System.out.println("*********************************");
						System.out.println();
					}
					
					break;
					
				case 3:
					
					m.mostrarCartasSinValor(m.buscarPorValorCero());
					
					break;
					
				case 4:
					
					System.out.println("Puntuación total = " + m.calcularPuntuacionTotal());
					
					break;
					
				case 5:
					
					System.out.println("Nombre y palo de la carta que quiere modificar");
					aux = s.nextLine();
					numCarta = Integer.parseInt(aux);
					palo = s.nextLine();
					
					System.out.println("Nombre nuevo de la carta");
					nombreNuevo = s.nextLine();
					
					if (m.buscarPorNumeroYPalo(numCarta, palo) != null) {
						
						m.modificarNombreCarta(m.buscarPorNumeroYPalo(numCarta, palo), nombreNuevo);
						
						
					}
					
					else {
						
						System.out.println();
						System.out.println("*********************************");
						System.out.println("No se ha encontrado ninguna carta");
						System.out.println("*********************************");
						System.out.println();
					}
					
					break;
					
				case 6:
					
					m.desordenar();
					
					m.mostrarCartas();
					
					break;
					
				case 7:
					
					m.ordenarPorPalo();
					
					m.mostrarCartas();
					
					break;
					
				case 8:
					
					m.ordenarPorPuntuacion();
					
					m.mostrarCartas();
					
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
