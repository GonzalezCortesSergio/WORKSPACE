package ejercicio02;

public class Hotel {

	//Atributos
	
	private Habitacion [] listaHabitaciones;
	private int numHabitaciones;
	
	//Constructor
	
	public Hotel(Habitacion[] listaHabitacion, int numHabitaciones) {
		
		this.listaHabitaciones = listaHabitacion;
		this.numHabitaciones = numHabitaciones;
	}

	
	//Getters and Setters
	
	public Habitacion[] getListaHabitacion() {
		return listaHabitaciones;
	}

	public void setListaHabitacion(Habitacion[] listaHabitacion) {
		this.listaHabitaciones = listaHabitacion;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	
	
	//Métodos 
	
	public void agregarHabitacion (Habitacion h) {
		
		listaHabitaciones [numHabitaciones] = h;
		
		numHabitaciones++;
	} 
	
	public boolean comprobarLimpia (int opcionLimpia) {
		
		if (opcionLimpia == 1) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}
	
	public boolean comprobarOcupada (int opcionOcupada) {
		
		if (opcionOcupada == 1) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
	}
	
	public Habitacion findByNCliente (String nCliente) {
		
		int i = 0;
		boolean encontrado = false;
		/*Mientras no hayamos llegado al final o encontrado lo que buscamos
		 * , sigue el bucle.
		 * Al encontrarlo, el bucle para.*/
		
		while (i < numHabitaciones && !encontrado) {
			
			Habitacion deLista = listaHabitaciones[i];
			
			if (deLista.getnCliente().equals(nCliente)) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
		}
		
		if (encontrado) {
			
			return listaHabitaciones[i]; //Se devuelve la habitacion que se ha buscado 
		
		}
		
		else {
			
			return null; //No se ha encontrado nada, por lo que no se puede devolver nada (null)
		}
	}
	
	public void findByOcupado () {
		
		int i = 0;
		
		
		while (i < numHabitaciones ) {
			
			Habitacion deLista = listaHabitaciones [i];
			
			if (!deLista.isOcupada()) {
				
				System.out.println(listaHabitaciones[i].toString());
				System.out.println();
				i++;
			}
			
			else {
				
				i++;
			}
		}
		
	
		
		
		
	}
	
	public double calcularPrecioFinal (double precioAdicional, String nCliente) {
		
		return (findByNCliente(nCliente).getPrecio()*findByNCliente(nCliente).getnDias())+precioAdicional;
	}
	
	
	
}
