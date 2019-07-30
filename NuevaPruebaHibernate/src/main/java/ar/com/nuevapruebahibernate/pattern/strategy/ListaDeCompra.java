package ar.com.nuevapruebahibernate.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompra {

	List<Item> items;

	public ListaDeCompra() {
		super();
		this.items=new ArrayList<Item>();
	}
	
	public void aniadirItem(Item item){
		this.items.add(item);
	}
	
	public void removerItem(Item item){
		this.items.remove(item);
	}
	
	public int calcularTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrecio();
		}
		return sum;
	}
	
	public void pagar(EstrategiaDePago paymentMethod){
		int amount = calcularTotal();
		paymentMethod.pago(amount);
	}
	
}
