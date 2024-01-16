package xmen;

public class AppXmen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tormenta t1 = new Tormenta();
		
		t1.mover();
		t1.saltar();
		t1.volar();
		
		PuedeMoverse t2 = new Tormenta();
		
		t2.mover();
		//t2.saltar();
		//t2.volar();
		
		PuedeSaltar t3 = new Tormenta();
		
		t3.mover();
		t3.saltar();
		//t3.volar;
		
		PuedeVolar t4 = new Tormenta();
		
		t4.mover();
		t4.saltar();
		t4.volar();
		
		CharlesXavier c = new CharlesXavier();
		c.mover();
		
		Lobezno l = new Lobezno();
		
		l.mover();
		l.saltar();
	}

}
