package ejercicio05;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona>{

	
	
	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		
		if (o1.getEdad() < o2.getEdad()) {
			
			return -1;
		}
		
		else {
			
			if (o1.getEdad() > o2.getEdad()) {
				
				return 1;
			}
			
			return 0;

		}
	}

}
