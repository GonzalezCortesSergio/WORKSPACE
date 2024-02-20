package ejercicio05Polimorfismo;

public class CreadorGerente implements ICrearEmpleado{

	@Override
	public Empleado crearEmpleado(String nombre, String apellidos, double sueldoBase, double impuestos,
			double cantVentas, double incentivo) {
		// TODO Auto-generated method stub
		return new Gerente (nombre, apellidos, sueldoBase, impuestos);
	}

}
