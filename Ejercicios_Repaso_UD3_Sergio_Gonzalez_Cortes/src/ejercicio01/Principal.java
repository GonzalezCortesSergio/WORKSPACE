package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int entero, opc;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido, este programa comprobará "
				+ "si el número entero que introduce es positivo o negativo");
		
		do {
			System.out.println("Introduzca un número entero");
			aux = s.nextLine();
			entero = Integer.parseInt(aux);
			
			if (comprobarEntero(entero)) {
				
				System.out.println(entero + " es positivo");
			}
			
			else {
				
				System.out.println(entero + " es negativo");
			}
			
			System.out.println("¿Quiere comprobar otro número?");
			
			System.out.println("1. Sí");
			System.out.println("0. No");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
		
		}while (opc != 0);
		
		System.out.println("Gracias por utilizar el programa");
	}
	
	
	public static boolean comprobarEntero(int n) {
		
		if (n > 0) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}

}
