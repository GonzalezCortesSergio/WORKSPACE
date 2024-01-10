package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Portatil p = new Portatil (224.35, 5.35, 850, "ASUS", true, 40.0);
		SobreMesa s = new SobreMesa (1000, 10, 2000, "Raizen", 125.0);
		
		System.out.println("PVP portatil con seguro " + p.calcularPrecioVenta(15) + "€");
		System.out.println("PVP sobremesa con montaje " + s.calcularPrecioVenta(15) + "€");
	}

}
