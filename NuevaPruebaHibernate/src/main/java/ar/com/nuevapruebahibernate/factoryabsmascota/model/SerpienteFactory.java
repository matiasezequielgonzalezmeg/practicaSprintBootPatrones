package ar.com.nuevapruebahibernate.factoryabsmascota.model;

import ar.com.nuevapruebahibernate.factoryabsmascota.Animal;
import ar.com.nuevapruebahibernate.factoryabsmascota.AnimalAbstractFactory;

public class SerpienteFactory implements AnimalAbstractFactory{
	
	public String tipo;
    public String raza;
    public String extremidades;
    public Boolean isMutan;
    
	public SerpienteFactory(String tipo, String raza, String extremidades, Boolean isMutan) {
		super();
		this.tipo = tipo;
		this.raza = raza;
		this.extremidades = extremidades;
		this.isMutan = isMutan;
	}

	@Override
	public Animal createAnimal() {
		if (isMutan) {
			return new SerpienteMutante(tipo,raza,extremidades);
		}else {
			return new Serpiente(tipo,raza,extremidades);
		}
		
	}

	/*@Override
	public Animal createAnimalMutante() {
		return new SerpienteMutante(tipo,raza,extremidades);
	}*/

}
