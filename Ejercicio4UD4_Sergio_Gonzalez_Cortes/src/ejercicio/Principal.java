package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 4, diaAct, mesAct, anioAct;
		double descuento = 20, impuesto = 5;
		
		String aux;
		Scanner s = new Scanner(System.in);
		
		
		Producto alimentacion = new Alimentacion (2.34, "Chirimoya", 1, 2, 2024);
		Producto electronica = new Electronica (1300, "NotePad 12112");
		
		LineaVenta lv1 = new LineaVenta(alimentacion, 3);
		
		LineaVenta lv2 = new LineaVenta (electronica, 1);
		
		LineaVenta[] listaLineaVenta = new LineaVenta[tam];
		
		listaLineaVenta[0] = lv1;
		listaLineaVenta[1] = lv2;
		
		Venta v = new Venta (listaLineaVenta);
		
		System.out.println("Qué día es hoy");
		aux = s.nextLine();
		diaAct = Integer.parseInt(aux);
		
		System.out.println("De qué mes");
		aux = s.nextLine();
		mesAct = Integer.parseInt(aux);
		
		System.out.println("De qué año");
		aux = s.nextLine();
		anioAct = Integer.parseInt(aux);
		
		v.mostrarVenta(descuento, impuesto, diaAct, mesAct, anioAct);
		
		
		
	}

}
