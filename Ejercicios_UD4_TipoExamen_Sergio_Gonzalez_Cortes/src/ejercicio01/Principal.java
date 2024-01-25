package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombreCliente, aux;
		int nDiasOcupada, nOcupantes, tam = 10, opc, id, opcServicio;
		double gastadoServicioHabitaciones;
		double extraServicioLimpieza = 15.21, descuento = 15;
		
		//Clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Array de habitaciones
		
		Habitacion [] listaHabitaciones = new Habitacion [tam];
		
		//Creamos algunas habitaciones
		
		Habitacion habitacion = new Habitacion (120, false, null, 0, 0, 1);
		
		Habitacion suite = new Suite (2300, false, null, 0, 0, 2, 20, 0);
		
		Habitacion apartamento = new Apartamento (1200, false, null, 0 , 0, 3, 10, false, extraServicioLimpieza);
		
		Habitacion habitacion2 = new Habitacion (200, true, "Jose Antonio", 12, 2, 4);
		
		Habitacion suite2 = new Suite (3000, true, "Benito Antonio José Galdiva", 23, 3, 5, 120, 500);
		
		Habitacion apartamento2 = new Apartamento (1500, true, "Miguelón El de Abajo", 31, 1, 6, 25, true, extraServicioLimpieza);
		
		//Se introducen en el array de habitaciones 
		
		listaHabitaciones[0] = habitacion;
		listaHabitaciones[1] = suite;
		listaHabitaciones[2] = apartamento;
		listaHabitaciones[3] = habitacion2;
		listaHabitaciones[4] = suite2;
		listaHabitaciones[5] = apartamento2;
		
		
		//Se crea la clase Gestion
		
		Gestion g = new Gestion (listaHabitaciones);
		
		//Se inicia el programa
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------------------
					Opción 1:	Ver todas las habitaciones
					Opción 2:	Ver habitaciones libres
					Opción 3:	Vender habitacion
					Opción 4:	Ver factura
					Opción 5:	Ver total recaudado
					Opción 0:	Salir
					-------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					g.verHabitaciones();
					
					break;
					
				case 2:
					
					g.verHabitacionesLibres(g.buscarNoOcupadas());
					
					break;
					
				case 3:
					
					System.out.println("¿Qué habitacion quiere vender?");
					
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					System.out.println("Cómo se llama");
					nombreCliente = s.nextLine();
					g.buscarPorId(id).setNombreCliente(nombreCliente);
					
					System.out.println("Cuántos días quiere ocuparla");
					aux = s.nextLine();
					nDiasOcupada = Integer.parseInt(aux);
					g.buscarPorId(id).setnDiasOcupada(nDiasOcupada);
					
					System.out.println("Cuántos ocupantes hay");
					aux = s.nextLine();
					nOcupantes = Integer.parseInt(aux);
					g.buscarPorId(id).setnOcupantes(nOcupantes);
					
					
					if (g.buscarPorId(id) instanceof Suite ) {
						
						System.out.println("¿Cuánto se va a gastar en el servicio de habitaciones?");
						aux = s.nextLine();
						gastadoServicioHabitaciones = Double.parseDouble(aux);
						
						((Suite)g.buscarPorId(id)).setGastadoServicioHabitaciones(gastadoServicioHabitaciones);
						
					}
					
					else if (g.buscarPorId(id) instanceof Apartamento) {
						
						do {
						System.out.println("¿Quiere servicio de limpieza?");
						System.out.println("""
								------------------------------
								Opción 1:	Sí
								Opción 2:	No
								------------------------------
								""");
						aux = s.nextLine();
						opcServicio = Integer.parseInt(aux);
						
						switch (opcServicio) {
						
							case 1:
								
								((Apartamento)g.buscarPorId(id)).setServicioLimpieza(true);
								
								break;
								
							case 2:
								
								((Apartamento)g.buscarPorId(id)).setServicioLimpieza(false);
								
								break;
								
							default:
								
								System.out.println("Opción equivocada");
								
								break;
						}
						}while (opcServicio != 1 && opcServicio != 2);
						
						
					}
					
					g.buscarPorId(id).setOcupada(true);
					
					break;
					
				case 4:
					
					g.verHabitacionesOcupadas(g.buscarOcupadas());
					
					System.out.println("De cuál habitacion quieres ver la factura");
					
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					g.mostrarFactura(g.buscarPorId(id), descuento);
					
					break;
					
				case 5:
					
					System.out.printf("Se ha recaudado en total %.2f€\n", g.calcularTotalRecaudado(g.buscarOcupadas(),descuento));
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
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
