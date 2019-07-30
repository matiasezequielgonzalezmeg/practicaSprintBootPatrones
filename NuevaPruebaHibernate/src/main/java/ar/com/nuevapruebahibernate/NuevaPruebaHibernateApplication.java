package ar.com.nuevapruebahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ar.com.nuevapruebahibernate.anotation.Bike;
import ar.com.nuevapruebahibernate.anotation.Estacionamiento;
import ar.com.nuevapruebahibernate.anotation.Vehiculos;

@SpringBootApplication
public class NuevaPruebaHibernateApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(NuevaPruebaHibernateApplication.class, args);
		String[] beans = ctx.getBeanDefinitionNames();
		Vehiculos v = (Vehiculos) ctx.getBean("bike");
		Estacionamiento ve = (Estacionamiento) ctx.getBean(Estacionamiento.class);
		for (String string : beans) {
			System.out.println(string);
		}
	
	}

}
