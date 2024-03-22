package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		int opc, numOperaciones;
		boolean salir = false;
		String aux, codigo;
		double dineroCaja;
		
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		
		//Instancia de la clase caja con un dinero insertado de ejemplo
		
		Caja c = new Caja (254.5);
		
		
		//Comiendo del apartado "visual" del programa
		
		do {
			
			System.out.println("""
					-----------------------------------------------------------
					Opción 1:	Activar caja
					Opción 2:	Comprobar dinero de la caja
					Opción 3:	Comprobar número de operaciones
					Opción 0:	Salir
					-----------------------------------------------------------
					""");
			
			try {
				
				aux = s.nextLine();
				opc = Integer.parseInt(aux);
				
				switch (opc) {
				
					case 1:
						
						System.out.println("Introduzca el código (tiene que tener una letra inicial seguida de 4 números)");
						codigo = s.nextLine();
						
						c.activarCaja(codigo);
						
						break;
						
					case 2:
						
						System.out.println("Introduzca el dinero recaudado");
						aux = s.nextLine();
						dineroCaja = Double.parseDouble(aux);
						
						c.comprobarDinero(dineroCaja);
						
						break;
						
					case 3:
						
						System.out.println("Introduzca el número de operaciones realizada");
						aux = s.nextLine();
						numOperaciones = Integer.parseInt(aux);
						
						c.pedirNumOperaciones(numOperaciones);
						
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
				
			}catch (NumberFormatException nfe) {
				
				System.out.println("***********************************************************************************");
				System.out.println("Introduzca un número entero para escoger una opción y para realizar las operaciones");
				System.out.println("***********************************************************************************");
			}catch (NumeroNegativo nn) {
				
				System.out.println("**********************************************");
				System.out.println(nn.getMessage());
				System.out.println("**********************************************");
			}catch (RecaudadoIncorrecto ri) {
				
				System.out.println("***************************************************");
				System.out.println(ri.getMessage());
				System.out.println("***************************************************");
			}catch (CodigoIncorrecto ci) {
				
				System.out.println("******************************************************************");
				System.out.println(ci.getMessage());
				System.out.println("******************************************************************");
			}catch (Exception e) {
				
				System.out.println("****************");
				System.out.println("Error inesperado");
				System.out.println("****************");
			}
			
		}while (!salir);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		
		s.close();

	}

}
