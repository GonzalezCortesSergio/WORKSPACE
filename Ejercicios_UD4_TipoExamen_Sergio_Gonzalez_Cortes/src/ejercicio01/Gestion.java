package ejercicio01;

public class Gestion {

	//Atributos
	
	private Habitacion [] listaHabitaciones;
	
	
	//Constructor
	
	public Gestion (Habitacion [] listaHabitaciones) {
		
		this.listaHabitaciones = listaHabitaciones;
	}
	
	//Getters and Setters
	
	public Habitacion [] getListaHabitaciones () {
		
		return listaHabitaciones;
	}
	
	public void setListaHabitaciones (Habitacion [] listaHabitaciones) {
		
		this.listaHabitaciones = listaHabitaciones;
	}
	
	
	//Métodos
	
	public void verHabitaciones () {
		
		for (int i = 0; i < listaHabitaciones.length; i++) {
			
			if (listaHabitaciones[i] != null)
				System.out.println(listaHabitaciones[i]);
		}
	}
	
	public void verHabitacionesLibres(Habitacion [] listaNoOcupadas) {
		
		for (int i = 0; i < listaNoOcupadas.length; i++) {
			if (listaNoOcupadas[i] != null)
				System.out.println(listaNoOcupadas[i]);
		}
	}
	
	public void verHabitacionesOcupadas(Habitacion [] listaOcupadas) {
		
		for (int i = 0; i < listaOcupadas.length; i++) {
			if (listaOcupadas[i] != null)
				System.out.println(listaOcupadas[i]);
		}
	}
	
	public Habitacion buscarPorId (int id) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < listaHabitaciones.length && !encontrado && listaHabitaciones[i] != null) {
			
			if (listaHabitaciones[i].getIdHabitacion() == id)
				encontrado = true;
			
			else 
				i++;	
			
		}
		
		if (encontrado)
			return listaHabitaciones[i];
		
		else
			return null;
	}
	
	public Habitacion [] buscarNoOcupadas () {
		
		Habitacion [] listaNoOcupadas = new Habitacion[listaHabitaciones.length];
		
		for (int i = 0; i < listaHabitaciones.length; i++) {
			if (listaHabitaciones[i] != null && !listaHabitaciones[i].isOcupada()) {
				
				listaNoOcupadas[i] = listaHabitaciones[i];
			}
		}
		
		return listaNoOcupadas;
	}
	
	public Habitacion [] buscarOcupadas () {
		
		Habitacion [] listaOcupadas = new Habitacion [listaHabitaciones.length];
		
		for (int i = 0; i < listaOcupadas.length; i++) {
			if (listaHabitaciones[i] != null && listaHabitaciones[i].isOcupada()) {
				
				listaOcupadas[i] = listaHabitaciones[i];
			}
		}
		
		return listaOcupadas;
	}
	
	public double calcularPrecioAPagar (Habitacion h, double descuento) {
		
		return h.calcularPrecioFinalHabitacion(descuento);
	}
	
	public double calcularTotalRecaudado (Habitacion [] listaOcupadas, double descuento) {
		
		double suma = 0;
		
		for (int i = 0; i < listaOcupadas.length; i++) {
			if (listaOcupadas[i] != null) {
				suma+= calcularPrecioAPagar(listaOcupadas[i], descuento);
			}
		}
		
		return suma;
	}
	
	public void mostrarFactura (Habitacion h, double descuento) {
		
		System.out.printf("%s\t\nTOTAL A PAGAR %.2f\n", h, calcularPrecioAPagar(h, descuento));
	}
	
	public void venderHabitacion (Habitacion h) {
		
		h.setOcupada(true);
		
	}
}
