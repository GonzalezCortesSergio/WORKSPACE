package ejercicio;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables 
		
		String aux, nombre, significado;
		int opc;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Se crea un map de palabras y significados
		
		SortedMap <Palabra, String> mapPalabras = new TreeMap <Palabra, String>();
		
		mapPalabras.put(new Palabra ("Lentils"), "Lentejas");
		mapPalabras.put(new Palabra ("Nose"), "Nariz");
		mapPalabras.put(new Palabra ("For"), "Para, Por");
		mapPalabras.put(new Palabra ("Yes"), "Sí");
		
		
		//Se agrega a Diccionario
		
		Diccionario d = new Diccionario (mapPalabras);
		
		//Inicio del apartado "visual"
		
		do {
			
			System.out.println("""
					
					----------------------------------------------------
					Opción 1:	Agregar palabra
					Opción 2:	Ver palabras
					Opción 3:	Ver significado palabra
					Opción 4:	Modificar palabra
					Opción 5:	Borrar palabra
					Opción 0:	Salir
					----------------------------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Significado en español");
					significado = s.nextLine();
					
					d.agregarPalabra(new Palabra (nombre), significado);
					
					break;
					
				case 2:
					
					d.mostrarPalabras();
					
					break;
					
				case 3:
					
					System.out.println("Nombre de la palabra");
					nombre = s.nextLine();
					
					System.out.printf("%s\tSignificado= %s\n", d.buscarPorNombre(nombre).getKey(), d.buscarPorNombre(nombre).getValue());
					
					break;
					
					
				case 4:
					
					System.out.println("Nombre de la palabra que quiere cambiar");
					nombre = s.nextLine();
					
					System.out.println("Significado nuevo");
					significado = s.nextLine();
					
					d.modificarSignificado(significado, d.buscarPorNombre(nombre));
					
					break;
					
				case 5:
					
					System.out.println("Nombre de la palabra que quiere eliminar");
					nombre = s.nextLine();
					
					d.borrarPalabra(d.buscarPorNombre(nombre));
					
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
