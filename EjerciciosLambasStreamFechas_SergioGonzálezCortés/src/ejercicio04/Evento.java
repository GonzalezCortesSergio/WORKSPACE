package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {

	//Atributos
	
	private String nombre;
	private LocalDate fechaEvento;
	private LocalTime horaEvento;
	
	//Constructor
	
	public Evento(String nombre, LocalDate fechaEvento, LocalTime horaEvento) {
		super();
		this.nombre = nombre;
		this.fechaEvento = fechaEvento;
		this.horaEvento = horaEvento;
	}

	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public LocalTime getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(LocalTime horaEvento) {
		this.horaEvento = horaEvento;
	}

	//Métodos
	
	

	//toString
	
	@Override
	public String toString() {
		return "Evento [Nombre del evento= " + nombre + ", Fecha del evento= " + fechaEvento + ", Hora del evento= " + horaEvento + "]";
	}
	
	
}
