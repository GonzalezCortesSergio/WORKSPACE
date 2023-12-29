package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String aux;
		double espacioInicial, velocidad, tiempo;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner (System.in);
		
		//Instanciar Calculadora
		
		Calculadora c = new Calculadora();
		
		//Inicio del programa
		
		System.out.println("***********************************"
				+ "***********************************");
		System.out.println("Bienvenido, este programa calculará"
				+ " el espacio recorrido por un objeto");
		System.out.println("***********************************"
				+ "***********************************");
		
		System.out.println("Introduzca el espacio inicial");
		aux = s.nextLine();
		espacioInicial = Double.parseDouble(aux);
		System.out.println("La velocidad");
		aux = s.nextLine();
		velocidad = Double.parseDouble(aux);
		System.out.println("Y finalmente el tiempo");
		aux = s.nextLine();
		tiempo = Double.parseDouble(aux);
		
		System.out.printf("El espacio recorrido es de %.2f metros\n", c.calcularEspacio(espacioInicial, velocidad, tiempo));
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
