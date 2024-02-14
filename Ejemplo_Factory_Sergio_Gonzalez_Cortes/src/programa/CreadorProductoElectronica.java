package programa;

public class CreadorProductoElectronica implements ICrearProducto{

	@Override
	public Producto crearProducto(String nombre, double precioBase, boolean aPuntoDeCad) {
		// TODO Auto-generated method stub
		return new Electronica (nombre, precioBase);
	}
	


}
