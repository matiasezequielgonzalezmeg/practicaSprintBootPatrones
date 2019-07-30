package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.stereotype.Component;

@Component
class Barcelona implements Equipo{

	@Override
	public String mostrarEquipo() {
		return "Barcelona FC";
	}

}
