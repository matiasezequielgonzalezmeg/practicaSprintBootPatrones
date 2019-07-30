package ar.com.nuevapruebahibernate.pattern.strategy;

public class EstrategiaPorPayPal implements EstrategiaDePago{
	
	private String mail;
	private String pass;
	
	
	public EstrategiaPorPayPal(String mail, String pass) {
		super();
		this.mail = mail;
		this.pass = pass;
	}


	@Override
	public void pago(int importe) {
		System.out.println(importe +" pagado con paypal");
	}
	
	

}
