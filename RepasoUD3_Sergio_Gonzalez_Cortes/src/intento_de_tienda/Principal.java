package intento_de_tienda;

import java.util.Scanner;

public class Principal {

	public static void main (String args []) {
		
		
		//Variables
		
		String aux, nombre, id;
		int opc;
		double precioUnitario, porcentaje;
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		//Instanciar array
		Producto [] listaProductos = new Producto [100];
		
		//Instanciar tienda
		
		Tienda t = new Tienda (listaProductos, 0);
		
		//Comienzo del programa
		
		System.out.println("#     #                                        #####                             \r\n"
				+ "##   ##   ##   #    #  ####  #       ####     #     # #####  ####  #####  ###### \r\n"
				+ "# # # #  #  #  ##   # #    # #      #    #    #         #   #    # #    # #      \r\n"
				+ "#  #  # #    # # #  # #    # #      #    #     #####    #   #    # #    # #####  \r\n"
				+ "#     # ###### #  # # #    # #      #    #          #   #   #    # #####  #      \r\n"
				+ "#     # #    # #   ## #    # #      #    #    #     #   #   #    # #   #  #      \r\n"
				+ "#     # #    # #    #  ####  ######  ####      #####    #    ####  #    # ###### ");
		
		do {
			
			System.out.println("""
					
					--------------------------------------------------------------------
					Opción 1:	Agregar producto
					Opción 2:	Ver productos en venta
					Opción 3:	Ver productos descatalogados
					Opción 4:	Descatalogar productos
					Opción 5:	Calcular precio de venta al público
					Opción 0:	Salir
					--------------------------------------------------------------------
					
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre del producto e ID");
					nombre = s.nextLine();
					id = s.nextLine();
					
					System.out.println("Precio unitario");
					aux = s.nextLine();
					precioUnitario = Double.parseDouble(aux);
					
					t.agregarProducto(new Producto (nombre, id, precioUnitario, true));
					
					break;
					
				case 2:
					
					t.mostrarEnVenta();
					
					break;
					
				case 3:
					
					t.mostrarNoEnVenta();
					
					break;
					
				case 4:
					
					System.out.println("Diga el id del producto que quiere descatalogar");
					id = s.nextLine();
					
					t.eliminarProductos(id);
					
					break;
					
				case 5:
					
					System.out.println("Diga el id del producto que quiere modificar");
					id = s.nextLine();
					
					System.out.println("Diga porcentaje de ganancias");
					aux = s.nextLine();
					porcentaje = Double.parseDouble(aux);
					
					System.out.printf("El precio de venta es %.2f\n", t.calcularPrecioFinal(porcentaje, id));
					
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
