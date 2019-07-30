package ar.com.nuevapruebahibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TMASCOTA", schema = "SEG02")
public class Mascota {
	
	@Id
	@GeneratedValue
	@Column(name = "IDMAS")
	private String idMas;
	
	@Column(name = "NOMBRE")
	private String nombreMas;
	
	@Column(name = "EDAD")
	private int edadMas;
	
	@Column(name = "RAZA")
	private String razaMas;
			
	@ManyToOne
	@JoinColumn(name = "PERSONAID")
	private Persona personaID;

	public Mascota() {
		super();
	}

	public Mascota(String nombreMas, int edadMas, String razaMas, String idMas, Persona personaID) {
		super();
		this.nombreMas = nombreMas;
		this.edadMas = edadMas;
		this.razaMas = razaMas;
		this.idMas = idMas;
		this.personaID = personaID;
	}

	public String getIdMas() {
		return idMas;
	}

	public void setIdMas(String id) {
		this.idMas = id;
	}

	public String getNombreMas() {
		return nombreMas;
	}

	public void setNombreMas(String nombreMas) {
		this.nombreMas = nombreMas;
	}

	public int getEdadMas() {
		return edadMas;
	}

	public void setEdadMas(int edadMas) {
		this.edadMas = edadMas;
	}

	public String getRazaMas() {
		return razaMas;
	}

	public void setRazaMas(String razaMas) {
		this.razaMas = razaMas;
	}
	
	@JsonIgnore
	public Persona getPersonaID() {
		return personaID;
	}

	public void setPersonaID(Persona personaID) {
		this.personaID = personaID;
	}

	@Override
	public String toString() {
		return "Mascota [" + (idMas != null ? "idMas=" + idMas + ", " : "")
				+ (nombreMas != null ? "nombreMas=" + nombreMas + ", " : "") + "edadMas=" + edadMas + ", "
				+ (razaMas != null ? "razaMas=" + razaMas : "") + "]";
	}
	
	
}
