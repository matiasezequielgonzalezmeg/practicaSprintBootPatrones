package ar.com.nuevapruebahibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TPERSONA", schema = "SEG02")
public class Persona {

	@Id
    @Column(name = "PERSONA_ID")
    @GeneratedValue
    private int id;
	
	@Column(name = "NOMBRE")
    private String nombre;
	
	@Column(name = "APELLIDO")
    private String apellido;
	
	@Column(name = "EDAD")
    private int edad;
	
	@OneToMany(fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL,
			mappedBy = "personaID")
	private List<Mascota> mascotas;

	public Persona() {
		super();
	}

	public Persona(int id, String nombre, String apellido, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + "edad=" + edad + ", "
				+ (mascotas != null ? "mascotas=" + mascotas : "") + "]";
	}
	
	

}





/*
 * Cosas para buscar en mascotas
 * 
 * public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public String getMascotaNombre() {
		return mascota.getNombreMas();
	}

	public void setMascotaNombre(String nombreMas) {
		this.mascota.setNombreMas(nombreMas); 
	}
	
	public int getMascotaEdad() {
		return mascota.getEdadMas();
	}

	public void setMascotaEdad(int edadMas) {
		this.mascota.setEdadMas(edadMas); 
	}

	public String getMascotaRaza() {
		return mascota.getRazaMas();
	}

	public void setMascotaRaza(String razaMas) {
		this.mascota.setRazaMas(razaMas); 
	}
		
 * */
