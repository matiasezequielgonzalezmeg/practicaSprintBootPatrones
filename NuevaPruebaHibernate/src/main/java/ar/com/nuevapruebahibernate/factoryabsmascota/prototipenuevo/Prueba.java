package ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo;

public class Prueba {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.setName("ABC");
		System.out.println(m.getName());
		Movie m1= new Movie();
		m1.setName("pepe");
		System.out.println(m1.getName());
		System.out.println(m.getName());
		m.setName("pepe3");
		System.out.println(m.getName());
		System.out.println(m1.getName());

	}

}
