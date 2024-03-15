package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		int numero1 = 0, numero2 = 0, opc;
		String aux;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia de la clase Calculadora
		
		Calculadora c = new Calculadora();
		
		//Comienzo del apartado "visual" del programa
		
		System.out.println(" #####     #    #        #####  #     # #          #    ####### ####### ######      #####    ###     ###     ###   \r\n"
				+ "#     #   # #   #       #     # #     # #         # #      #    #     # #     #    #     #  #   #   #   #   #   #  \r\n"
				+ "#        #   #  #       #       #     # #        #   #     #    #     # #     #          # #     # #     # #     # \r\n"
				+ "#       #     # #       #       #     # #       #     #    #    #     # ######      #####  #     # #     # #     # \r\n"
				+ "#       ####### #       #       #     # #       #######    #    #     # #   #            # #     # #     # #     # \r\n"
				+ "#     # #     # #       #     # #     # #       #     #    #    #     # #    #     #     #  #   #   #   #   #   #  \r\n"
				+ " #####  #     # #######  #####   #####  ####### #     #    #    ####### #     #     #####    ###     ###     ### ");
		
		do {
			
			System.out.println("""
					
					-------------------------------------------
					Opción 1:	Sumar
					Opción 2:	Restar
					Opción 3:	Multiplicar
					Opción 4:	Dividir
					Opción 5:	Raíz cuadrada
					Opción 0:	Salir
					-------------------------------------------
					
					""");
			aux = s.nextLine();
			
			try {
				opc = Integer.parseInt(aux);
			}catch (Exception e) {
				
				opc = -1;
			}
			
			switch (opc) {
			
			case -1:
				
				System.out.println("*********************************");
				System.out.println("Escriba un número entero porfavor");
				System.out.println("*********************************");
				
				break;
				
			case 1:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				
				try {
					
					numero1 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Escriba un número entero porfavor");
				}
				
				aux = s.nextLine();
				
				try {
					
					numero2 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Escriba un número entero porfavor");
				}
				
				if (numero1 == 0 && numero2 == 0) {
					
					System.out.println("No se ha podido realizar el cálculo");
				}else {
					
					System.out.printf("El resultado de la suma es %d\n", c.sumar(numero1, numero2));
				
				}
				
				break;
				
			case 2:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				aux = s.nextLine();
				
				try {
					
					numero1 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Escriba un número entero porfavor");
				}
				
				aux = s.nextLine();
				
				try {
					
					numero2 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Escriba un número entero porfavor");
				}
				
				if (numero1 == 0 && numero2 == 0) {
					
					System.out.println("No se ha podido realizar el cálculo");
				}else {
					
					System.out.printf("El resultado de la resta es %d\n", c.restar(numero1, numero2));
				}
				
				break;
				
			case 3:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				
				try {
					
					numero1 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Introduzca un número entero porfavor");
				}
				
				aux = s.nextLine();
				
				try {
					
					numero2 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					
					System.out.println("Introduzca un número entero porfavor");
				}
				
				System.out.printf("El resultado de la multiplicación es %d\n", c.multiplicar(numero1, numero2));
				
				break;
				
				
			case 4:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				
				try {
					
					numero1 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Introduzca un número entero porfavor");
				}
				
				aux = s.nextLine();
				
				try {
					
					numero2 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Introduzca un número entero porfavor");
				}
				
				if (c.calcularRaizCuadrada(numero1) == Double.NaN) {

					
					System.out.println("No se ha podido hacer la división");
					

				}else {
					
					System.out.printf("El resultado de la división es %.2f\n", c.dividir(numero1, numero2));
				}
				
				break;
				
			case 5:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca un número entero");
				
				aux = s.nextLine();
				
				try {
					
					numero1 = Integer.parseInt(aux);
				}catch (Exception e) {
					
					System.out.println("Introduzca un número entero porfavor");
				}
				
				double resultado = c.calcularRaizCuadrada(numero1);
				
				if(resultado ==  Double.NaN) {

					
					System.out.println("No se ha podido hacer la raíz cuadrada");

				}else {
					
					System.out.printf("El resultado de la raíz cuadrada es %.2f\n", resultado);
				}
				
				
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
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	
	}

}
