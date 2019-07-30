package ar.com.nuevapruebahibernate.chainofresponsibilities.model;

public class Moneda {

	private int monto;

	public Moneda(int monto){
		this.monto=monto;
	}

	public int getMonto(){
		return this.monto;
	}
}
