package ar.com.nuevapruebahibernate.pattern.composite;

import ar.com.nuevapruebahibernate.pattern.composite.model.Circulo;
import ar.com.nuevapruebahibernate.pattern.composite.model.Cuadrado;
import ar.com.nuevapruebahibernate.pattern.composite.model.Dibujar;
import ar.com.nuevapruebahibernate.pattern.composite.model.Forma;
import ar.com.nuevapruebahibernate.pattern.composite.model.Triangulo;

public class PruebaComposite {
	
	public static void main(String[] args) {
		Forma tri = new Triangulo();
		Forma tri1 = new Triangulo();
		Forma cir = new Circulo();
		Forma cua = new Cuadrado();
		
		Dibujar drawing = new Dibujar();
		drawing.setFormas(tri);
		drawing.setFormas(tri1);
		drawing.setFormas(cir);
		
		drawing.dibujar("Rojo");
		
		drawing.borrar();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" - * - * - * - * - * - * - * - * - * - * ");
		System.out.println("ahora dibujare un triangulo y un cuadrado de color verde");
		drawing.setFormas(tri);
		drawing.setFormas(cua);
		
		drawing.dibujar("Verde");
	}

}
