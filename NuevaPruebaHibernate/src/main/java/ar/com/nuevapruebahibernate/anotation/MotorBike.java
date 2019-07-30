package ar.com.nuevapruebahibernate.anotation;

public class MotorBike implements Vehiculos{	
	
	private String color;
	
	private int ruedas;
	
	private String tipoAsiento;
	
	private String tipoFreno;
	
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
