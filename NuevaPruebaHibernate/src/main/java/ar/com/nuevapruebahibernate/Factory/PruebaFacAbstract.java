package ar.com.nuevapruebahibernate.Factory;

import ar.com.nuevapruebahibernate.factoryabsmascota.Animal;
import ar.com.nuevapruebahibernate.factoryabsmascota.AnimalFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.AveFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.CaballoFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.SerpienteFactory;

public class PruebaFacAbstract {

	public static void main(String[] args) {
		Animal ave = AnimalFactory.getAnimal(new AveFactory("Oviparo", "gilguero", "Dos", false));
		Animal caballo = AnimalFactory.getAnimal(new CaballoFactory("Mamidero", "arabe", "cuatro",false));
		Animal Serpiente = AnimalFactory.getAnimal(new SerpienteFactory("Oviparo", "coral", "cero",false));

		System.out.println("AnimalFactory ave Config :: "+ave);

		System.out.println("AnimalFactory caballo Config :: "+caballo);

		System.out.println("AnimalFactory Serpiente Config :: "+Serpiente);

		Animal aveM = AnimalFactory.getAnimal(new AveFactory("Oviparo", "gilguero", "nueve",true));
		Animal caballoM = AnimalFactory.getAnimal(new CaballoFactory("Mamidero", "arabe", "Cuarenta y cuatro",true));
		Animal SerpienteM = AnimalFactory.getAnimal(new SerpienteFactory("Oviparo", "coral", "diez",true));

		System.out.println("AnimalFactory aveM Config :: "+aveM);

		System.out.println("AnimalFactory caballoM Config :: "+caballoM);

		System.out.println("AnimalFactory SerpienteM Config :: "+SerpienteM);

	}

}
