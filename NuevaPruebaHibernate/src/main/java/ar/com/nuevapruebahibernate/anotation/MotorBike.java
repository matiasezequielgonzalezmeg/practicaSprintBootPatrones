package ar.com.nuevapruebahibernate.anotation;

public class MotorBike implements Vehiculos{	
	
	private String color;
	
	private int ruedas;
	
	private String tipoAsiento;
	
	private String tipoFreno;
	
<<<<<<< HEAD
=======
	private String cambio1;
	
	private String cambio2;
	
	private String cambioHot;
	
>>>>>>> f48f90b... hotfix
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
