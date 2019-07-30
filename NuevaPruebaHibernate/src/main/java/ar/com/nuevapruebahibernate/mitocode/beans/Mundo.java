package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	@Value("Hola Mundo!")
	private String saludo;

	public Mundo() {
		super();
	}

	public Mundo(String saludo) {
		super();
		this.saludo = saludo;
	}

	/**
	 * @return the saludo
	 */
	public String getSaludo() {
		return saludo;
	}

	/**
	 * @param saludo the saludo to set
	 */
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}
