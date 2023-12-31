package ejercicio;

public class Inmobiliaria {

	
	//Atributos
	
	private Piso [] listaPisos;
	private int numPisos;
	private int numTrabajadores;
	
	
	//Constructor
	
	public Inmobiliaria(Piso[] listaPisos, int numPisos, int numTrabajadores) {
	
		this.listaPisos = listaPisos;
		this.numPisos = numPisos;
		this.numTrabajadores = numTrabajadores;
	}
	
	
	//Getters and Setters
	
	public Piso[] getListaPisos() {
		return listaPisos;
	}


	public void setListaPisos(Piso[] listaPisos) {
		this.listaPisos = listaPisos;
	}


	public int getNumPisos() {
		return numPisos;
	}


	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}


	public int getNumTrabajadores() {
		return numTrabajadores;
	}


	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	
	
	//Métodos

	public void agregar (Piso p) {
		
		listaPisos [numPisos] = p;
		
		numPisos++;
	}
	
	public Piso [] buscarPisosNuevos () {
		
		int i = 0;
		
		Piso [] listaNuevos = new Piso [numPisos];
		while (i < numPisos) {
			
			if (listaPisos[i].getEstado() == 1) {
				
				listaNuevos[i] = listaPisos[i];
			}
			i++;
		}
		
		return listaNuevos;
	}
	
	public Piso buscarPorId (int id) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < numPisos && !encontrado) {
			
			Piso deLista = listaPisos[i];
			
			if (deLista.getId() == id) {
				
				encontrado = true;
			}
			
			else {
				i++;
			}
		}
		
		if (encontrado) {
			
			return listaPisos[i];
		}
		
		else {
			
			return null;
		}
	}
	
	public void mostrarPisos () {
		
		for (int i = 0; i < numPisos; i++) {
			
			System.out.println(listaPisos[i]);
			System.out.println();
		}
	}
	
	public void mostrarPisosNuevos (Piso [] listaNuevos) {
		
		for (int i = 0; i < listaNuevos.length; i++) {
			
			if (listaNuevos[i] != null) {
				
				System.out.println(listaNuevos[i]);
			}
		}
	}
	
	public double calcularPrecioFinal (double ganancia, int id) {
		
		int cien = 100;
		return buscarPorId(id).getPrecioVenta() + (buscarPorId(id).getPrecioVenta()*ganancia / cien) ;
	}
	
	public double calcularPrecioMetroCuadrado (double ganancia, int id) {
		
		return calcularPrecioFinal(ganancia, id) / buscarPorId(id).getMetrosCuadrados();
	}
	
	public void cambiarPrecioVenta (double precio, int id) {
		
		buscarPorId(id).setPrecioVenta(precio);
	}
	
	public double sumaTotalPrecioSeminuevo (double ganancia) {
		
		double sumaPrecios = 0;
		
		for (int i = 0; i < numPisos; i++) {
			
			sumaPrecios+= listaPisos[i].getPrecioVenta() + (listaPisos[i].getPrecioVenta()*ganancia / 100);
		}
		
		return sumaPrecios;
	}
	
	public double calcularGananciaVendedores (double gananciaNuevo, double gananciaSeminuevo) {
		
		double sumaPrecios = 0;
		
		for (int i = 0; i < numPisos; i++) {
			
			if (listaPisos[i].getEstado() == 1) {
				
				sumaPrecios+= listaPisos[i].getPrecioVenta() + (listaPisos[i].getPrecioVenta()*gananciaNuevo / 100);
			}
			
			if (listaPisos[i].getEstado() == 2) {
				
				sumaPrecios+= listaPisos[i].getPrecioVenta() + (listaPisos[i].getPrecioVenta()*gananciaSeminuevo / 100);

			}
		}
		
		return sumaPrecios / numTrabajadores;
	}
	
}
