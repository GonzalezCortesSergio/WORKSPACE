package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio = 2.45, sueldo = 1200;
		int iva = 25;
		
		Producto p = new Producto ("Lentejas", 1);
		Trabajador t = new Trabajador ("Manolo", 20.0);
		
		System.out.printf("Precio con iva de %s: %.2f\n", p.getNombre(), p.calculoIva(precio, iva));
		
		System.out.printf("Sueldo trabajador %s: %.2f\n", t.getNombre(), t.calculoIrpf(sueldo));
		
	}

}
