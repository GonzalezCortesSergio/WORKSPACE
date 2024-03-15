package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	
	public static void main (String [] args) {
		
		
		//Variables
		
		String cadena, aux;
		int opc;
		
		//Scanner 
		
		Scanner s = new Scanner(System.in);
		
		
		//Lista de cadenas con varias cadenas
		List<String> listaCadenas = new ArrayList<String>();
		
		listaCadenas.add("Ornitologo");
		listaCadenas.add("Oftalmologo");
		listaCadenas.add("Crotolamo");
		listaCadenas.add("Padalustro");
		listaCadenas.add("Si");
		listaCadenas.add("Permatrago");
		listaCadenas.add("Austria");
		
		//Instancia de la clase Cadenas con la lista de cadenas
		
		Cadenas c = new Cadenas(listaCadenas);
		
		//Apartado "visual" del programa
		
		
		do {
			
			System.out.println("""
					
					----------------------------------------------------------------
					Opción 1:	Agregar palabra
					Opción 2:	Borrar palabra
					Opción 3:	Ver palabras
					Opción 4:	Ver palabras en orden alfabético
					Opción 5:	Borrar las palabras de longitud impar
					Opción 6:	Ver las palabras en mayúsculas
					Opción 7:	Unir las primeras letras de las cadenas
					Opción 0:	Salir
					----------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Introduzca una palabra");
					cadena = s.nextLine();
					
					c.agregarString(cadena);
					
					break;
					
				case 2:
					
					System.out.println("Cadena que quiere borrar");
					cadena = s.nextLine();
					
					c.borrarCadena(cadena);
					
					break;
					
				case 3:
					
					c.mostrarLista(listaCadenas);
					
					break;
					
				case 4:
					
					c.mostrarLista(c.ordenarPorLetra());
					
					break;
					
				case 5:
					
					c.borrarCadenasImpares(c.buscarPalabrasLongitudImpar());
					
					break;
					
				case 6:
					
					c.mostrarLista(c.pasarPalabrasAMayusculas());
					
					break;
					
				case 7:
					
					System.out.println(c.unirPrimeraLetra());
					
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
