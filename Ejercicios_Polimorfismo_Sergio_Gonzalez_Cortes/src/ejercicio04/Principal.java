package ejercicio04;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Variables
		
		String aux;
		
		int diaActual, mesActual, anioActual, opc;
		
		double porcentajeAl = 40, porcentajeEl = 15;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia de objetos
		
		Producto chirimoya = new Alimentacion ("Chirimoya", 3.45, 1, 18, 1, 2024);
		
		Producto ordenador = new Electronica ("Ordenador", 750.12, 2, true, 120);
		
		LineaVenta [] listaVentas = new LineaVenta[10];
		
		listaVentas[0] = new LineaVenta(chirimoya, 2);
		
		listaVentas[1] = new LineaVenta(ordenador, 1);
		
		Venta v = new Venta (listaVentas, 2);
		
		
		//Lista de productos
		Producto [] listaProductos = new Producto [2];
		listaProductos [0] = chirimoya;
		listaProductos [1] = ordenador;
		
		
		
		//Parte visible del programa
		
		System.out.println("Día actual");
		aux = s.nextLine();
		diaActual = Integer.parseInt(aux);
		
		System.out.println("Mes actual");
		aux = s.nextLine();
		mesActual = Integer.parseInt(aux);
		
		System.out.println("Año actual");
		aux = s.nextLine();
		anioActual = Integer.parseInt(aux);
		
		do {
			
			System.out.println();
			System.out.println("""
					Opción 1:	Imprimir ticket
					Opción 2:	Ver lista de productos
					Opción 0:	Salir
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:

					v.mostrarVenta(diaActual, mesActual, anioActual, porcentajeAl, porcentajeEl);
					
					break;
					
				case 2:
					
					for (int i = 0; i < listaProductos.length; i++) {
						System.out.println(listaProductos[i]);
						
						if (listaProductos[i] instanceof Alimentacion && diaActual >= (((Alimentacion)listaProductos[i]).getDiaCad() - 2) && mesActual >= ((Alimentacion)listaProductos[i]).getMesCad()
								&& anioActual >= ((Alimentacion)listaProductos[i]).getAnioCad()) {
							
							((Alimentacion)listaProductos[i]).avisarCaducidad();
						}
					}
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
		}while (opc != 0);
		
		System.out.println("Gracias por utilizar el programa");
		
	}

}
