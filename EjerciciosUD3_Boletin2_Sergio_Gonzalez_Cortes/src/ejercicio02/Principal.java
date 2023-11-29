package ejercicio02;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String aux, nCliente, tipo, nID;
		int nDias, serviciosExtra, tam = 10, numHabitaciones = 0, opcion, opcionLimpia, opcionOcupada, opcionVenta; 
		double precioInicial, precioAdicional= 0;
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		//Instanciar Array
		
		Habitacion [] listaHabitaciones = new Habitacion [tam];
		
		//Instanciar Hotel
		
		Hotel h = new Hotel (listaHabitaciones, numHabitaciones); 
		
		System.out.println("/".repeat(89));
		System.out.println();
		System.out.println("#     #                               #######                                             \r\n"
				+ "#     #  ####  ##### ###### #         #       #  ####  #    # ###### #####  ######  ####  \r\n"
				+ "#     # #    #   #   #      #         #       # #    # #    # #      #    # #      #      \r\n"
				+ "####### #    #   #   #####  #         #####   # #      #    # #####  #    # #####   ####  \r\n"
				+ "#     # #    #   #   #      #         #       # #  ### #    # #      #####  #           # \r\n"
				+ "#     # #    #   #   #      #         #       # #    # #    # #      #   #  #      #    # \r\n"
				+ "#     #  ####    #   ###### ######    #       #  ####   ####  ###### #    # ######  ####  ");
		
		System.out.println();
		System.out.println("/".repeat(89));
		System.out.println();
		
		do {
			
			
			System.out.println("""
					---------------------------------------------
					Opción 1:	Agregar una habitación
					Opción 2:	Mostrar Factura
					Opción 3:	Ver habitaciones disponibles
					Opción 0:	Salir
					---------------------------------------------
					""");
			
			aux = s.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					
					System.out.println("Nombre del cliente");
					nCliente = s.nextLine();
					
					System.out.println("Días en los que hospeda");
					aux = s.nextLine();
					nDias = Integer.parseInt(aux);
					
					System.out.println("Tipo de habitación");
					tipo = s.nextLine();
					
					System.out.println("Precio de la habitación "+tipo);
					aux = s.nextLine();
					precioInicial = Double.parseDouble(aux);
					
					do {
						System.out.println("""
								---------------------------------------
								Servicios extra:
							
								Opción 0:	Sin servicios extra
								Opción 1:	Minibar
								Opción 2:	Servicio de comida	
								---------------------------------------						
								""");
						aux = s.nextLine();
						serviciosExtra = Integer.parseInt(aux);
					
					}while (serviciosExtra != 0 && serviciosExtra != 1 &&
							serviciosExtra != 2);
					
					if (serviciosExtra == 0) {
						
						precioAdicional = 0;
					}
					
					else if (serviciosExtra == 1) {
						
						precioAdicional = 25;
					}
					
					else {
						
						precioAdicional = 35.99;
					}
					
					System.out.println("¿Está la habitacion limpia?");
					
					do {
						System.out.println("""
								-------------------------
								Opción 1:	Sí
								Opción 2:	No
								-------------------------
								""");
						aux = s.nextLine();
						opcionLimpia = Integer.parseInt(aux);
						
					}while (opcionLimpia != 1 && opcionLimpia != 2);
					
					System.out.println("¿Está ocupada la habitación?");
					
					do {
						
						System.out.println("""
								-------------------------
								Opción 1:	Sí
								Opción 2:	No
								-------------------------
								""");
						
						aux = s.nextLine();
						opcionOcupada = Integer.parseInt(aux);
						
					}while (opcionOcupada != 1 && opcionOcupada != 2);
					
					h.agregarHabitacion(new Habitacion (nCliente, nDias, 
							precioInicial, tipo, serviciosExtra, 
							h.comprobarLimpia(opcionLimpia), 
							h.comprobarOcupada(opcionOcupada)));
					
					break;
					
				case 2:
					
					System.out.println("Introduzca el nombre del cliente"
							+ " de la habitación");
					nCliente = s.nextLine();
					
					System.out.println(h.findByNCliente(nCliente).toString());
					System.out.println();
					System.out.printf("Precio a pagar: %.2f€\n", h.calcularPrecioFinal(precioAdicional, nCliente));
					
					break;
					
					
				case 3:
					
					h.findByOcupado();
					
					System.out.println("¿Quiere vender una habitación?");
					
					do {
						
						System.out.println("""
								Opción 1:	Sí
								Opción 0:	No
								""");
						aux = s.nextLine();
						opcionVenta = Integer.parseInt(aux);
						
						if (opcionVenta == 1) {
							
							System.out.println("Introduzca el nombre identificativo");
							nID = s.nextLine();
							
							System.out.println("Nombre del cliente");
							nCliente = s.nextLine();
							h.findByNCliente(nID).setnCliente(nCliente);
							
							System.out.println("Días en los que hospeda");
							aux = s.nextLine();
							nDias = Integer.parseInt(aux);
							h.findByNCliente(nCliente).setnDias(nDias);
							
							do {
								System.out.println("""
										----------------------------------------
										Servicios extra:
									
										Opción 0:	Sin servicios extra
										Opción 1:	Minibar
										Opción 2:	Servicio de comida	
										----------------------------------------						
										""");
								aux = s.nextLine();
								serviciosExtra = Integer.parseInt(aux);
								h.findByNCliente(nCliente).setServiciosExtra(serviciosExtra);
							
							}while (h.findByNCliente(nCliente).getServiciosExtra() != 0 && h.findByNCliente(nCliente).getServiciosExtra() != 1 &&
									h.findByNCliente(nCliente).getServiciosExtra() != 2);
							
							if (h.findByNCliente(nCliente).getServiciosExtra() == 0) {
								
								precioAdicional = 0;
							}
							
							else if (h.findByNCliente(nCliente).getServiciosExtra() == 1) {
								
								precioAdicional = 25;
							}
							
							else {
								
								precioAdicional = 35.99;
							}
							
							h.findByNCliente(nCliente).setOcupada(true);
							
							
							
						}
						
					}while (opcionVenta != 0 && opcionVenta != 1);
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
		}while (opcion != 0);
		System.out.println();
		System.out.println("*********************");
		System.out.println("Que tenga un buen día");
		System.out.println("*********************");
	}
	
	

}
