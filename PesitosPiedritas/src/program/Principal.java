package program;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (TipoPiedra tp: TipoPiedra.values()) {
			
			System.out.println(tp.toString() + " el palet pesa " + (2.27f*tp.getPeso()) + "kg");
		}
	}

}
