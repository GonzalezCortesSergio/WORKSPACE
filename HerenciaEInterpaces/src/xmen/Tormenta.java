package xmen;

public class Tormenta implements PuedeVolar{

	@Override
	public void saltar() {

		System.out.println("Jaja salto");
	}

	@Override
	public void mover() {
		System.out.println("Estoy moviéndome");
	}

	@Override
	public void volar() {

		System.out.println("Illo que vuelo tú");
	}

}
