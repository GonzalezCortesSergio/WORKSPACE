package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		//Variables
		
		int cilindrada, cv, categoria, opc;
		double transporte;
		String aux;
		
		//Scanner 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido, este programa "
				+ "te dirá el impuesto a pagar en "
				+ "función del tipo de vehículo y "
				+ "sus características");
		
		System.out.println("Diga que tipo de vehículo es");
		
		System.out.println("""
				Opción 1:	Motocicleta
				Opción 2:	Furgoneta
				Opción 3:	Coche
				""");
		aux = s.nextLine();
		opc = Integer.parseInt(aux);
		
		switch (opc) {
		
			case 1:
				
				System.out.println("Tipo de cilindrada");
				aux = s.nextLine();
				cilindrada = Integer.parseInt(aux);
				
				System.out.println("Potencia del vehículo");
				aux = s.nextLine();
				cv = Integer.parseInt(aux);
				
				System.out.println("""
						Categoría de emisiones:
					Opción 1:	0 emisiones
					Opción 2:	ECO
					Opción 3:	Tipo B
					Opción 4:	Tipo C
						""");
				aux = s.nextLine();
				categoria = Integer.parseInt(aux);
				
				Motocicleta m = new Motocicleta (cilindrada,cv,categoria);
				
				System.out.println("Tendrás un impuesto de "+m.calcularImpuesto(0));
				
				break;
				
			case 2:
				
				System.out.println("Tipo de cilindrada");
				aux = s.nextLine();
				cilindrada = Integer.parseInt(aux);
				
				System.out.println("Potencia del vehículo");
				aux = s.nextLine();
				cv = Integer.parseInt(aux);
				
				System.out.println("""
						Categoría de emisiones:
					Opción 1:	0 emisiones
					Opción 2:	ECO
					Opción 3:	Tipo B
					Opción 4:	Tipo C
						""");
				aux = s.nextLine();
				categoria = Integer.parseInt(aux);
				
				System.out.println("Porcentaje por el transporte");
				aux = s.nextLine();
				transporte = Double.parseDouble(aux);
				
				Furgoneta f = new Furgoneta(cilindrada,cv,categoria);
				
				System.out.println("Tendrás un porcentaje de impuesto de "+ f.calcularImpuesto(transporte));
				
				break;
				
			case 3:
				
				System.out.println("Tipo de cilindrada");
				aux = s.nextLine();
				cilindrada = Integer.parseInt(aux);
				
				System.out.println("Potencia del vehículo");
				aux = s.nextLine();
				cv = Integer.parseInt(aux);
				
				System.out.println("""
						Categoría de emisiones:
					Opción 1:	0 emisiones
					Opción 2:	ECO
					Opción 3:	Tipo B
					Opción 4:	Tipo C
						""");
				aux = s.nextLine();
				categoria = Integer.parseInt(aux);
				
				Coche c = new Coche(cilindrada,cv,categoria);
				
				System.out.println("Tendrás un porcentaje de impuesto de "+ c.calcularImpuesto(0));
				
				break;
		}
	}

}
