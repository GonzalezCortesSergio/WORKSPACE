package herencia;

public class NubeGoku extends Vehiculo
	implements PuedeVolar{

	@Override
	public void volar() {

		System.out.println("Volando en la nube de Goku; desde luego que Krilin muere");
	}

}
