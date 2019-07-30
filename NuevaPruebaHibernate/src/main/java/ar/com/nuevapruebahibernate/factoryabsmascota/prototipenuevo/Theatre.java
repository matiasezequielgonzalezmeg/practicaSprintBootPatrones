package ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo;

public class Theatre implements MasterPrototype{
	
	private String name = null;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Theatre clone() throws CloneNotSupportedException {
		System.out.println("Cloning Theatre object..");
		return (Theatre) super.clone();
	}

	@Override
	public String toString() {
		return "Theatre";
	}

}
