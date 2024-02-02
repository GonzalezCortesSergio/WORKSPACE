package ejemploList02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String dni, nombre, aux;
		int opc, edad;
		
		Scanner s = new Scanner(System.in);
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		do {
			
			System.out.println("-------------------------------------------");
			
			System.out.println("Opción 1:	Agregar persona");
			System.out.println("Opción 2:	Ver personas");
			System.out.println("Opción 0:	Salir");
			
			System.out.println("-------------------------------------------");

			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
			
			switch(opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Edad");
					aux = s.nextLine();
					edad = Integer.parseInt(aux);
					
					System.out.println("Dni");
					dni = s.nextLine();
					
					listaPersonas.add(new Persona (nombre, edad, dni));
					
					break;
					
				case 2:
					
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
