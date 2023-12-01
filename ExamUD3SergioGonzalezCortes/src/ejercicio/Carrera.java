package ejercicio;

import java.util.Arrays;

public class Carrera {

	
	//Atributos
	
	private Corredor [] listaCorredores;
	private int numCorredores;
	private double km;
	
	
	//Constructor
	
	public Carrera(Corredor[] listaCorredores, int numCorredores, double km) {
		
		this.listaCorredores = listaCorredores;
		this.numCorredores = numCorredores;
		this.km = km;
	}


	//Getters and Setters
	
	public Corredor[] getListaCorredores() {
		return listaCorredores;
	}


	public void setListaCorredores(Corredor[] listaCorredores) {
		this.listaCorredores = listaCorredores;
	}


	public int getNumCorredores() {
		return numCorredores;
	}


	public void setNumCorredores(int numCorredores) {
		this.numCorredores = numCorredores;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	
	//toString
	
	@Override
	public String toString() {
		return "Carrera [listaCorredores=" + Arrays.toString(listaCorredores) + ", numCorredores=" + numCorredores
				+ ", km=" + km + "]";
	}
	
	
	//Métodos
	
	
	public void agregarCorredor (Corredor c) {
		
		listaCorredores [numCorredores] = c;
		
		numCorredores++;
	}
	
	public Corredor buscarPorDorsal (int dorsal) {
		
		int i = 0;
		boolean encontrado = false;
				
				while (i < numCorredores && !encontrado) {
					
					Corredor deLista = listaCorredores[i];
					
					if (deLista.getDorsal() == dorsal) {
						
						encontrado = true;
					}
					
					else {
						
						i++;
					}
				}
		
		if (encontrado) {
			
			return listaCorredores[i];
		}
		
		else {
			return null;
		}
	}
	
	public double calcularTiempoEnSegundos (double segundos, int dorsal) {
		
		return buscarPorDorsal(dorsal).getTiempo()*segundos;
		
	}
	
	public void mostrarCVeterano () {
		
		for (int i = 0; i < numCorredores; i++) {
			
			if (listaCorredores[i].getCategoria() == 3) {
				
				System.out.println(listaCorredores[i]);
			}
		}
	}
	
	public void cambiarTiempo (int dorsal, double tiempo) {
		
		buscarPorDorsal(dorsal).setTiempo(tiempo);
		
		System.out.printf("Ahora tiene un tiempo de %.2f minutos\n", buscarPorDorsal(dorsal).getTiempo());
	}
	
	public Corredor buscarPorMenorTiempo () {
		
		int i = 0;
		Corredor deLista = null;
		while (i < numCorredores) {
			
			deLista = listaCorredores [i];
			i++;
			
			if (deLista.getTiempo() < listaCorredores[i-1].getTiempo()) {
				
				deLista = listaCorredores[i];
			}
			
			else  {
				
				deLista = listaCorredores[i-1];
			}
			
			
		}
		
		return deLista;
		
		
	}
	
	
	public double calcularMediaKmMinuto () {
		
		return buscarPorMenorTiempo().getTiempo()/km;
	}
	
	public double sumarTotalTiempoJuvenil () {
		
		double suma = 0;
		
		for (int i = 0; i < numCorredores; i++) {
			
			if (listaCorredores[i].getCategoria() == 1) {
				
				suma+= listaCorredores[i].getTiempo();
			}
		}
		
		return suma;
	}
	
	public void mostrarTodosCorredores () {
		
		for (int i = 0; i < numCorredores; i++) {
			
			System.out.println(listaCorredores[i]);
		}
	}
	
	
	
	
	
	
}
