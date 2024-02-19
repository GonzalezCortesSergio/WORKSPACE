package ejercicio04Polimorfismo;

public interface IFactoriaProductos {

	Producto crearProducto (double precioUnitario, String nombre, boolean aCaducar, boolean tieneGarantia);
}
