package ar.com.nuevapruebahibernate.mitocode.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Persona {
	@Value("10")
	private int id;
	@Value("Lionel messi")
	private String nombre;
	@Value("Pulga")
	private String apodo;
	@Autowired
	private Pais pais;
	
	public Persona() {
		super();
	}

	public Persona(int id, String nombre, String apodo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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

	/**
	 * @return the apodo
	 */
	public String getApodo() {
		return apodo;
	}

	/**
	 * @param apodo the apodo to set
	 */
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", pais=" + pais.getNombre() + "]";
	}
	
	@PostConstruct
	private void initBean() {
		System.out.println("Antes de iniciar el Bean de Persona");
	}
	
	@PreDestroy
	private void destroyBean() {
		System.out.println("Antes de Destruir el Bean de Persona");
	}
	

}
