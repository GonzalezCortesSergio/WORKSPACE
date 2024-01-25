package ejercicio01;

public class Habitacion {
	
	//Atributos
	
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int nDiasOcupada;
	private int nOcupantes;
	private int idHabitacion;
	
	
	//Constructor 
	
	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int nDiasOcupada, int nOcupantes, int idHabitacion) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.nDiasOcupada = nDiasOcupada;
		this.nOcupantes = nOcupantes;
		this.idHabitacion = idHabitacion;
	}


	
	//Getters and Setters
	
	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public int getnDiasOcupada() {
		return nDiasOcupada;
	}


	public void setnDiasOcupada(int nDiasOcupada) {
		this.nDiasOcupada = nDiasOcupada;
	}


	public int getnOcupantes() {
		return nOcupantes;
	}


	public void setnOcupantes(int nOcupantes) {
		this.nOcupantes = nOcupantes;
	}

	public int getIdHabitacion () {
		
		return idHabitacion;
	}
	
	public void setIdHabitacion (int idHabitacion) {
		
		this.idHabitacion = idHabitacion;
	}


	//toString
	
	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", nDiasOcupada=" + nDiasOcupada + ", nOcupantes=" + nOcupantes + ", idHabitacion=" + idHabitacion +"]";
	}
	
	
	//Métodos
	
	public double calcularPrecioFinalHabitacion(double descuento) {
		
		return precioBase * nDiasOcupada;
	}
	
}
