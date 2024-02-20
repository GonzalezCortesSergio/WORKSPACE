package ejercicio05Polimorfismo;

import java.util.List;

public class CRUDEmpleado {

	
	//Atributos
	
	private List<Empleado> listaEmpleados;

	
	//Constructor
	
	public CRUDEmpleado(List<Empleado> listaEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
	}

	
	//Getters and Setters

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}


	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
	//Métodos
	
	public void agregarEmpleado (Empleado e) {
		
		listaEmpleados.add(e);
	}
	
	public void listarEmpleados () {
		
		for (Empleado empleado : listaEmpleados) {
			
			System.out.println(empleado);
		}
	}
	
	public Empleado buscarPorID (int nEmpleado) {
		
		for (Empleado empleado : listaEmpleados) {
			
			if (empleado.getnEmpleado() == nEmpleado) {
				
				return empleado;
			}
		}
		
		return null;
	}
	
	public void cambiarSueldoBase (Empleado e, double sueldoNuevo) {
		
		e.setSueldoBase(sueldoNuevo);
		
		
	}
	
	public void borrarEmpleado (Empleado e) {
		
		listaEmpleados.remove(e);
	}
	
}
