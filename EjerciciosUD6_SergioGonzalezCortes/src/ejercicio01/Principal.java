package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		int numero1 = 0, numero2 = 0, opc = -1;
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
			
			try {
			aux = s.nextLine();
			
			opc = Integer.parseInt(aux);
				
			
			switch (opc) {
			
				
				case -1:
					
					break;
					
					
				case 1:
				
				numero1 = 0;
				numero2 = 0;
				
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				numero1 = Integer.parseInt(aux);
				
				aux = s.nextLine();
				numero2 = Integer.parseInt(aux);
				
				System.out.printf("El resultado de la suma es %d\n", c.sumar(numero1, numero2));
				
				
				
				break;
				
				case 2:
				numero1 = 0;
				numero2 = 0;
	
				
				System.out.println("Introduzca dos números enteros");
				aux = s.nextLine();
				numero1 = Integer.parseInt(aux);
				
				
				aux = s.nextLine();
				numero2 = Integer.parseInt(aux);
					
				System.out.printf("El resultado de la resta es %d\n", c.restar(numero1, numero2));
				
				
				break;
				
			case 3:
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				numero1 = Integer.parseInt(aux);
		
				aux = s.nextLine();
				numero2 = Integer.parseInt(aux);
				
				System.out.printf("El resultado de la multiplicación es %d\n", c.multiplicar(numero1, numero2));
				
				break;
				
				
			case 4:
				
				numero1 = 0;
				numero2 = 0;
				
				System.out.println("Introduzca dos números enteros");
				
				aux = s.nextLine();
				numero1 = Integer.parseInt(aux);
				
				aux = s.nextLine();
				numero2 = Integer.parseInt(aux);
					
				System.out.printf("El resultado de la división es %.2f\n", c.dividir(numero1, numero2));
				
				
				break;
				
			case 5:
				
				numero1 = 0;
				
				System.out.println("Introduzca un número entero");
				
				aux = s.nextLine();
				numero1 = Integer.parseInt(aux);
				
				System.out.printf("El resultado de la raíz cuadrada es %.2f\n", c.calcularRaizCuadrada(numero1));
				
				
				
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
			}catch(ArithmeticException ae) {
				
				System.err.println("Nos ce puede dividi entres cero");
			}catch (NaNException ne) {
				
				System.err.println(ne.getMessage());
			}catch (Exception e) {
				
				System.err.println("Churra introduce un numerichi");
			}
		
			
		}while (opc != 0);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		s.close();
	
	}

}
