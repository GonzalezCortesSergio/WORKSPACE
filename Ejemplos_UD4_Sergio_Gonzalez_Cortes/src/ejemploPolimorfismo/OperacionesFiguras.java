package ejemploPolimorfismo;

public class OperacionesFiguras {

	//Métodos
	
	public double calcularAreaUnaFigura (Figura f) {
		
		return f.calcularArea();
	}
	
	public double sumarAreas (Figura [] listaFiguras) {
		
		double resultado = 0;
		
		for (int i = 0; i < listaFiguras.length; i++) {
			
			/*
			*	Se podría hacer con el método calcularArea() del objeto
			*	pero sería incorrecto; lo que cumple más con la lógica del
			*	polimorfismo es usar este método
			*/
			
			resultado +=calcularAreaUnaFigura(listaFiguras[i]);
		}
		
		return resultado;
	}
	
	public double sumarAreasConAviso (Figura[] listado) {
		
		double resultado = 0;
		
		for (int i = 0; i < listado.length; i++) {
			resultado += calcularAreaUnaFigura(listado[i]);
			
			if (listado[i] instanceof Circulo) {
				
				
				//Circulo c = (Circulo) listado[i];
				//c.mostrarRadianes();
				
				((Circulo)listado[i]).mostrarRadianes();
			}
		}
		
		return resultado;
	}
}
