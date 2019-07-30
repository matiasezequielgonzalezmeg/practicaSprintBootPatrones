package ar.com.nuevapruebahibernate.Factory;

import ar.com.nuevapruebahibernate.model.Computadora;
import ar.com.nuevapruebahibernate.model.Notebook;
import ar.com.nuevapruebahibernate.model.PC;
import ar.com.nuevapruebahibernate.model.Server;

public class ComputerFactory {
	
	/*
	 * public static Computadora getComputer(ComputerAbstractFactory factory){
	 * return factory.createComputer(); }
	 */

	public static Computadora getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		else if ("Notebook".equalsIgnoreCase(type)) return new Notebook(ram, hdd, cpu);
		
		return null;
	}
	
	
}
