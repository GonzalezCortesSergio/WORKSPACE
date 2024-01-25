package ejercicio01;

public class Suite extends Habitacion{

	//Atributos
	
	private double mCuadrados;
	private double gastadoServicioHabitaciones;
	
	
	//Constructor
	
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int nDiasOcupada, int nOcupantes,
			int idHabitacion, double mCuadrados, double gastadoServicioHabitaciones) {
		super(precioBase, ocupada, nombreCliente, nDiasOcupada, nOcupantes, idHabitacion);
		this.mCuadrados = mCuadrados;
		this.gastadoServicioHabitaciones = gastadoServicioHabitaciones;
	}


	//Getters and Setters
	
	public double getmCuadrados() {
		return mCuadrados;
	}


	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}


	public double getGastadoServicioHabitaciones() {
		return gastadoServicioHabitaciones;
	}


	public void setGastadoServicioHabitaciones(double gastadoServicioHabitaciones) {
		this.gastadoServicioHabitaciones = gastadoServicioHabitaciones;
	}



	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Suite [mCuadrados=" + mCuadrados + ", gastadoServicioHabitaciones=" + gastadoServicioHabitaciones
				+ "]";
	}
	
	
	//Métodos
	
	@Override
	public double calcularPrecioFinalHabitacion(double descuento) {
		
		double cien = 100;
		
		return super.calcularPrecioFinalHabitacion(descuento) + gastadoServicioHabitaciones - (super.calcularPrecioFinalHabitacion(descuento) * descuento / cien);
	}
	
}
