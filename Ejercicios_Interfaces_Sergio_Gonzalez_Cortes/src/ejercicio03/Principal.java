package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String aux;
		double hasta, desde;
		int tam, opc;
		
		//Instancia de la clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Pedir tamaño array
		
		System.out.println("Cuántos números quiere generar");
		aux = s.nextLine();
		tam = Integer.parseInt(aux);
		
		
		//Instancia array num
		
		double [] num = new double [tam];
		
		
		//Instancia objeto ArrayReales
		
		ArrayReales a = new ArrayReales(num);
		
		
		//Comienzo del programa
		
		do {
			
			System.out.println("""
					
					----------------------------------------------------------
					Opción 1:	Generar números
					Opción 2:	Ver números
					Opción 3:	Ver mayor número
					Opción 4:	Ver menor númeor
					Opción 5:	Ver suma de todos los números
					Opción 0:	Salir
					----------------------------------------------------------
					
					""");
			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					System.out.println("Desde (mayor que 0)");
					aux = s.nextLine();
					desde = Integer.parseInt(aux);
					
					System.out.println("Hasta");
					aux = s.nextLine();
					hasta = Integer.parseInt(aux);
					
					a.implementarNumeros(desde, hasta);
					
					a.verNumeros();
					
					break;
					
				case 2:
					
					a.verNumeros();
					
					break;
					
				case 3:
					
					System.out.println(a.calcularMaximo());
					
					break;
					
				case 4:
					
					System.out.println(a.calcularMinimo());
					
					break;
					
				case 5:
					
					System.out.println(a.calcularSumatorio());
					
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
