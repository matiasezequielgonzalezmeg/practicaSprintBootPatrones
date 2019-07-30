package ar.com.nuevapruebahibernate.anotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehiculos{

	@Value("Verde")
	private String color;
	@Value("2")
	private int ruedas;
	
	
	
	public Bike() {
		
	}



	@Override
	public String damePatente() {
		
		return "KJH 123 y color: " + color;
	}
}
