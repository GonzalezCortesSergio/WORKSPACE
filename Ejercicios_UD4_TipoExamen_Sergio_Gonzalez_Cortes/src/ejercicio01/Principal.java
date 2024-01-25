package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		String nombreCliente, aux;
		int nDiasOcupada, nOcupantes, tam = 10;
		double gastadoServicioHabitaciones;
		double extraServicioLimpieza = 15.21;
		
		//Clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Array de habitaciones
		
		Habitacion [] listaHabitaciones = new Habitacion [tam];
		
		//Creamos algunas habitaciones
		
		Habitacion habitacion = new Habitacion (120, false, null, 0, 0, 1);
		
		Habitacion suite = new Suite (2300, false, null, 0, 0, 2, 20, 0);
		
		Habitacion apartamento = new Apartamento (1200, false, null, 0 , 0, 3, 10, false, 0);
		
		Habitacion habitacion2 = new Habitacion (200, true, "Jose Antonio", 12, 2, 4);
		
		Habitacion suite2 = new Suite (3000, true, "Benito Antonio José Galdiva", 23, 3, 5, 120, 500);
		
		Habitacion apartamento2 = new Apartamento (1500, true, "Miguelón El de Abajo", 31, 1, 6, 25, true, extraServicioLimpieza);
	}

}
