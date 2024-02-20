package ejercicio05Polimorfismo;

public class CreadorVendedor implements ICrearEmpleado{

	@Override
	public Empleado crearEmpleado(String nombre, String apellidos, double sueldoBase, double impuestos,
			double cantVentas, double incentivo) {
		// TODO Auto-generated method stub
		return new Vendedor (nombre, apellidos, sueldoBase, cantVentas, incentivo);
	}

}
