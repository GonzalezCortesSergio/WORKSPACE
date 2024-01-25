package ejercicio01;

public class Apartamento extends Habitacion{

	//Atributos
	
	private double mCuadrados;
	private boolean servicioLimpieza;
	private double extraServicioLimpieza;
	
	
	//Constructor
	
	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int nDiasOcupada, int nOcupantes,
			int idHabitacion, double mCuadrados, boolean servicioLimpieza, double extraServicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, nDiasOcupada, nOcupantes, idHabitacion);
		this.mCuadrados = mCuadrados;
		this.servicioLimpieza = servicioLimpieza;
		this.extraServicioLimpieza = extraServicioLimpieza;
	}


	//Getters and Setters
	
	public double getmCuadrados() {
		return mCuadrados;
	}


	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}


	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}


	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}


	public double getExtraServicioLimpieza() {
		return extraServicioLimpieza;
	}


	public void setExtraServicioLimpieza(double extraServicioLimpieza) {
		this.extraServicioLimpieza = extraServicioLimpieza;
	}


	//toString
	
	@Override
	public String toString() {
		return "Apartamento [mCuadrados=" + mCuadrados + ", servicioLimpieza=" + servicioLimpieza
				+ ", extraServicioLimpieza=" + extraServicioLimpieza + "]";
	}
	
	
	//Métodos
	
	@Override 
	public double calcularPrecioFinalHabitacion (double descuento) {
		
		if (servicioLimpieza)
			return super.calcularPrecioFinalHabitacion(descuento) + extraServicioLimpieza;
		
		else
			return super.calcularPrecioFinalHabitacion(descuento);
	}
	
}
