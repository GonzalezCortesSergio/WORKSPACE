package ejercicio04Polimorfismo;

public class CreadorElectronica implements IFactoriaProductos{

	//Métodos
	
	@Override
	public Producto crearProducto(double precioUnitario, String nombre, boolean aCaducar, boolean tieneGarantia) {
		// TODO Auto-generated method stub
		return new Electronica (precioUnitario, nombre, tieneGarantia);
	}

}
