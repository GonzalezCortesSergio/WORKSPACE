package ejercicio04;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CRUDContacto {
	
	//Atributos 
	
	Map <Contacto, String> mapContactos;
	
	//Constructor
	
	public CRUDContacto (Map <Contacto, String> mapContactos) {
		
		this.mapContactos = mapContactos;
	}
	
	//Getters and Setters
	
	public Map <Contacto, String> getMapContactos () {
		
		return mapContactos;
	}
	
	public void setMapContactos (Map <Contacto, String> mapContactos) {
		
		this.mapContactos = mapContactos;
	}
	
	
	//Métodos
	
	public void agregarContacto (Contacto c, String telefono) {
		
		mapContactos.put(c, telefono);
	}
	
	public void listarContactos () {
		
		Set <Entry<Contacto, String>> setContactos = mapContactos.entrySet();
		
		for (Entry<Contacto, String> entry : setContactos) {
			
			System.out.println(entry);
		}
	}
	
	public Entry <Contacto, String> buscarPorNombreYApellidos (String nombre, String apellidos) {
		
		Set <Entry<Contacto, String>> setContactos = mapContactos.entrySet();
		
		Iterator <Entry<Contacto, String>> it = setContactos.iterator();
		boolean encontrado = false;
		
		Entry<Contacto, String> entryContactos = null;
		
		while (it.hasNext() && !encontrado) {
			
			entryContactos = it.next();
			
			if (entryContactos.getKey().getNombre().equals(nombre) && entryContactos.getKey().getApellidos().equals(apellidos)) {
				
				encontrado = true;
			}
		}
		
		return entryContactos;
	}
	
	public void cambiarContacto (Entry<Contacto, String> entryContactos, String nombreNuevo, String apellidosNuevos) {
		
		entryContactos.getKey().setNombre(nombreNuevo);
		entryContactos.getKey().setApellidos(apellidosNuevos);
		
	}
	
	public void borrarContacto (Entry<Contacto, String> entryContactos) {
		
		mapContactos.entrySet().remove(entryContactos);
		
	}

}
