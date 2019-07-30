package ar.com.nuevapruebahibernate.model;

import ar.com.nuevapruebahibernate.Factory.ComputerAbstractFactory;

public class Notebook extends Computadora implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Notebook(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getRAM() {
		
		return this.ram;
	}

	@Override
	public String getHDD() {
		
		return this.hdd;
	}

	@Override
	public String getCPU() {
		
		return this.cpu;
	}

	@Override
	public Computadora createComputer() {
		return new Notebook(ram,hdd,cpu);
	}

}
