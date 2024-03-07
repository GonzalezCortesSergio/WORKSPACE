package ejemploFechas;

import java.time.LocalDate;

public class Principal {

	
	public static void main (String [] args) {
		
		LocalDate hoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(2025, 8, 19);
		LocalDate fechaReserva = LocalDate.parse("2005-11-12");

		System.out.println(hoy);		
		System.out.println(fechaNacimiento);
		System.out.println(fechaReserva);
	}
	
	
}
