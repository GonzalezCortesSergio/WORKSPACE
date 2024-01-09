package ejemploHerencia;

public class Consultor extends Trabajador{

	//Atributos
	
	private int horas;
	private double tarifa;
	
	//Constructor
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	
	//Getters and Setters
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	//Esto saecho un dia 
	
	public double calcularPaga () {
		
		return tarifa * horas;
	}
	
	//Esto saecho otro y es mierda de la buena así que flipalo
	
	public double calcularPagaV2() {
		
		return super.calcularPagaV2() + tarifa*horas;
		/*Si el método de la clase madre tiene un parámetro; las clases hijas
		 deberán tener los mismos parámetros aunque no los usen; ya que deben tener la misma firma.*/
	}
	
	public void avisarExtras() {
		
		if (horas > 40) {
			
			System.out.println("Cushame shava' que ta pasao de lo permitío");
		}
	}

	
}
