package ar.com.nuevapruebahibernate.builderpro;

import ar.com.nuevapruebahibernate.builderpro.User.UserBuilder;

public class PruebaBuilderPro {

	public static void main(String[] args) {
		UserBuilder userBuilder = new User.UserBuilder("Juan", "Perez");
	    
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
			 
			    System.out.println(user1);
	 
	    //System.out.println(user1);
	 
	    User user2 = new User.UserBuilder("Jack", "Reacher")
	    .age(40)
	    .phone("5655")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("Super", "Man")
	    //No age
	    //No phone
	    //no address
	    .build();
	 
	    System.out.println(user3);
	    
	 
	 		Estudiante e1 = new Estudiante();
	 		e1.mostrarInfo();
	 		Estudiante e2 = new Estudiante();
	 		e2.mostrarInfo();
	 		// accediendo a la variable b static de la clase creada
	 		e1.b++; // incrementa en 1
	 		// Accediendo directamente desde la clase, sin instanciar un objeto
	 		Estudiante.b++; // incrementa en 1
	 		// como se puede ver la variable b static es compartida por todas las
	 		// instancia de la clase
	 		e2.mostrarInfo();
	}
}

class Estudiante {
	int a; // se inicializa en cero por cada objeto creado
	static int b; // se inicializa en cero cuando la clase es cargada y no por
					// cada objeto creado
 
	Estudiante() {
		// Constructor que incremente en 1 la variable static b
		b++;
	}
 
	public void mostrarInfo() {
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
	}
	// en un método static solo puede declar o llamar variables static
	// se puede descomentar para ver el error
	// public static void incrementar(){
	// a++;
	// }
}