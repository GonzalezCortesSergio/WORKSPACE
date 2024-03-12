package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, contenido, aux;
		int opc, id;
		
		//Scanner 
		
		Scanner s = new Scanner(System.in);
		
		//Lista de notas con instancia de algunos ejemplos
		
		List<Nota> listaNotas = new ArrayList<Nota>();
		
		listaNotas.add(new Nota ("Lista de la compra", "Huevos, leche, pan, harina, aceite"));
		listaNotas.add(new Nota ("Mensaje importante", "Awela"));
		listaNotas.add(new Nota ("Hola", "Caracola"));
		
		
		//Instancia de la clase CRUDNota, incluyendo la lista de notas
		
		CRUDNota cn = new CRUDNota (listaNotas);
		
		
		//Inicio del apartado "visual" del programa
		
		do {
			
			System.out.println("""
					
					-----------------------------------
					Opción 1:	Agregar nota
					Opción 2:	Borrar nota
					Opción 3:	Ver nota
					Opción 4:	Listar notas
					Opción 0:	Salir
					-----------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Contenido de la nota");
					contenido = s.nextLine();
					
					cn.agregarNota(new Nota (nombre, contenido));
					
					break;
					
				case 2:
					
					System.out.println("ID de la nota");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					try {
						
						cn.borrarNota(cn.buscarPorId(id));
					}
					catch (NullPointerException npe) {
						
						System.out.println("********************************");
						System.out.println("No se ha encontrado ninguna nota");
						System.out.println("********************************");
					}
					
					break;
					
				case 3:
					
					System.out.println("ID de la nota que quieres ver");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					try {
						
						cn.verNota(cn.buscarPorId(id));
						
					}
					catch (NullPointerException npe) {
						
						System.out.println("********************************");
						System.out.println("No se ha encontrado ninguna nota");
						System.out.println("********************************");
					}
					
					break;
					
				case 4:
					
					cn.listarNotas();
					
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
