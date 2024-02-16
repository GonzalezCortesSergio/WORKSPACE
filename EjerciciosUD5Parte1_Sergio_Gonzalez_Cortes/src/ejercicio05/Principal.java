package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String aux;
		int opc;
		
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Lista de Personas
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona ("Gertrudis", 55));
		listaPersonas.add(new Persona ("Manolo", 80));
		listaPersonas.add(new Persona ("Aarón", 18));
		listaPersonas.add(new Persona ("Zalomon", 3));
		listaPersonas.add(new Persona ("Aaltrumis", 100));
		
		for (Persona persona : listaPersonas) {
			
			System.out.println(persona);
		}
		
		do {
			
			System.out.println("""
					
					------------------------------------------------------------------
					Opción 1:	Ordenar alfabéticamente
					Opción 2:	Ordenar inversamente alfabéticamente
					Opción 3:	Ordenar por edad
					Opción 4:	Ordenar inversamente por edad
					Opción 5:	Mostrar desordenado
					Opción 0:	Salir
					------------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					Collections.sort(listaPersonas);
					
					for (Persona persona : listaPersonas) {
						
						System.out.println(persona);
					}
					
					break;
					
					
				case 2:
					
					Collections.sort(listaPersonas, Collections.reverseOrder());
					
					for (Persona persona : listaPersonas) {
						
						System.out.println(persona);
					}
					
					break;
					
				case 3:
					
					Collections.sort(listaPersonas, new ComparadorPorEdad());
					
					for (Persona persona : listaPersonas) {
						
						
						System.out.println(persona);
					}
					
					break;
					
				case 4:
					
					Collections.sort(listaPersonas, Collections.reverseOrder(new ComparadorPorEdad()));
					
					for (Persona persona : listaPersonas) {
						
						System.out.println(persona);
					}
					
					break;
					
				case 5:
					
					Collections.shuffle(listaPersonas);
					
					for (Persona persona : listaPersonas) {
						
						System.out.println(persona);
					
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
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
