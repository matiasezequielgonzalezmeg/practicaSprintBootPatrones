package ar.com.nuevapruebahibernate.anotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehiculos{
	
	@Value("Azul")
	private String color;
	@Value("4")
	private int ruedas;
	
	
	
	public Car() {
		
	}



	@Override
	public String damePatente() {
		// TODO Auto-generated method stub
		return "CFH 123";
	}

}
