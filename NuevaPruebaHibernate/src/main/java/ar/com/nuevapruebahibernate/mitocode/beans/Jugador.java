package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jugador extends Persona{
	
	@Autowired
	private Equipo equipo;//@Qualifier("barcelona")
	
	@Autowired
	private Camiseta camiseta;

	public Jugador() {
	}
	
	public Jugador(Equipo equipo,int id, String nombre, String apodo, Pais pais) {
		super(id,nombre,apodo);
		super.setPais(pais);
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [equipo=" + equipo.mostrarEquipo() + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApodo()="
				+ getApodo() + ", getPais()=" + getPais().getNombre() + "]";
	}
	
	

}
