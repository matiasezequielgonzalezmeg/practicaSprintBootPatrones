package ar.com.nuevapruebahibernate.pattern.composite.model;

public class Circulo implements Forma{

	@Override
	public void dibujar(String colorDeRelleno) {
		System.out.println("Dibujando un Circulo con el color "+colorDeRelleno);
		
	}
	

}
