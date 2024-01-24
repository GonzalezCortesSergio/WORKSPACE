package ejercicio03;

import java.util.Random;

public class ArrayReales implements IEstadisticas{

	//Atributos
	
	private double [] num;

	
	//Constructor
	
	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}


	//Getters and Setters
	
	public double[] getNum() {
		return num;
	}


	public void setNum(double[] num) {
		this.num = num;
	}
	
	//Métodos
	
	public void implementarNumeros (double desde, double hasta) {
		
		Random r = new Random(System.nanoTime());
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = r.nextDouble(hasta - desde + 1) + desde;
		}
	}
	
	public void verNumeros () {
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}


	@Override
	public double calcularMinimo() {
		//Tomamos en cuenta que el número mínimo no puede ser 0
		double minimo = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (minimo == 0) {
				minimo = num[i];
			}
			else if(minimo > num[i]){
				minimo = num[i];
			}
		}
		return minimo;
	}


	@Override
	public double calcularMaximo() {
		double maximo = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (maximo == 0) {
				maximo = num[i];
			}
			else if (maximo < num[i]) {
				
				maximo = num[i];
			}
		}
		return maximo;
	}


	@Override
	public double calcularSumatorio() {
		double suma = 0;
		
		for (int i = 0; i < num.length; i++) {
			suma+= num[i];
		}
		return suma;
	}
}
