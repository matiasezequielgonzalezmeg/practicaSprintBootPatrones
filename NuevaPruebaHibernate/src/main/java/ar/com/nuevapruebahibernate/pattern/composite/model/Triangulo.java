package ar.com.nuevapruebahibernate.pattern.composite.model;

public class Triangulo implements Forma{

	@Override
	public void dibujar(String colorDeRelleno) {
		System.out.println("Dibujando un Triangulo con el color "+colorDeRelleno);
		
	}

}
