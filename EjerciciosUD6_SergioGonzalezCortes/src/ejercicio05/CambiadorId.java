package ejercicio05;

import java.util.List;

public class CambiadorId {

	private List<Alumno> listaAlumnos;
	
	public CambiadorId (List<Alumno> listaAlumnos) {
		
		this.listaAlumnos = listaAlumnos;
	}
	
	public List<Alumno> getListaAlumnos () {
		
		return listaAlumnos;
	}
	
	public void setListaAlumnos (List<Alumno> listaAlumnos) {
		
		this.listaAlumnos = listaAlumnos;
	}
	
	
	//Método
	
	public Alumno buscarPorId (int id) {
		
		return listaAlumnos.stream()
				.filter(alumno -> alumno.getId() == id)
				.findAny()
				.get();
	}
	
	public void cambiarId (int idNuevo, Alumno a) throws IdRepetido{
		
		for (Alumno alumno : listaAlumnos) {
			
			if (a.getId() == alumno.getId())
				throw new IdRepetido("Este ID lo tiene otro alumno");
		}
		
		a.setId(idNuevo);
	}
}
