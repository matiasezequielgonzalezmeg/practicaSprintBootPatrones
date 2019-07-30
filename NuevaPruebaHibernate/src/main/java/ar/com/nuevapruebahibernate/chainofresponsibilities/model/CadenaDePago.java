package ar.com.nuevapruebahibernate.chainofresponsibilities.model;

public interface CadenaDePago {

    void setSigEnCadena(CadenaDePago sigEnCadena);
	
	void dispensar(Moneda moneda);
}
