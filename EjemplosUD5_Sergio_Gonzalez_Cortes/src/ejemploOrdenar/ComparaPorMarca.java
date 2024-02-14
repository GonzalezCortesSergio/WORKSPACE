package ejemploOrdenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator <Corredor>{

	@Override
	public int compare(Corredor c1, Corredor c2) {
		// TODO Auto-generated method stub
		
		if (c1.getMarca() < c2.getMarca()) {
			
			return -1;
		}
		
		else {
			
			if (c1.getMarca() > c2.getMarca()) {
				
				return 1;
			}
			return 0;
		}
	
	}

	
	
}
