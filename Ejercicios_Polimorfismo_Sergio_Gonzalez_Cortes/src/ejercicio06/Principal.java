package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables 
		
		double puntosAdicionales = 4, porcentaje = 1;
		int tam = 3, opc, subOpc;
		String aux;
		double cantidad;
		
		Scanner s = new Scanner(System.in);
		
		CCuenta cuentaCorriente = new CCuentaCorriente ("Miguelón Pérez", 1200, 12);
		
		CCuenta cuentaEmpresa = new CCuentaEmpresa ("Bakery Enterprise", 25000);
		
		CCuenta cuentaJoven = new CCuentaJoven ("Paquito Pérez", 500);
		
		CCuenta[] listaCuentas = new CCuenta[tam];
		
		listaCuentas[0] = cuentaCorriente;
		listaCuentas[1] = cuentaEmpresa;
		listaCuentas[2] = cuentaJoven;
		
		Oficina o = new Oficina (listaCuentas, 3);
		
		System.out.println("Diga que cuenta quiere utilizar");
		
		o.verCuentas();
		
		aux = s.nextLine();
		opc = Integer.parseInt(aux);
		
		switch (opc) {
		
			case 1:
				
				((CCuentaCorriente)listaCuentas[0]).mantenimientoCuenta(porcentaje);
				
				System.out.println("Qué quiere realizar");
				System.out.println("Opción 1:	Sacar dinero");
				System.out.println("Opción 2:	Meter dinero");
				
				aux = s.nextLine();
				subOpc = Integer.parseInt(aux);
				switch (subOpc) {
				
					case 1:
						
						System.out.println("Cuánto dinero quieres sacar");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionRetirarDinero(listaCuentas[0], cantidad, puntosAdicionales);
						
						break;
						
					case 2:
						
						System.out.println("Cuánto dinero quieres meter");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionMeterDinero(listaCuentas[0], cantidad, puntosAdicionales);
						
						break;
				}
				
				break;
				
			case 2:
				
				System.out.println("Qué quiere realizar");
				System.out.println("Opción 1:	Sacar dinero");
				System.out.println("Opción 2:	Meter dinero");
				
				aux = s.nextLine();
				subOpc = Integer.parseInt(aux);
				switch (subOpc) {
				
					case 1:
						
						System.out.println("Cuánto dinero quieres sacar");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionRetirarDinero(listaCuentas[1], cantidad, puntosAdicionales);
						
						break;
						
					case 2:
						
						System.out.println("Cuánto dinero quieres meter");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionMeterDinero(listaCuentas[1], cantidad, puntosAdicionales);
						
						break;
				}
				
				break;
				
			case 3:
				
				System.out.println("Qué quiere realizar");
				System.out.println("Opción 1:	Sacar dinero");
				System.out.println("Opción 2:	Meter dinero");
				
				aux = s.nextLine();
				subOpc = Integer.parseInt(aux);
				switch (subOpc) {
				
					case 1:
						
						System.out.println("Cuánto dinero quieres sacar");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionRetirarDinero(listaCuentas[2], cantidad, puntosAdicionales);
						
						break;
						
					case 2:
						
						System.out.println("Cuánto dinero quieres meter");
						aux = s.nextLine();
						cantidad = Double.parseDouble(aux);
						
						o.operacionMeterDinero(listaCuentas[2], cantidad, puntosAdicionales);
						
						break;
				}
				
				break;
				
		}
	}

}
