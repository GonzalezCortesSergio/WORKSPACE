package ejercicio01b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	
	public static void main (String [] args) {
		
		int numero1, numero2;
		String aux;
		Calculadora c = new Calculadora();
		Scanner s = new Scanner(System.in);
		try {
			
			System.out.println("Introduzca dos números");
			aux = s.nextLine();
			numero1 = Integer.parseInt(aux);
			aux = s.nextLine();
			numero2 = Integer.parseInt(aux);
			
			System.out.println(c.dividir(numero1, numero2)
					);
			
			System.out.println(c.raizCuadrada(numero2));
			
			
		}catch (ArithmeticException e) {
			
			System.out.println("El denominador no puede ser cero");
		}catch (InputMismatchException e) {
			
			System.out.println("Introduzca un número entero");
		}catch (Exception e) {
			
			System.out.println("Error inesperado");
		}
		
		s.close();
		
	}
}
