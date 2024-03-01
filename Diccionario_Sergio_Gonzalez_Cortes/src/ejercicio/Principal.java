package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variable
		
		String aux, nombre, significado;
		int opc;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Creación de la lista de palabras con algunas palabras añadidas
		
		List<Palabra> listaPalabras = new ArrayList<Palabra>();
		
		listaPalabras.add(new Palabra ("For", "Por, Para, Durante"));
		listaPalabras.add(new Palabra ("Actually", "De hecho"));
		listaPalabras.add(new Palabra ("Carrot", "Zanahoria"));
		listaPalabras.add(new Palabra ("Zone", "Zona"));
		
		
		//Instancia de la clase Diccionario, incluyendo la lista de palabras
		
		Diccionario d = new Diccionario (listaPalabras);
		
		
		//Inicio del apartado "visual"
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------------------------------------
					Opción 1:	Agregar palabra
					Opción 2:	Mostrar palabras
					Opción 3:	Mostrar en orden alfabético inverso
					Opción 4:	Ver significado de una palabra
					Opción 5:	Borrar palabra
					Opción 6:	Modificar significado
					Opción 0:	Salir
					-------------------------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre de la palabra");
					nombre = s.nextLine();
					
					System.out.println("Significado en español");
					significado = s.nextLine();
					
					d.agregarPalabra(new Palabra (nombre, significado));
					
					break;
					
				case 2:
					
					d.desordenar();
					
					d.mostrarPalabras();
					
					break;
					
				case 3:
					
					d.ordenarOrdenAlfabeticoDes();
					
					d.mostrarPalabras();
					
					break;
					
				case 4:
					
					System.out.println("Nombre de la palabra que quiere ver");
					nombre = s.nextLine();
					
					System.out.printf("%s\tSignificado= %s\n", d.buscarPorNombre(nombre), d.buscarPorNombre(nombre).getSignificado());
					
					break;
					

					
				case 5:
					
					System.out.println("Nombre de la palabra que quiere eliminar");
					nombre = s.nextLine();
					
					d.borrarPalabra(d.buscarPorNombre(nombre));
					
					break;
					
				case 6:
					
					System.out.println("Nombre de la palabra que quiere modificar");
					nombre = s.nextLine();
					
					System.out.println("Significado nuevo");
					significado = s.nextLine();
					
					d.modificarSignificado(significado, d.buscarPorNombre(nombre));
					
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
