package ar.com.nuevapruebahibernate.builder;

public class PruebaBuilder {

	public static void main(String[] args) {
		
		Usuario usuario = new UsuarioBuilder()
		        .email("matias.gonzalez@gmail.com")
		        .nombre("matias", "gonzalez")
		        .telefono("555123456")
		        .direccion("fake street 123")
		        .build();  
		
		System.out.println(usuario.toString());

	}

}
