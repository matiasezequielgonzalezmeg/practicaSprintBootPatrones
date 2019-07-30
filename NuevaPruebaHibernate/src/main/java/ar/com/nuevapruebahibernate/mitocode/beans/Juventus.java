package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.stereotype.Component;

@Component
class Juventus implements Equipo{
	
	@Override
	public String mostrarEquipo() {
		return "Juventus FC";
	}

}
