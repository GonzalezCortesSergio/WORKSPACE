package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		double precioFabrica, impuestos, ganancia;
		String aux;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner (System.in);
		
		//Instanciar Calculadora
		
		Calculadora c = new Calculadora ();
		
		//Inicio del programa
		
		System.out.println("*************************************"
				+ "****************************");
		System.out.println("Bienvenido; este programa calcula el "
				+ "precio final de un automóvil");
		System.out.println("*************************************"
				+ "****************************");
		
		System.out.println("Introduzca el precio de fábrica");
		aux = s.nextLine();
		precioFabrica = Double.parseDouble(aux);
		
		System.out.println("Introduzca los impuestos");
		aux = s.nextLine();
		impuestos = Double.parseDouble(aux);
		
		System.out.println("Introduzca el porcentaje de ganancia");
		aux = s.nextLine();
		ganancia = Double.parseDouble(aux);
		
		System.out.printf("El precio final del automóvil es de "
				+ "%.2f€\n", c.calcularPrecioAutomovil(precioFabrica, ganancia, impuestos));
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}
	

}
