package ejercicio06;

import java.util.Arrays;

public class Oficina {

	
	//Atributos
	
	private CCuenta [] listaCuentas;
	private int numCuentas;
	
	//Constructor
	
	public Oficina(CCuenta[] listaCuentas, int numCuentas) {
		super();
		this.listaCuentas = listaCuentas;
		this.numCuentas = numCuentas;
	}

	
	//Getters and Setters
	
	public CCuenta[] getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(CCuenta[] listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	public int getNumCuentas() {
		return numCuentas;
	}

	public void setNumCuentas(int numCuentas) {
		this.numCuentas = numCuentas;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + Arrays.toString(listaCuentas) + ", numCuentas=" + numCuentas + "]";
	}
	
	
	
}
