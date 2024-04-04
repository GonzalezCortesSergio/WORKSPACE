package ejercicio;

import java.util.regex.Pattern;

public class Caja {

	
	//Atributos
	
	private double totalRecaudado;
	
	//Constructor
	
	public Caja (double totalRecaudado) {
		
		this.totalRecaudado = totalRecaudado;
	}


	//Getters and Setters
	
	public double getTotalRecaudado() {
		return totalRecaudado;
	}


	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}
	
	
	
	
	//Métodos

	public void activarCaja (String codigo) throws CodigoIncorrecto{
		
		String regex = "[a-zA-Z][0-9]{4}";
		
		if (!codigo.matches(regex))
			throw new CodigoIncorrecto("El código debe empezar por una letra inicial, seguida de 4 números");
		
		System.out.println("Se ha activado la caja correctamente");
	}
	
	public void comprobarDinero (double dineroCaja) throws RecaudadoIncorrecto{
		
		if (dineroCaja != totalRecaudado)
			throw new RecaudadoIncorrecto("El dinero introducido no coincide con el registrado");
		
		System.out.printf("Se han recaudado %.2f€\n", totalRecaudado);
	}
	
	public void pedirNumOperaciones (int numOperaciones) throws NumeroNegativo {
		
		if (numOperaciones < 0)
			throw new NumeroNegativo("El número de operaciones no puede ser negativo");
		
		System.out.println("Se han realizado " + numOperaciones + " operaciones");
	}
}
