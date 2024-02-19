package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main (String [] args) {
		
		//Variables
		
		String nombre, aux;
		int opc, opcTipo, opcCad, codProducto;
		double precioBase, porcentajeAl = 20, porcentajeEl = 10;
		boolean aPuntoCad = false;
		
		Scanner s = new Scanner(System.in);
		CreadorProductoAlimentacion cpa = new CreadorProductoAlimentacion ();
		CreadorProductoElectronica cpe = new CreadorProductoElectronica ();
		
		List<Producto> listaProductos = new ArrayList <Producto>();
		
		Tienda t = new Tienda(listaProductos);
		
		do {
			
			System.out.println("""
					
					-------------------------------------------
					Opción 1:	Agregar producto
					Opción 2:	Ver productos
					Opción 3:	Ver precio de venta
					Opción 0:	Salir
					-------------------------------------------
					
					""");
			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Qué tipo quiere crear");
					System.out.println("Opción 1:	Alimentación");
					System.out.println("Opción 2:	Electrónica");
					aux = s.nextLine();
					opcTipo = Integer.parseInt(aux);
					
					System.out.println("Nombre del producto");
					nombre = s.nextLine();
					
					System.out.println("Precio base");
					aux = s.nextLine();
					precioBase = Double.parseDouble(aux);
					
					if (opcTipo == 1) {
						
						System.out.println("¿Está a punto de caducar?");
						System.out.println("1: Sí");
						System.out.println("2: No");
						
						aux = s.nextLine();
						opcCad = Integer.parseInt(aux);
						
						if (opcCad == 1) {
							
							aPuntoCad = true;
						}
						
						else {
							
							aPuntoCad = false;
						}
					}
					
					if (opcTipo == 1) {
						
						t.agregarProducto(cpa.crearProducto(nombre, precioBase, aPuntoCad));
					}
					
					else if (opcTipo == 2) {
						
						t.agregarProducto(cpe.crearProducto(nombre, precioBase, aPuntoCad));
					}
					
					break;
					
				case 2:
					
					t.verProductos();
					
					break;
					
				case 3:
					
					System.out.println("Código del producto que quiere ver");
					aux = s.nextLine();
					codProducto = Integer.parseInt(aux);
					
					System.out.println(t.buscarPorId(codProducto) + "\tPVP= " + t.calcularPVPProducto(t.buscarPorId(codProducto), porcentajeAl, porcentajeEl));
					
					break;
					
				case 0:
					
					System.out.println("***********");
					System.out.println("Saliendo...");
					System.out.println("***********");
					
					break;
					
				default:
					
					System.out.println("*****************");
					System.out.println("Opción equivocada");
					System.out.println("*****************");
					
					break;
					
					
			}
			
		}while (opc != 0);
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		
	}
}
