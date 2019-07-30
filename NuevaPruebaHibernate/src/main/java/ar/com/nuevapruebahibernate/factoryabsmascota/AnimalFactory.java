package ar.com.nuevapruebahibernate.factoryabsmascota;

public class AnimalFactory {
	
	public static Animal getAnimal(AnimalAbstractFactory factory){
		return factory.createAnimal();
	}
	
//	public static Animal getAnimalMutante(AnimalAbstractFactory factory){
//		return factory.createAnimalMutante();
//	}

}
