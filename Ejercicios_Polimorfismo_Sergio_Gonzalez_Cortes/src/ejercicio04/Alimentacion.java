package ejercicio04;

public class Alimentacion extends Producto{

	//Atributos
	
	private int diaCad;
	private int mesCad;
	private int anioCad;
	
	//Constructor
	public Alimentacion(String nombre, double precioUnitario, int id, int diaCad
			, int mesCad, int anioCad) {
		super(nombre, precioUnitario, id);
		
		this.diaCad = diaCad;
		this.mesCad = mesCad;
		this.anioCad = anioCad;
	}

	
	//Getters and Setters
	
	public int getDiaCad() {
		return diaCad;
	}

	public void setDiaCad(int diaCad) {
		this.diaCad = diaCad;
	}

	public int getMesCad() {
		return mesCad;
	}

	public void setMesCad(int mesCad) {
		this.mesCad = mesCad;
	}

	public int getAnioCad() {
		return anioCad;
	}

	public void setAnioCad(int anioCad) {
		this.anioCad = anioCad;
	}


	//toString
	
	@Override
	public String toString() {
		return super.toString() + " Alimentacion [diaCad=" + diaCad + ", mesCad=" + mesCad + ", anioCad=" + anioCad + "]";
	}
	
	
	//Métodos
	
	@Override
	public double calcularPrecio(int diaActual, int mesActual, int anioActual, double porcentajeAl, double porcentajeEl) {
		if (diaActual >= (diaCad - 2) && mesActual == mesCad && anioActual == anioCad) {
			
			return super.getPrecioUnitario() - (super.getPrecioUnitario() * porcentajeAl / 100);
		}
		
		else {
			
			return super.getPrecioUnitario();
		}
	}
	
	public void avisarCaducidad() {
		
		System.out.println("Cuidado, que el producto de alimentacion "+ super.getNombre() +" va a caducar pronto");
	}
}
