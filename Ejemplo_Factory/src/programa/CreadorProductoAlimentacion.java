package programa;

public class CreadorProductoAlimentacion implements ICrearProducto{

	@Override
	public Producto crearProducto(String nombre, double precioBase, boolean aPuntoDeCad) {
		// TODO Auto-generated method stub
		return new Alimentacion (nombre, precioBase, aPuntoDeCad);
	}

}
