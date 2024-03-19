package ejemploReserva;

import java.time.LocalDate;
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
		
		listaFechas.stream()
		.forEach(System.out::println);
		
	}
	
	public LocalDate hacerReserva (int indice) throws ReservaAyer{
		
		if (LocalDate.now().isAfter(listaFechas.get(indice)))
			throw new ReservaAyer("Ya ha pasao eso chiki");
			
		
		return listaFechas.get(indice-1);
	}
	
	
	
}
