package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, contenido, aux;
		int opc, opcElegirNota;
		
		//Instancia Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia ArrayList de Nota
		
		List<Nota> listaNotas = new ArrayList<Nota>();
		
		listaNotas.add(new Nota ("Lista de la compra", "Leche, Pan, Huevos, Lentejas"));
		listaNotas.add(new Nota ("Algo que decir", "No te olvides de decirle a María que de un triple backflip con tirabuzón"));
		listaNotas.add(new Nota ("Si", "Lleva la tarara un vestido con lentejuelas y lleno de cascabeles"));
	
		do {
			
			System.out.println("""
					
					------------------------------------------------------------
					Opción 1:	Listar todas las notas
					Opción 2:	Ver nota
					Opción 3:	Añadir nota
					Opción 4:	Eliminar nota
					Opción 0:	Salir
					------------------------------------------------------------

					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					for (Nota nota : listaNotas) {
						System.out.println(nota);
					}
					
					break;
					
				case 2:
					
					System.out.println("Diga la nota que quiere leer");
					aux = s.nextLine();
					opcElegirNota = Integer.parseInt(aux);
					
					System.out.println(listaNotas.get(opcElegirNota-1).getContenido()); 
					
					break;
					
				case 3:
					
					System.out.println("Diga el nombre de la nota");
					nombre = s.nextLine();
					
					System.out.println("Escriba la nota");
					contenido = s.nextLine();
					
					listaNotas.add(new Nota (nombre, contenido));
					
					break;
					
				case 4:
					
					System.out.println("Diga la nota que quiere eliminar");
					aux= s.nextLine();
					opcElegirNota = Integer.parseInt(aux);
					
					listaNotas.remove(opcElegirNota-1);
					
					System.out.println("Se ha eliminado correctamente");
					
					break;
					
				case 0:
					
					System.out.println("***********");
					System.out.println("Saliendo...");
					System.out.println("***********");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
		}while (opc != 0);
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
