package ar.com.nuevapruebahibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO_CLAVE")
public class UsuarioClave {

	@Id
    @Column(name = "TB_USUARIO_CLAVE_ID")
    @GeneratedValue
    private int id;

    @Column(name = "COD")
    private String cod;
    
    @Column(name = "USUARIO")
    private String usuario;
    
    @Column(name = "PASS")
    private String pass;
   
    public UsuarioClave() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCod() {
		return cod;
	}



	public void setCod(String cod) {
		this.cod = cod;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}
    
    
    
}
