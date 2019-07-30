package ar.com.nuevapruebahibernate.bean.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaBeanXml {

	public static void main(String[] args) {
		//leer o cargar XMl de configuracion(contenedor)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir bean al conetenedor 
		EmpleadoFinanciero antonio = (EmpleadoFinanciero) contexto.getBean("comercialExperimentado");
		
		//usar el bean
		System.out.println(antonio.getInformes());
		System.out.println(antonio.getTareas());
		
		//cerrar el contexto (contenedor)
		contexto.close();

	}

}
