package ejercicio04Polimorfismo;

public class CreadorAlimentacion implements IFactoriaProductos{

	//Métodos
	
	@Override
	public Producto crearProducto(double precioUnitario, String nombre, boolean aCaducar, boolean tieneGarantia) {
		// TODO Auto-generated method stub
		return new Alimentacion (precioUnitario, nombre, aCaducar);
	}

	
	
}
