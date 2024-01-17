package ejercicio04;

import java.util.Arrays;

public class Venta {

	//Atributos
	
	private LineaVenta[] listaVentas;
	private int numVentas;
	
	
	//Constructor
	
	public Venta(LineaVenta[] listaVentas, int numVentas) {
		super();
		this.listaVentas = listaVentas;
		this.numVentas = numVentas;
	}

	//Getters and Setters
	
	public LineaVenta[] getListaVentas() {
		return listaVentas;
	}



	public void setListaVentas(LineaVenta[] listaVentas) {
		this.listaVentas = listaVentas;
	}



	public int getNumVentas() {
		return numVentas;
	}



	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	
	//toString

	@Override
	public String toString() {
		return "Venta [listaVentas=" + Arrays.toString(listaVentas) + ", numVentas=" + numVentas + "]";
	}
	
	//Métodos

	public void mostrarVenta(int diaActual, int mesActual, int anioActual, double porcentajeAl, double porcentajeEl){
		
		for (int i = 0; i < numVentas; i++) {
			
			System.out.println(listaVentas[i].getP() + "\t" + "Cantidad: " +listaVentas[i].getCantidad() + "\t" + "Precio: " +listaVentas[i].realizarVenta(diaActual, mesActual, anioActual, porcentajeAl, porcentajeEl));
		}
	}
}
