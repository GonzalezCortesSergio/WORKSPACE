package ejercicio05;

import java.util.Random;

public class Numerichis {

	
	//Métodos
	
	public int [] listaNumerichis (int hasta, int desde, int tam) throws NumRepetido{
		
		Random r = new Random(System.nanoTime());
		
		int [] listaNum = new int [tam];
		
		for (int i = 0; i < listaNum.length; i++) {
			
			listaNum[i] = r.nextInt(hasta - desde + 1) + desde;
		}
		
		for (int i = 0; i < listaNum.length; i++) {
			
			if (listaNum[i] == listaNum[i+1])
				throw new NumRepetido("Se ha repetido un numerichi");
		}
		
		return listaNum;
	}
}
