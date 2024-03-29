package ejercicio04Polimorfismo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		double precioUnitario, descuentoAl = 30, impuestoEl = 10, garantia = 50;
		String nombre, aux;
		int cantidad, opc, opcTipo, subOpc;
		boolean aCaducar = false, tieneGarantia = false;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia Linea de ventas
		
		Map <Producto, Integer> lineaVenta = new HashMap<Producto, Integer>();
		
		//Instancia Factorías
		
		CreadorAlimentacion ca = new CreadorAlimentacion();
		CreadorElectronica ce = new CreadorElectronica();
		
		//Se añaden algunas lineas de venta
		
		lineaVenta.put(new Electronica (1200, "LG XLED", true), 1);
		lineaVenta.put(new Alimentacion (2.20, "Chirimoya", false), 6);
		lineaVenta.put(new Electronica (800, "ASUS NotePad 7L", false), 2);
		
		//Se instancia la clase Venta incluyendo las lineas de venta
		
		Venta v = new Venta(lineaVenta);
		
		//Inicio del programa
		
		do {
			
			System.out.println("""
					
					---------------------------------------------
					Opción 1:	Agregar linea de venta
					Opción 2:	Mostrar ticket
					Opción 0:	Salir
					---------------------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Precio unitario");
					aux = s.nextLine();
					precioUnitario = Double.parseDouble(aux);
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("""
								TIPO DE PRODUCTO
							Opción 1:	Alimentación
							Opción 2:	Electrónica
							""");
					aux = s.nextLine();
					opcTipo = Integer.parseInt(aux);
					
					if (opcTipo == 1) {
						
						System.out.println("¿Está a punto de caducar?");
						System.out.println("""
								Opción 1:	Sí
								Opción 2:	No
								""");
						aux = s.nextLine();
						subOpc = Integer.parseInt(aux);
						if (subOpc == 1) {
							
							aCaducar = true;
						}
						else {
							
							aCaducar = false;
						}
						
					}
					
					else if (opcTipo == 2) {
						
						System.out.println("¿Tiene garantía?");
						
						System.out.println("""
								Opción 1:	Sí
								Opción 2:	No
								""");
						aux = s.nextLine();
						subOpc = Integer.parseInt(aux);
						
						if (subOpc == 1) {
							
							tieneGarantia = true;
						}
						
						else{
							
							tieneGarantia = false;
						}
					}
					
					System.out.println("Cantidad");
					aux = s.nextLine();
					cantidad = Integer.parseInt(aux);
					
					
					
					if (opcTipo == 1) {
						
						v.agregarLineaVenta(ca.crearProducto(precioUnitario, nombre, aCaducar, tieneGarantia), cantidad);
						
					}
					
					if (opcTipo == 2) {
						
						v.agregarLineaVenta(ce.crearProducto(precioUnitario, nombre, aCaducar, tieneGarantia), cantidad);
					}
					
					break;
					
				case 2:
					
					v.mostrarVenta(descuentoAl, impuestoEl, garantia);
					
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
