package ar.com.nuevapruebahibernate.factoryabsmascota.model;

import ar.com.nuevapruebahibernate.factoryabsmascota.Animal;

public class Ave extends Animal{
	
	public String tipo;
    public String raza;
    public String extremidades;
    
	public Ave(String tipo, String raza, String extremidades) {
		super();
		this.tipo = tipo;
		this.raza = raza;
		this.extremidades = extremidades;
	}
    
	@Override
	public String getTipo() {
		return this.tipo;
	}

	@Override
	public String getRaza() {
		return this.raza;
	}

	@Override
	public String getExtremidades() {
		return this.extremidades;
	}

	@Override
	public String soyMutante() {
		String aux = "y no soy mutante";
		return aux;
	}

}
