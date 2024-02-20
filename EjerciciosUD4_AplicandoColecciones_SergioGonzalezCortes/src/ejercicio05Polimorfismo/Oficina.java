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
	
	public double calcularTotalSueldos () {
		
		double sumaSueldos = 0;
		
		for (int i = 0; i < ce.getListaEmpleados().size(); i++) {
			
			sumaSueldos+= calcularSueldoEmpleado(ce.getListaEmpleados().get(i));
		}
		
		return sumaSueldos;
	}
	
	
	
}
