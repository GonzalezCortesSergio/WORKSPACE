package repaso01;

import java.util.Scanner;

public class Principal {

	
	public static void main (String args []) {
		
	
		//Variables
		
		String nombre, id,  aux;
		double precioFabrica, ganancia, descuento;
		int seccion; // 1 Alimentación, 2 Electrónica, 3 Ropa
		int tam = 100, opc;
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		//Instanciar array
		Producto [] listaProductos = new Producto [tam];
		
		
		//Instanciar tienda
		Tienda t = new Tienda (listaProductos, 0);
		
		
		do {
			
			System.out.println("1. Agregar nuevo producto");
			System.out.println("2. Mostrar productos activos");
			System.out.println("3. Buscar por sección");
			System.out.println("4. Cambiar precio fábrica de sección");
			System.out.println("5. Calcular precio de venta al público");
			System.out.println("6. Hacer descuento");
			System.out.println("7. Borrar sección");
			System.out.println("8. Mostrar productos inactivos");
			System.out.println("0. Salir");
			
			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Diga nombre");
					
					nombre = s.nextLine();
					
					
					System.out.println("Diga precio de fabrica");
					aux = s.nextLine();
					precioFabrica = Double.parseDouble(aux);
					
					System.out.println("Diga sección");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					System.out.println("Diga id");
					id = s.nextLine();
					
					t.agregarProducto(new Producto (nombre, precioFabrica, seccion, true, id));
					
					
					break;
					
				case 2:
					
					t.mostrarProductos();
					
					break;
					
				case 3:
					
					System.out.println("Diga la sección que quiere buscar");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					t.mostrarLista(t.buscarBySeccion(seccion));
					
					break;
					
				case 4:
					
					System.out.println("Diga la sección que quiere cambiar");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					System.out.println("Diga el nuevo precio");
					aux = s.nextLine();
					precioFabrica = Double.parseDouble(aux);
					
					t.cambiarPrecioSeccion(seccion, precioFabrica);
					
					break;
					
				case 5:
					
					System.out.println("Introduzca el id del producto");
					id = s.nextLine();
					
					System.out.println("Introduzca el porcentaje de ganancia");
					aux = s.nextLine();
					ganancia = Double.parseDouble(aux);
					
					System.out.printf("El precio de venta al público es de %.2f€\n", t.calcularPrecioVentaPublico(ganancia, id));
					
					break;
					
				case 6:
					
					System.out.println("Diga porcentaje descuento");
					aux = s.nextLine();
					descuento = Double.parseDouble(aux);
					
					System.out.println("Diga la ganancia");
					aux = s.nextLine();
					ganancia = Double.parseDouble(aux);
					
					System.out.println("Diga el id del producto a modificar");
					id = s.nextLine();
					
					System.out.printf("El precio con descuento es: %.2f€\n", t.hacerDescuento(descuento, ganancia, id));
					
					break; 
					
				case 7:
					
					System.out.println("Diga qué sección quiere eliminar");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					System.out.println("Se han eliminado " + t.eliminarSeccion(seccion) + " productos");
					
					break;
					
				case 8:
					
					t.mostrarProductosInactivos();
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
			}
			
			
			
			
		}while (opc != 0);
		
		System.out.println("********************************");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("********************************");

	}
	
	
}
