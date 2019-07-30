package ar.com.nuevapruebahibernate.pattern.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Dibujar implements Forma {

	//collec de formas
	private List<Forma> formas = new ArrayList<Forma>();
		
	
	public List<Forma> getFormas() {
		return formas;
	}

	public void setFormas(Forma forma) {
		this.formas.add(forma);
	}

	//removing shape from drawing
		public void remove(Forma s){
			formas.remove(s);
		}

	@Override
	public void dibujar(String colorDeRelleno) {
		for(Forma f : formas)
		{
			f.dibujar(colorDeRelleno);
		}
		
	}
	
	public void borrar(){
		System.out.println("Quitando todas las formas de la hoja de dibujo");
		this.formas.clear();
	}

}
