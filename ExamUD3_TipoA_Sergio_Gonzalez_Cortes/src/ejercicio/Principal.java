package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String direccion, id, aux;
		int metrosCuadrados, estado, opc, tam = 100, numTrabajadores;
		double precioVenta, ganancia;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar array
		
		Piso [] listaPisos = new Piso [tam];
		
		System.out.println("Cuántos trabajadores tiene la inmobiliaria");
		aux = s.nextLine();
		numTrabajadores = Integer.parseInt(aux);
		
		//Instanciar inmobiliaria
		
		Inmobiliaria i = new Inmobiliaria (listaPisos, 0, numTrabajadores);
		
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
					Opción 0:	Salir
					-----------------------------------------------------------------------
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Diga la dirección");
					direccion = s.nextLine();
					
					System.out.println("Diga el id del piso");
					id = s.nextLine();
					
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
					
					break;
					
				case 2:
					
					i.mostrarPisosNuevos(i.buscarPisosNuevos());
					
					break;
					
					
				case 3:
					
					i.mostrarPisos();
					
					break;
					
				case 4:
					
					System.out.println("Diga el id del piso");
					id = s.nextLine();
					
					System.out.println("Diga el porcentaje de ganancia");
					aux = s.nextLine();
					ganancia = Double.parseDouble(aux);
					
					System.out.printf("El precio por metro cuadrado es de %.2f€\n", i.calcularPrecioMetroCuadrado(ganancia, id));
					
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
