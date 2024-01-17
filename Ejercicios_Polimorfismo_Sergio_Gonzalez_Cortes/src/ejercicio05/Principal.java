package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		String aux;
		int objetivoVenta;
		double sueldoBase = 1200, incentivo = 15, impuestos = 5.23;
		
		//Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Se instancian algunos objetos para introducirlos en el array
		
		Empleado e = new Empleado ("Manolo", "Pérez Gómez", sueldoBase, 1);
		
		Empleado gerente = new Gerente ("Bartolomé", "Arnau Txuquispuma", sueldoBase, 2, impuestos);
		
		Empleado vendedor1 = new Vendedor ("Eustaquio", "García Castro", sueldoBase, 3, 5, incentivo);
		
		Empleado vendedor2 = new Vendedor ("Filomeno", "Vaquero Luque", sueldoBase, 4, 2, incentivo);
		
		//Se crea un array de Empleado
		
		Empleado [] listaEmpleados = new Empleado[10];
		
		listaEmpleados[0] = e;
		listaEmpleados[1] = gerente;
		listaEmpleados[2] = vendedor1;
		listaEmpleados[3] = vendedor2;
		
		//Se introduce en Oficina
		
		Oficina o = new Oficina (listaEmpleados, 4);
		
		System.out.println("Diga objetivo de ventas");
		aux = s.nextLine();
		objetivoVenta = Integer.parseInt(aux);
		
		o.mostrarEmpleados(objetivoVenta);
	}

}
