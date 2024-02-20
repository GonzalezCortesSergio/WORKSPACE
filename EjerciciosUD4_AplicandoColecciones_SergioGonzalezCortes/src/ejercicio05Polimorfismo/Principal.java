package ejercicio05Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, apellidos, aux;
		double sueldoBase = 0, incentivo = 0, cantVentas = 0, impuestos = 0;
		int opc , opcTipo, id;
		
		//Scanner
		
		Scanner s = new Scanner (System.in);
		
		//Instancia de las factorías
		
		CreadorGerente cg = new CreadorGerente();
		CreadorVendedor cv = new CreadorVendedor();
		
		//Instancia de la lista y se añaden algunos empleados para el ejemplo
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.add(new Gerente ("Jacinto", "Benavente Asturias", 1200, 15));
		listaEmpleados.add(new Gerente ("Jeremías", "Galdiva Asum", 1200, 15));
		listaEmpleados.add(new Vendedor ("Jacobo", "Sánchez Pérez", 2000, 5000, 5));
		listaEmpleados.add(new Vendedor ("Luis", "Sintes Miret", 1500, 7000, 5));
		
		//Se introducen en la clase CRUDEmpleado y esta se introduce en Oficina
		
		CRUDEmpleado ce = new CRUDEmpleado(listaEmpleados);
		
		Oficina o = new Oficina (ce);
		
		//Comienza el programa
		
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------------------------------
					Opción 1:	Agregar empleado
					Opción 2:	Ver empleados
					Opción 3:	Cambiar sueldo base de un empleado
					Opción 4:	Borrar empleado
					Opción 5:	Ver sueldo de un empleado
					Opción 6:	Ver total sueldos
					Opción 0:	Salir
					-------------------------------------------------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Apellidos");
					apellidos = s.nextLine();
					
					System.out.println("Sueldo base");
					aux = s.nextLine();
					sueldoBase = Double.parseDouble(aux);
					
					System.out.println("""
								DE QUE TIPO ES
								
							Opción 1:	Vendedor
							Opción 2:	Gerente
							
							""");
					aux = s.nextLine();
					opcTipo = Integer.parseInt(aux);
					
					switch (opcTipo) {
					
						case 1:
							
							System.out.println("Cantidad ganada en las ventas");
							aux = s.nextLine();
							cantVentas = Double.parseDouble(aux);
							
							System.out.println("Incentivo de ventas");
							aux = s.nextLine();
							incentivo = Double.parseDouble(aux);
							
							cv.crearEmpleado(nombre, apellidos, sueldoBase, impuestos, cantVentas, incentivo);
							
							break;
							
						case 2:
							
							System.out.println("Impuestos");
							aux = s.nextLine();
							impuestos = Double.parseDouble(aux);
							
							cg.crearEmpleado(nombre, apellidos, sueldoBase, impuestos, cantVentas, incentivo);
							
							break;
									
					}
					
					break;
					
				case 2:
					
					ce.listarEmpleados();
					
					break;
					
				case 3:
					
					System.out.println("ID del empleado que quiere cambiar su sueldo base");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					System.out.println("Nuevo sueldo base");
					aux = s.nextLine();
					sueldoBase = Double.parseDouble(aux);
					
					ce.cambiarSueldoBase(ce.buscarPorID(id), sueldoBase);
					
					break;
					
				case 4:
					
					System.out.println("ID del empleado que quiere borrar");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					ce.borrarEmpleado(ce.buscarPorID(id));
					
					break;
					
				case 5:
					
					System.out.println("ID del empleado que quiere ver");
					aux = s.nextLine();
					id = Integer.parseInt(aux);
					
					System.out.printf("El empleado %s %s tiene un sueldo de %.2f€\n", ce.buscarPorID(id).getNombre(), ce.buscarPorID(id).getApellidos(), o.calcularSueldoEmpleado(ce.buscarPorID(id)));
			
					break;
					
				case 6:
					
					System.out.printf("El total en sueldos es de %.2f€\n", o.calcularTotalSueldos());
					
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
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
