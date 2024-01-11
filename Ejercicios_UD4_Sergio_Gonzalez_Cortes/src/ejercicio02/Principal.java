package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String aux ,nombreEmpresa, direccion, nombreTrabajador,
		telefono, correo, fecha;
		
		int opc;
		
		//Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido, diga el tipo de documento que quiere imprimir");
		
		System.out.println("Opción 1:	Tarjeta de visita");
		System.out.println("Opción 2:	Carta");
		
		aux = s.nextLine();
		
		opc = Integer.parseInt(aux);
		
		switch (opc) {
		
			case 1:
				
				System.out.println("Nombre de la empresa");
				nombreEmpresa = s.nextLine();
				
				System.out.println("Dirección empresa");
				direccion = s.nextLine();
				
				System.out.println("Nombre del trabajador");
				nombreTrabajador = s.nextLine();
				
				System.out.println("Teléfono de contacto");
				telefono = s.nextLine();
				
				System.out.println("Correo de contacto");
				correo = s.nextLine();
				
				
				TarjetaVisita t = new TarjetaVisita(nombreEmpresa,direccion,nombreTrabajador,telefono,correo);
				
				t.imprimirDocumento();
				
				break;
				
			case 2:
				
				System.out.println("Nombre de la empresa");
				nombreEmpresa = s.nextLine();
				
				System.out.println("Dirección empresa");
				direccion = s.nextLine();
				
				System.out.println("Fecha");
				fecha = s.nextLine();
				
				Carta c = new Carta(nombreEmpresa,direccion,fecha);
				
				c.imprimirDocumento();
				
				break;
		}
		
		System.out.println("Gracias por utilizar el programa");
				
		
	}

}
