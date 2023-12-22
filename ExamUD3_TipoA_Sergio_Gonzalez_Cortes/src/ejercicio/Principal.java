package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String direccion, aux;
		int metrosCuadrados, estado, opc, tam = 100, numTrabajadores, id = 1;
		double precioVenta, gananciaSeminuevo, gananciaNuevo;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar array
		
		Piso [] listaPisos = new Piso [tam];
		
		System.out.println("Cuántos trabajadores tiene la inmobiliaria");
		aux = s.nextLine();
		numTrabajadores = Integer.parseInt(aux);
		
		//Instanciar inmobiliaria
		
		Inmobiliaria i = new Inmobiliaria (listaPisos, 0, numTrabajadores);
		
		
		// Inicio del programa
		
		System.out.println("###                                                                         ######                                             \r\n"
				+ " #  #    # #    #  ####  #####  # #      #   ##   #####  #   ##    ####     #     #  ####  ##### #####  # #      #       ####  \r\n"
				+ " #  ##   # ##  ## #    # #    # # #      #  #  #  #    # #  #  #  #         #     # #    #   #   #    # # #      #      #    # \r\n"
				+ " #  # #  # # ## # #    # #####  # #      # #    # #    # # #    #  ####     ######  #    #   #   #    # # #      #      #    # \r\n"
				+ " #  #  # # #    # #    # #    # # #      # ###### #####  # ######      #    #       #    #   #   #####  # #      #      #    # \r\n"
				+ " #  #   ## #    # #    # #    # # #      # #    # #   #  # #    # #    #    #       #    #   #   #   #  # #      #      #    # \r\n"
				+ "### #    # #    #  ####  #####  # ###### # #    # #    # # #    #  ####     #        ####    #   #    # # ###### ######  ####  ");
		
		System.out.println();
		
		do {
			
			System.out.println("""
					
					-----------------------------------------------------------------------
					Opción 1:	Agregar piso
					Opción 2:	Ver pisos nuevos
					Opción 3:	Ver todos los pisos
					Opción 4:	Calcular precio por metro cuadrado de un piso
					Opción 5:	Cambiar precio de venta de un piso
					Opción 6:	Ver cuánto se ganaría con todos los pisos seminuevos
					Opción 7:	Ver cuánto ganaría cada vendedor con todos los pisos
					Opción 0:	Salir
					-----------------------------------------------------------------------
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Diga la dirección");
					direccion = s.nextLine();
					
					System.out.println("Los metros cuadrados sin comas");
					aux = s.nextLine();
					metrosCuadrados = Integer.parseInt(aux);
					
					System.out.println("El estado del piso");
					System.out.println("""
							Opción 1:	Nuevo
							Opción 2:	Seminuevo
							Opción 3:	A reformar
							""");
					aux = s.nextLine();
					estado = Integer.parseInt(aux);
					
					System.out.println("Diga el precio de venta que el dueño quiere recibir cuando se venda el piso");
					aux = s.nextLine();
					precioVenta = Double.parseDouble(aux);
					
					i.agregar(new Piso (direccion, id, metrosCuadrados, estado, precioVenta));
					id++;
					
					break;
					
				case 2:
					
					i.mostrarPisosNuevos(i.buscarPisosNuevos());
					
					break;
					
					
				case 3:
					
					i.mostrarPisos();
					
					break;
					
				case 4:
					
					System.out.println("Diga el id del piso");
					
					aux = s.nextLine();
					id = Integer.parseInt(aux);;
					
					System.out.println("Diga el porcentaje de ganancia");
					aux = s.nextLine();
					gananciaNuevo = Double.parseDouble(aux);
					
					System.out.printf("El precio por metro cuadrado es de %.2f€\n", i.calcularPrecioMetroCuadrado(gananciaNuevo, id));
					
					break;
					
					
				case 5:
					
					System.out.println("Diga el id del piso");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					System.out.println("Diga el nuevo precio");
					aux = s.nextLine();
					precioVenta = Double.parseDouble(aux);
					
					i.cambiarPrecioVenta(precioVenta, id);
					
					System.out.println("Se ha cambiado el precio correctamente");
					
					break;
					
				case 6:
					
					System.out.println("Introduzca el porcentaje de ganancia de los pisos seminuevos");
					aux = s.nextLine();
					gananciaSeminuevo = Double.parseDouble(aux);
					
					System.out.printf("Se ha ganado %.2f€ con los pisos seminuevos\n", i.sumaTotalPrecioSeminuevo(gananciaSeminuevo));
					
					break;
					
				case 7:
					
					System.out.println("Diga el porcentaje de ganancia de los seminuevos");
					aux = s.nextLine();
					gananciaSeminuevo = Double.parseDouble(aux);
					
					System.out.println("Diga el porcentaje de ganancia de los nuevos");
					aux = s.nextLine();
					gananciaNuevo = Double.parseDouble(aux);
					
					System.out.printf("Cada vendedor ganaría %.2f€\n", i.calcularGananciaVendedores(gananciaNuevo, gananciaSeminuevo) );
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
					
			}
			
		}while (opc != 0);
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("********************************");

	}

}
