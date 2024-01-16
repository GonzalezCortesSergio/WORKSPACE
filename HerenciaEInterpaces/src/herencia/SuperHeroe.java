package herencia;

public class SuperHeroe extends Personaje
	implements PuedeVolar{

	@Override
	public void volar() {

		System.out.println("¡¡¡¡¡Volando, voy volando, siempre arribaaaa!!!!!");
	}

}
