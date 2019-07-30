package ar.com.nuevapruebahibernate.facade;

public class PruebaFacade {

	public static void main(String[] args) {	
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}