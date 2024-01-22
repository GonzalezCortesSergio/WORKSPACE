package ejercicio05;

public class Oficina {

	//Atributos
	
	private Empleado [] listaEmpleados;
	private int numEmpleados;
	
	
	//Constructor
	
	public Oficina(Empleado[] listaEmpleados, int numEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
		this.numEmpleados = numEmpleados;
	}


	//Getters and Setters
	
	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}


	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}


	public int getNumEmpleados() {
		return numEmpleados;
	}


	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	
	
	//Métodos
	
	public void mostrarEmpleados (double objetivoVentas) {
		
		for (int i = 0; i < numEmpleados; i++) {
			
			System.out.println(listaEmpleados[i] + "Sueldo: " + calcularSueldoEmpleado(listaEmpleados[i]));
			
			if (listaEmpleados[i] instanceof Vendedor)
				((Vendedor)listaEmpleados[i]).felicitarVenta(objetivoVentas);
		}
	}
	
	public double calcularSueldoEmpleado(Empleado e) {
		
		return e.calcularSueldo();
	}
	
	public double calcularTotalSueldos() {
		
		double suma = 0;
		
		for (int i = 0; i < numEmpleados; i++) {
			
			suma+= calcularSueldoEmpleado(listaEmpleados[i]);
		}
		
		return suma;
	}
}
