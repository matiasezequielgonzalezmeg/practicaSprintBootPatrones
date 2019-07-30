package ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo;

public class Serie implements MasterPrototype{

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
	public Serie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Serie object..");
		return (Serie) super.clone();
	}

	@Override
	public String toString() {
		return "Serie";
	}

}
