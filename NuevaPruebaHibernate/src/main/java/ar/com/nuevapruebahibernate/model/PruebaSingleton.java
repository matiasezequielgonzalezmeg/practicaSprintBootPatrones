package ar.com.nuevapruebahibernate.model;

public class PruebaSingleton {

	private String nombreCompleto ;
	
	private String apodo;

	private static PruebaSingleton pruebaSingleton;

	public static PruebaSingleton getPruebaSingleton(String nombreCompleto,String apodo) {
		if (pruebaSingleton==null) {
			pruebaSingleton=new PruebaSingleton(nombreCompleto,apodo);
		}
		return pruebaSingleton;
	}

	private PruebaSingleton(String nombreCompleto, String apodo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.apodo = apodo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public String toStringByMat() {
		return "*****----PruebaSingleton [nombreCompleto= " + nombreCompleto + ", apodo= " + apodo + " ]";
	}

	

}
