package ejemploReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String fecha; //yyyy/MM/dd
		String aux;
		int opc, indice;
		boolean salir = false;
		
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Lista de reservas
		
		List<LocalDate> listaFechas = new ArrayList<LocalDate>();
		
		listaFechas.add(LocalDate.parse("2024-05-26"));
		listaFechas.add(LocalDate.parse("2024-02-22"));
		
		//Reserva
		
		Reserva r = new Reserva (listaFechas);
		
		do {
			
			System.out.println("""
					
					Opción 1:	Hacer reserva
					Opción 2:	Ver reservas
					Opción 3:	Crear reserva
					Opción 0:	Salir
					
					""");
			
			try {
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
				
					System.out.println("Diga el índice de la fecha");
					aux = s.nextLine();
					indice = Integer.parseInt(aux);
					
					r.hacerReserva(indice-1);
					
					System.out.println("La reserva se ha realizado correctamente");
					
					break;
					
				case 2:
					
					r.mostrarTodo();
					
					break;
					
				case 3:
					
					System.out.println("Escriba la fecha (yyyy-MM-dd)");
					fecha = s.nextLine();
					
					
					r.crearReserva(LocalDate.parse(fecha));
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					salir = true;
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
			
			}catch (NumberFormatException nfe) {
				
				System.out.println("Introduzca un número entero");
			}catch (IndexOutOfBoundsException iobe) {
				
				System.out.println("Escoja uno dentro de la lista");
				
			}catch (ReservaAyer ra) {
				
				System.out.println(ra.getMessage());
			}catch (RuntimeException re) {
				
				System.out.println("Error inesperado");
			}
			
		}while(!salir);
		
		s.close();
		
	}

}
