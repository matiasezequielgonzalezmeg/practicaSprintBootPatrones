package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Mundo mundo() {
		return new Mundo();
	}
	
	@Bean
	public Mundo marte() {
		return new Mundo();
	}
	
	@Bean
	public Equipo equipo() {
		return new Barcelona();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
}
