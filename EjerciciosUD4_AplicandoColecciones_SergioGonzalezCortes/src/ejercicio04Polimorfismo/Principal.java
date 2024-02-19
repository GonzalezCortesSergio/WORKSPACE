package ejercicio04Polimorfismo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		double precioUnitario, descuentoAl = 30, impuestoEl = 10, garantia;
		String nombre, aux;
		int cantidad, opc, opcTipo;
		boolean aCaducar, tieneGarantia;
		
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
					}
			}
			
		}while (opc != 0);
	}

}
