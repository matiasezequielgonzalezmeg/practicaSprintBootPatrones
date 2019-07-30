package ar.com.nuevapruebahibernate.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class pruebaEstrategia {
	
	
	public static void main(String[] args) {
		
ListaDeCompra ListaDeCompras1 = new ListaDeCompra();
ListaDeCompra ListaDeCompras2 = new ListaDeCompra();
		
		Item item1 = new Item("Plato",10);
		Item item2 = new Item("Cubiertos",40);
		Item item3 = new Item("lingote de oro",400000);
		
		ListaDeCompras1.aniadirItem(item1);
		ListaDeCompras1.aniadirItem(item2);
		
		ListaDeCompras2.aniadirItem(item3);
		
		List<ListaDeCompra> miLista = new ArrayList<ListaDeCompra> ();
		
		miLista.add(ListaDeCompras1);
		miLista.add(ListaDeCompras2);
		
		for(ListaDeCompra l : miLista){
			if (l.calcularTotal()<300000) {
				l.pagar(new EstrategiaDePagoCredito("Pankaj Kumar", "1234567890123456", "786", "12/15"));
			} else {
				l.pagar(new EstrategiaPorPayPal("pepeLuis@gmail.com", "123456"));
			}
			
		}
		System.out.println("-*-*-*-*-*-*-*-*-*Segunda estrategia-*-*-*-*-*-*-*-*-*");
		for(ListaDeCompra l : miLista){
			l.pagar(ContextoDeEstrategia.getEstrategia(l.calcularTotal()));
		}
		
		
	}

}
