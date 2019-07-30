package ar.com.nuevapruebahibernate.pattern.strategy;



public class ContextoDeEstrategia {
	
	public static EstrategiaDePago getEstrategia(int monto){
		if (monto<300000) {
			return new EstrategiaDePagoCredito("Pankaj Kumar", "1234567890123456", "786", "12/15");
		} else {
			return new EstrategiaPorPayPal("pepeLuis@gmail.com", "123456");
		}
	}

}
