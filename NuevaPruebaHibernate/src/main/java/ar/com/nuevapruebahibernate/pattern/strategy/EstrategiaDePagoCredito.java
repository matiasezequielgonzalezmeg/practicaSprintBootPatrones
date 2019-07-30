package ar.com.nuevapruebahibernate.pattern.strategy;

public class EstrategiaDePagoCredito implements EstrategiaDePago{

	private String nombre;
	private String numeroTarjeta;
	private String codigoSeguridad;
	private String datoDeExpiracion;


	public EstrategiaDePagoCredito(String nombre, String numeroTarjeta, String codigoSeguridad,
			String datoDeExpiracion) {
		super();
		this.nombre = nombre;
		this.numeroTarjeta = numeroTarjeta;
		this.codigoSeguridad = codigoSeguridad;
		this.datoDeExpiracion = datoDeExpiracion;
	}


	@Override
	public void pago(int importe) {
		System.out.println(importe +" pagado con tarjeta");
		
	}

}
