package ar.com.nuevapruebahibernate.chainofresponsibilities.model;

public class Dollar50Dispenser implements CadenaDePago {
	
	private CadenaDePago cadena;
	
	@Override
	public void setSigEnCadena(CadenaDePago nextChain) {
		this.cadena=nextChain;
	}

	@Override
	public void dispensar(Moneda moneda) {
		if(moneda.getMonto() >= 50){
			int num = moneda.getMonto()/50;
			int resto = moneda.getMonto() % 50;
			System.out.println("Entregar "+num+" billetes de 50$ ");
			if(resto !=0) this.cadena.dispensar(new Moneda(resto));
		}else{
			this.cadena.dispensar(moneda);
		}
	}

}
