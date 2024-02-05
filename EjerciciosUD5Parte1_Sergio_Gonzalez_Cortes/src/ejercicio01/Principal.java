package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String titulo, contenido, aux;
		int opc, idNota;
		
		//Instancia Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia de lista de notas
		
		List<Nota> listaNotas = new ArrayList<Nota>();
		
		
		listaNotas.add(new Nota ("Salutaciones al Garfia", "AWEEEEELAAAA"));
		listaNotas.add(new Nota ("Lista de la compra", "Huevos, Leche, Pan, Lejía"));
		listaNotas.add(new Nota ("Trabalenguas to wapo", "El cielo está enladrillado, ¿quién lo desenladrillará? El desenladrillador que lo desenladrille;"
				+ " buen desenladrillador será"));
		
		//Instancia de la clase CRUDNota incluyendo la lista de notas
		
		CRUDNota cn = new CRUDNota(listaNotas);
		
		
		//Comienzo del programa
		
		do {
			
			System.out.println("""
					
					------------------------------------
					Opción 1:	Agregar nota
					Opción 2:	Listar notas
					Opción 3:	Ver nota
					Opción 4:	Eliminar nota
					Opción 5:	Cambiar nombre nota
					Opcion 6:	Cambiar contenido nota
					Opción 0:	Salir
					------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Diga el título de la nota");
					titulo = s.nextLine();
					
					System.out.println("Escriba el contenido de la nota");
					contenido = s.nextLine();
					
					cn.agregarNota(new Nota (titulo, contenido));
					
					
					break;
					
			
				case 2:
					
					cn.mostrarLista();
					
					break;
					
				case 3:
					
					System.out.println("Diga el id de la nota que quiere ver");
					aux = s.nextLine();
					idNota = Integer.parseInt(aux);
					
					cn.verContenidoNota(cn.buscarPorId(idNota));
					
					break;
					
				case 4:
					
					System.out.println("Diga el id de la nota que quiere eliminar");
					aux = s.nextLine();
					idNota = Integer.parseInt(aux);
					
					cn.eliminarNota(cn.buscarPorId(idNota));
					
					break;
					
				case 5:
					
					System.out.println("Diga el id de la nota que quiere cambiar");
					aux = s.nextLine();
					idNota = Integer.parseInt(aux);
					
					System.out.println("Diga el nuevo nombre de la nota");
					titulo = s.nextLine();
					
					cn.cambiarNombreNota(cn.buscarPorId(idNota), titulo);
					
					break;
					
				case 6:
					
					System.out.println("Diga el id de la nota que quiere cambiar");
					aux = s.nextLine();
					idNota = Integer.parseInt(aux);
					
					System.out.println("Diga el nuevo contenido de la nota");
					contenido = s.nextLine();
					
					cn.cambiarContenidoNota(cn.buscarPorId(idNota), contenido);
					
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
