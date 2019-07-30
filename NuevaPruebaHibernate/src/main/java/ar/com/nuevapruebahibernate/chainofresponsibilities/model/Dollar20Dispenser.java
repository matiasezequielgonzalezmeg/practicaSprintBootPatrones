package ar.com.nuevapruebahibernate.chainofresponsibilities.model;

public class Dollar20Dispenser implements CadenaDePago{
	
	private CadenaDePago cadena;
	
	@Override
	public void setSigEnCadena(CadenaDePago nextChain) {
		this.cadena=nextChain;
	}

	@Override
	public void dispensar(Moneda moneda) {
		if(moneda.getMonto() >= 20){
			int num = moneda.getMonto()/20;
			int resto = moneda.getMonto() % 20;
			System.out.println("Entregar "+num+" billetes de 20$ ");
			if(resto !=0) this.cadena.dispensar(new Moneda(resto));
		}else{
			this.cadena.dispensar(moneda);
		}
	}

}
