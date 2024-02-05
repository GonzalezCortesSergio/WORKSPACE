package ejemploList03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		String nombre, dni, aux;
		int edad, opc;
		
		Scanner s = new Scanner(System.in);

		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona( "Miguel Ángel", 35, "41502122R"));
		listaPersonas.add(new Persona( "Josito", 15, "51502121B"));
		listaPersonas.add(new Persona ("Lamamarre", 42, "12011928L"));
		
		CRUDPersona cp = new CRUDPersona (listaPersonas);
		
		
		do {
			
			System.out.println("""
					
					--------------------------------------------
					Opción 1:	Mostrar listado
					Opción 2:	Agregar persona
					Opción 3:	Eliminar persona
					Opción 0:	Salir
					--------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					cp.imprimirLista();
					
					break;
					
				case 2:
					
					System.out.println("Nombre de la persona");
					nombre = s.nextLine();
					
					System.out.println("Edad");
					aux = s.nextLine();
					edad = Integer.parseInt(aux);
					
					System.out.println("DNI");
					dni = s.nextLine();
					
					cp.agregarPersona(new Persona (nombre, edad, dni));
					
					break;
					
				case 3:
					
					System.out.println("Diga el DNI de la persona que quiere eliminar");
					dni = s.nextLine();
					
					cp.eliminarPersona(cp.buscarPorDni(dni));
					
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
