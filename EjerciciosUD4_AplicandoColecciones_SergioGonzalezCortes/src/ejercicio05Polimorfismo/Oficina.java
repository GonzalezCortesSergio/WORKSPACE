package ejercicio05Polimorfismo;

public class Oficina {

	
	//Atributos
	
	private CRUDEmpleado ce;

	
	//Constructor
	
	public Oficina(CRUDEmpleado ce) {
		super();
		this.ce = ce;
	}


	//Getters and Setters
	
	public CRUDEmpleado getCe() {
		return ce;
	}


	public void setCe(CRUDEmpleado ce) {
		this.ce = ce;
	}
	
	
	//Métodos
	
	public double calcularSueldoEmpleado (Empleado e) {
		
		return e.calcularSueldo();
	}
	
	
	
}
