package ar.com.nuevapruebahibernate.mitocode.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		/*Jugador j = new Jugador(new Barcelona(), 1, "Lionel Messi", "Pulga", (Pais)appContext.getBean("pais"));
		System.out.println(j);
		Mundo m = (Mundo) appContext.getBean("marte");
		
		Mundo m2 = (Mundo) appContext.getBean("mundo");
		m2.setSaludo("Hola a todos!");
		System.out.println(m2.getSaludo());
		
		Persona p = (Persona) appContext.getBean("persona");
		p.setId(1);
		p.setApodo("ash");
		p.setNombre("matias");
		p.setPais((Pais)appContext.getBean("pais"));
		System.out.println(p.toString());*/
		
		//--no--Jugador j2 = new Jugador();
		//--no--System.out.println(j2.toString());
		
		Jugador j = (Jugador) appContext.getBean("jugador");
		System.out.println(j.toString());
				
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
