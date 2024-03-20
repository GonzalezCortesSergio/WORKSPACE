package ejemploReserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Reserva {

	
	//Atributos
	
	private List<LocalDate> listaFechas;
	
	//Constructor
	
	public Reserva(List<LocalDate> listaFechas) {
		super();
		this.listaFechas = listaFechas;
	}


	//Getters and Setters
	
	public List<LocalDate> getListaFechas() {
		return listaFechas;
	}


	public void setListaFechas(List<LocalDate> listaFechas) {
		this.listaFechas = listaFechas;
	}
	
	
	//Métodos
	
	public void mostrarTodo () {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for (LocalDate localDate : listaFechas) {
			
			System.out.println(localDate.format(df));
		}
		
	}
	
	public LocalDate hacerReserva (int indice) throws ReservaAyer{
		
		if (LocalDate.now().isAfter(listaFechas.get(indice)))
			throw new ReservaAyer("Ya ha pasao eso chiki");
			
		
		return listaFechas.get(indice);
	}
	
	public void crearReserva (LocalDate fesha) {
		
		listaFechas.add(fesha);
	}
	
	
	
}
