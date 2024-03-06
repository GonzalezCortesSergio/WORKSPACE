package ejercicio;

import java.util.Comparator;

public class ComparaPorPuntuacion implements Comparator<Carta>{

	@Override
	public int compare(Carta c1, Carta c2) {
		// TODO Auto-generated method stub
		return Integer.compare(c1.obtenerPuntuacion(), c2.obtenerPuntuacion());
	}

}
