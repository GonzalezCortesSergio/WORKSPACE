package ejemploHerencia;



public class Principal {

	public static void main(String[] args) {
		
		
		//Variables
		
		double fijo = 1000;
	
		Trabajador t = new Trabajador("Pepejuan", "Programador junior", "1A");
		
		Empleado e = new Empleado ("Filomeno", "Frontend", "2A", 12000.2, 15.0);
		
		Empleado e2 = new Empleado ("3C", 1500.0, 12.5);
		
		Consultor c = new Consultor ("Eduardo", "Paganini", "84F", 12, 8.5);
		
		System.out.println(t.calcularPaga());
		
		System.out.println(e.calcularPaga());
		
		System.out.println(e2.calcularPaga());
		
		System.out.println(c.calcularPaga());
		
		System.out.println("***********************************************");
		System.out.println(t.calcularPagaV2(fijo));
		System.out.println(e.calcularPagaV2(fijo));
		System.out.println(e2.calcularPagaV2(fijo));
		System.out.println(c.calcularPagaV2(fijo));
		System.out.println("***********************************************");
		
		c.avisarExtras();
		System.out.println("***********************************************");
		t.darDeBaja();
		System.out.println(t);
		e.darDeBaja();
		System.out.println(e);
		System.out.println("***********************************************");
		
		
	}

}
