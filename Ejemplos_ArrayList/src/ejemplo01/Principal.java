package ejemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux, nombreProducto;
		int seccion, opc, idProducto = 0, opcEnVenta;
		double precioFabrica, transporte;
		
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		Tienda t = new Tienda (listaProductos);
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("""
					Opción 1:	Agregar producto
					Opción 2:	Ver productos
					""");
			
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre del producto");
					nombreProducto = s.nextLine();
					
					System.out.println("""
								SECCION
							Opción 1:	Alimentación
							Opción 2:	Higiene personal
							Opción 3:	Limpieza
							""");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					System.out.println("Precio de fábrica");
					aux = s.nextLine();
					precioFabrica = Double.parseDouble(aux);
					
					listaProductos.add(new Producto(nombreProducto, seccion, precioFabrica, idProducto, true));
					idProducto++;
					
					break;
					
				case 2:
					
					t.listarProductos();
					
					break;
					
					
			}
		}while (opc != 0);
		
	}

}
