package ejemploList03;

import java.util.List;

public class CRUDPersona {

	//Atributos
	
	private List<Persona> listaPersonas;

	
	//Constructor
	
	public CRUDPersona(List<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}


	
	//Getters and Setters
	
	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}


	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}



	//toString
	
	@Override
	public String toString() {
		return "CRUDPersona [listaPersonas=" + listaPersonas + "]";
	}
	
	//Métodos
	
	public void imprimirLista () {
		
		for (Persona persona : listaPersonas) {
			
			System.out.println(persona);
		}
	}
	
	public void agregarPersona (Persona p) {
		
		listaPersonas.add(p);
		
	}
	
	public boolean agregarPersonaV2 (Persona p) {
		
		return listaPersonas.add(p);
		
	}
	
	
	public Persona buscarPorDni(String dni) {
		
		boolean encontrado = false;
		int i = 0;
		
		while (i < listaPersonas.size() && !encontrado) {
			
			if (listaPersonas.get(i).getDni().equals(dni)) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
		}
		
		if (encontrado) {
			
			return listaPersonas.get(i);
		}
		
		else {
			
			return null;
		}
	}
	
	public Persona buscarPorDniV2(String dni) {
		
		Persona p = null;
		boolean encontrado = false;
		
		for (int i = 0; i < listaPersonas.size() && !encontrado; i++) {
			
			if (listaPersonas.get(i).getDni().equals(dni)) {
				
				p = listaPersonas.get(i);
				
				encontrado = true;
			}
		}
		
		return p;
	}
	
	public void eliminarPersona (Persona p) {
		
		listaPersonas.remove(p);
	}
	
}
