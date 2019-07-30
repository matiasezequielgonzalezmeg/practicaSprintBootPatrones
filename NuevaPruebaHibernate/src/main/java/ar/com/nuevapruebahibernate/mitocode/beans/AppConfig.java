package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Persona persona() {
		return new Persona();
	}
	
	@Bean
	public Pais pais() {
		return new Pais();
	}
	
	@Bean
	public Jugador jugador() {
		return new Jugador();
	}

}
