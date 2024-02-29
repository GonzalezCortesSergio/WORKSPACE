package ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, dni, aux;
		double sueldoHoras = 8, horasTrabajadas;
		int opc;
		
		//Instancia de Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Creación de lista de trabajadores
		
		List<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
		
		//Se incluyen algunos trabajadores a la lista
		
		listaTrabajadores.add(new Trabajador ("Sergio", "41606806J", 8));
		listaTrabajadores.add(new Trabajador ("Antonio", "4123554L", 12));
		listaTrabajadores.add(new Trabajador ("Diego", "5012557P", 4));
		listaTrabajadores.add(new Trabajador ("Lucas", "3276991K", 6));
		listaTrabajadores.add(new Trabajador ("Sergio", "11223344L", 13));
		
		//Se instancia la clase CRUDTrabajador incluyendo la lista de trabajadores
		
		CRUDTrabajador ct = new CRUDTrabajador (listaTrabajadores);
		
		
		//Inicio del programa
		
		do {
			
			System.out.println("""
					
					-----------------------------------------------------
					Opción 1:	Agregar trabajador
					Opción 2:	Listar por nombre y sueldo
					Opción 3:	Borrar trabajador
					Opción 0:	Salir
					-----------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("DNI");
					dni = s.nextLine();
					
					System.out.println("Horas trabajadas");
					aux = s.nextLine();
					horasTrabajadas = Double.parseDouble(aux);
					
					ct.agregarTrabajador(new Trabajador (nombre, dni, horasTrabajadas));
					
					break;
					
				case 2:
					
					ct.listarPorNombreYHoras(sueldoHoras);
					
					
					break;
					
				case 3:
					
					System.out.println("DNI del trabajador que quiere borrar");
					dni = s.nextLine();
					
					ct.borrarTrabajador(ct.buscarPorDNI(dni));
					
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
