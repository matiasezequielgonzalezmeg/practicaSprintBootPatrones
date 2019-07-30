package ar.com.nuevapruebahibernate.anotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trunk")
public class Trunk implements Vehiculos{

	@Value("rojo")
	private String color;
	@Value("4")
	private int ruedas;
	
	
	
	public Trunk() {
	
	}



	@Override
	public String damePatente() {
		// TODO Auto-generated method stub
		return "TJH 123";
	}
	
}
