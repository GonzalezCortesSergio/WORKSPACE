package repaso01;

import java.util.Scanner;

public class Principal {

	
	public static void main (String args []) {
		
	
		//Variables
		
		String nombre, aux;
		double precioFabrica;
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
			System.out.println("2. Mostrar productos");
			System.out.println("3. Eliminar producto");
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
					
					t.agregarProducto(new Producto (nombre, precioFabrica, seccion, true));
					
					
					break;
					
				case 2:
					
					t.mostrarProductos();
					
					break;
					
				case 3:
					
					System.out.println("Diga el producto que quiere eliminar");
					nombre = s.nextLine();
					
					t.eliminarProducto(nombre);
					
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
