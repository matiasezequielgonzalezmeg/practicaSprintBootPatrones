package ar.com.nuevapruebahibernate.model;

import ar.com.nuevapruebahibernate.Factory.ComputerAbstractFactory;

public class PC extends Computadora implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu){
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
		return new PC(ram,hdd,cpu);
	}

}
