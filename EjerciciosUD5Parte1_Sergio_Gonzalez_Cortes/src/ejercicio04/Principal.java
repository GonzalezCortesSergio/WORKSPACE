package ejercicio04;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String nombre, apellidos, nombreNuevo, apellidosNuevos, telefono, aux;
		int opc;
		
		//Instancia clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instancia mapa de contactos e introducción de algunos contactos
		
		Map<Contacto, String> mapContactos = new HashMap<Contacto, String>();
		
		mapContactos.put(new Contacto ("Sergio", "González Cortés"), "654746511");
		mapContactos.put(new Contacto ("Montserrat", "Cortés Cortés"), "606080658");
		mapContactos.put(new Contacto("Juan Carlos", "González Ximénez"), "639910502");
		
		//Instancia clase CRUDContacto e introducción de mapa de contactos
		
		CRUDContacto cc = new CRUDContacto (mapContactos);
		
		//Inicio del programa
		
		do {
			
			System.out.println("""
					
					------------------------------------------
					Opción 1:	Agregar contacto
					Opción 2:	Listar contactos
					Opción 3:	Cambiar contacto
					Opción 4:	Eliminar contacto
					Opción 0:	Salir
					------------------------------------------
					
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Nombre");
					nombre = s.nextLine();
					
					System.out.println("Apellidos");
					apellidos = s.nextLine();
					
					System.out.println("Teléfono");
					telefono = s.nextLine();
					
					cc.agregarContacto(new Contacto (nombre, apellidos), telefono);
					
					break;
					
				case 2:
					
					cc.listarContactos();
					
					break;
					
				case 3:
					
					System.out.println("Nombre y apellidos del contacto que quiere cambiar");
					nombre = s.nextLine();
					apellidos = s.nextLine();
					
					System.out.println("Nombre nuevo");
					nombreNuevo = s.nextLine();
					
					System.out.println("Apellido nuevo");
					apellidosNuevos = s.nextLine();
					
					cc.cambiarContacto(cc.buscarPorNombreYApellidos(nombre, apellidos), nombreNuevo, apellidosNuevos);
					
					break;
					
				case 4:
					
					System.out.println("Nombre y apellidos del contacto que quiere eliminar");
					nombre = s.nextLine();
					apellidos = s.nextLine();
					
					cc.borrarContacto(cc.buscarPorNombreYApellidos(nombre, apellidos));
					
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
