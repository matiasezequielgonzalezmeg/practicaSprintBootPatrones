package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camiseta {

	@Value("Azul")
	private String color ;
	
	@Value("Emirate")
	private String marca;

	public Camiseta (){
		
	}
	
	public Camiseta(String color, String marca) {
		super();
		this.color = color;
		this.marca = marca;
	}
	
	
}
