package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		double largo, ancho, altura, lado, radio, areaBase;
		int opc;
		Scanner s = new Scanner(System.in);
		Cubo c= new Cubo();
		Esfera e = new Esfera();
		Piramide p = new Piramide();
		Rectangulo r = new Rectangulo();
		System.out.println("Bienvenido, este programa calculará"
				+ " el área de las formas geométricas que escojas");
		
		do {
		System.out.println("""
				Opción 1:	Cubo
				Opción 2:	Esfera
				Opción 3:	Pirámide
				Opción 4:	Cubo rectangular
				Opción 0:	Salir
				""");
		
		aux = s.nextLine();
		opc = Integer.parseInt(aux);
		
		switch (opc) {
		
			case 1:
				
				System.out.println("Introduzca los lados del cubo en cm");
				aux = s.nextLine();
				lado = Double.parseDouble(aux);
				
				System.out.printf("El volumen del cubo es de %.2fcm³\n", c.calcularVolumen(lado));
				
				break;
				
			case 2:
				
				System.out.println("Introduzca el radio de la esfera en cm");
				aux = s.nextLine();
				radio = Double.parseDouble(aux);
				
				System.out.printf("El volumen de la esfera es de %.2fcm³\n", e.calcularVolumen(radio));
				
				break;
				
			case 3:
				
				System.out.println("Introduzca el área de la base de la pirámide "
						+ "en cm²");
				aux = s.nextLine();
				areaBase = Double.parseDouble(aux);
				System.out.println("Introduzca la altura de la pirámide en cm");
				aux = s.nextLine();
				altura = Double.parseDouble(aux);
				
				System.out.printf("El volumen de la pirámide es de %.2fcm³\n", p.calcularVolumen(areaBase, altura));
		
				break;
				
			case 4:
				
				System.out.println("Introduzca el largo, ancho y alto del rectángulo en cm");
				
				aux = s.nextLine();
				largo = Double.parseDouble(aux);
				aux = s.nextLine();
				ancho = Double.parseDouble(aux);
				aux = s.nextLine();
				altura = Double.parseDouble(aux);
				
				System.out.printf("El volumen del rectángulo es de %.2fcm³\n", r.calcularVolumen(largo, ancho, altura));
		
				break;
				
			case 0:
				
				System.out.println("Saliendo...");
				
				break;
				
			default:
				
				System.out.println("Opción equivocada");
				
				break;
		}
		
		}while (opc != 0);
		
		System.out.println("Gracias por utilizar el programa");
	}

}
