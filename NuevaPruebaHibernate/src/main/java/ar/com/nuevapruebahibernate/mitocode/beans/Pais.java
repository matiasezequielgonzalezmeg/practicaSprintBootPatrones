package ar.com.nuevapruebahibernate.mitocode.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class Pais {

	@Value("Argentina")
	private String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@PostConstruct
	private void initBean() {
		System.out.println("Antes de iniciar el Bean de Pais");
	}
	
	@PreDestroy
	private void destroyBean() {
		System.out.println("Antes de Destruir el Bean de Pais");
	}
	
}
