package ejercicio06;

import java.util.Comparator;

public class ComparadorSueldoTrabajador implements Comparator<Trabajador>{

	private double sueldoHoras;
	
	public ComparadorSueldoTrabajador (double sueldoHoras) {
		
		this.sueldoHoras = sueldoHoras;
	}
	
	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		
		
		if (t1.calcularSueldo(sueldoHoras) < t2.calcularSueldo(sueldoHoras)) {
			
			return -1;
		}
		
		else {
			
			if (t1.calcularSueldo(sueldoHoras) > t2.calcularSueldo(sueldoHoras)) {
				
				return 1;
			}
			
			return 0;
		}
	}

}
