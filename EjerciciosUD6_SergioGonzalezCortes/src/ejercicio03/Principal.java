package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variable
		
		double a, b, c;
		String aux;
		int opc;
		boolean salir = false;
		
		//Scanner 
		
		Scanner s = new Scanner(System.in);
		
		//Instancia de la clase que realiza el cálculo
		
		CEcuacion2Grado ceg = new CEcuacion2Grado(); 
		
		//Apartado "visual" del programa
		
		do {
			
			System.out.println("""
					-------------------------------------------------------------------------------
					Opción 1:	Calcular valor positivo de una ecuación de 2º grado
					Opción 2:	Calcular valor negativo de una ecuación de 2º grado
					Opción 0:	Salir
					-------------------------------------------------------------------------------
					""");
			
			try {
				
				aux = s.nextLine();
				opc = Integer.parseInt(aux);
				
				switch (opc) {
				
					case 1:
						
						System.out.println("Número a");
						aux = s.nextLine();
						a = Double.parseDouble(aux);
						
						System.out.println("Número b");
						aux = s.nextLine();
						b = Double.parseDouble(aux);
						
						System.out.println("Número c");
						aux = s.nextLine();
						c = Double.parseDouble(aux);
						
						try {
						
							System.out.printf("El resultado de la operación es %.2f\n", ceg.calcularPositivo(a, b, c));
						
						}catch (EcuacionDegenerada ed) {
							
							System.out.println("*******************************************************");
							System.out.println(ed.getMessage());
							System.out.println("*******************************************************");
							
						}catch (RaicesComplejas rc) {
							
							System.out.println("***************************************************************");
							System.out.println(rc.getMessage());
							System.out.println("***************************************************************");
						}
						
						break;
						
					case 2:
						
						System.out.println("Número a");
						aux = s.nextLine();
						a = Double.parseDouble(aux);
						
						System.out.println("Número b");
						aux = s.nextLine();
						b = Double.parseDouble(aux);
						
						System.out.println("Número c");
						aux = s.nextLine();
						c = Double.parseDouble(aux);
						
						try {
							
							System.out.printf("El resultado de la operación es %.2f\n", ceg.calcularNegativo(a, b, c));
						
						}catch (EcuacionDegenerada ed) {
							
							System.out.println("*******************************************************");
							System.out.println(ed.getMessage());
							System.out.println("*******************************************************");
							
						}catch (RaicesComplejas rc) {
							
							System.out.println("***************************************************************");
							System.out.println(rc.getMessage());
							System.out.println("***************************************************************");
						}
						
						break;
						
					case 0:
						
						System.out.println("***********");
						System.out.println("Saliendo...");
						System.out.println("***********");
						
						salir = true;
						
						break;
						
					default:
						
						System.out.println("*****************");
						System.out.println("Opción equivocada");
						System.out.println("*****************");
						
						break;
						
						
				}
				
				
			}catch (Exception e) {
				
				System.out.println("********************************************************************************");
				System.out.println("Tiene que introducir un número para realizar los cálculos y escoger las opciones");
				System.out.println("********************************************************************************");
			}
			
		}while (!salir);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		
		s.close();
	}

}
