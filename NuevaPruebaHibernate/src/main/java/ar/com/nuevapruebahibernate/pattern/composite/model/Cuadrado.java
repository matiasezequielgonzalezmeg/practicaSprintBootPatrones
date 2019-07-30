package ar.com.nuevapruebahibernate.pattern.composite.model;

public class Cuadrado implements Forma{

	@Override
	public void dibujar(String colorDeRelleno) {
		System.out.println("Dibujando un Cuadrado con el color "+colorDeRelleno);
		
	}
	
	
}
