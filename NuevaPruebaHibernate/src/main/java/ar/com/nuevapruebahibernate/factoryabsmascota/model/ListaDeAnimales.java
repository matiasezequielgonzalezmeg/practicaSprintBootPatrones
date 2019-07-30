package ar.com.nuevapruebahibernate.factoryabsmascota.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAnimales implements Cloneable {
	
	private List<String> animalesList;

	public ListaDeAnimales() {
		super();
		this.animalesList =  new ArrayList<String>();
	}

	public ListaDeAnimales(List<String> animalesList) {
		super();
		this.animalesList = animalesList;
	}
	
	public void cargarLista(){
		//read all employees from database and put into the list
		animalesList.add("cascabel");
		animalesList.add("dothraki");
		animalesList.add("martinPescador");
		animalesList.add("poni");
	}
	
	public List<String> getLista() {
		return animalesList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getLista()){
				temp.add(s);
			}
			return new ListaDeAnimales(temp);
	}

}
