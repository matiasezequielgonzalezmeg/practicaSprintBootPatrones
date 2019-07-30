package ar.com.nuevapruebahibernate.chainofresponsibilities.model;

public class CadenaPagoATM {
	
	public CadenaDePago c1;

	
	public CadenaPagoATM() {
		super();
		this.c1 = new Dollar50Dispenser();
		
		CadenaDePago c2 = new Dollar20Dispenser();
		CadenaDePago c3 = new Dollar10Dispenser();
		
		c1.setSigEnCadena(c2);
		c2.setSigEnCadena(c3);
	}
	
	

}
