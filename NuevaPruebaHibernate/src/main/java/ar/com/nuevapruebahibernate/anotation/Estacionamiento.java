package ar.com.nuevapruebahibernate.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("estacionamiento")
public class Estacionamiento {

	@Autowired
	@Qualifier("bike")
	private Vehiculos dosRuedas;
	
	public Estacionamiento() {
		//this.dosRuedas = new Bike();
		//this.cuatroRuedas = new Car();
	}
	
	@Override
	public String toString() {
		return "Estacionamiento [Patente vehiculo de dosRuedas=" + dosRuedas.damePatente() 
		+ " ]";
	}
	
	
}
