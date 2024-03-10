package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombre, patron = "dd MM yyyy", fecha, hora, aux;
		int opc;
		
		//Scanner
		
		Scanner s = new Scanner (System.in);
		
		//Lista eventos
		
		List<Evento> listaEventos = new ArrayList<Evento>();
		
		listaEventos.add(new Evento ("KnotFest", LocalDate.parse("2024-11-21"), LocalTime.parse("19:00") ));
		listaEventos.add(new Evento ("Los chunguito", LocalDate.parse("2024-03-15"), LocalTime.parse("09:56")));
		
		//GestionEventos
		
		GestionEventos ge = new GestionEventos(listaEventos);
		
		do {
			
			System.out.println("""
					
					----------------------------------------------
					Opción 1:	Agregar evento
					Opción 2:	Borrar evento
					Opción 3:	Lista de eventos
					Opción 4:	Ver cuánto queda para el evento
					Opción 0:	Salir
					----------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre del evento");
					nombre = s.nextLine();
					
					System.out.println("Fecha (año-mes-día)");
					fecha = s.nextLine();
					
					System.out.println("Hora (hora:minuto)");
					hora = s.nextLine();
					
					ge.agregarEvento(new Evento (nombre, LocalDate.parse(fecha), LocalTime.parse(hora)));
					
					
					break;
					
				case 2:
					
					System.out.println("Nombre del evento");
					nombre = s.nextLine();
					
					try {
						
						ge.borrarEvento(ge.buscarPorNombre(nombre));
					}
					
					catch (NullPointerException npe) {
						
						System.out.println("No se ha encontrado el evento indicado");
					}
					
					break;
					
				case 3:
					
					ge.verEventos();
					
					break;
					
				case 4:
					
					System.out.println("Nombre del evento");
					nombre = s.nextLine();
					
					try {
						
						System.out.println("Quedan " + ge.diasRestantes(ge.buscarPorNombre(nombre)) + " días");
					}
					catch (NullPointerException npe) {
						
						System.out.println("No se ha encontrado el evento indicado");
					}
					
					break;
					
					
					
				
					
					
			}
			
		}while (opc != 0);
	
	}

}
