package ar.com.nuevapruebahibernate.anotation;

public class MotorBike implements Vehiculos{	
	
	private String color;
	
	private int ruedas;
	
	private String tipoasiento;
	
	public MotorBike() {
		
	}

	@Override
	public String damePatente() {
		
		return "KJH 123 y color: " + color;
	}

	public String dameTipoCombustible() {
		return "Nafta";
	}
}
