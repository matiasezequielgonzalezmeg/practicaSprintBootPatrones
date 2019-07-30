package ar.com.nuevapruebahibernate.bean.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class ComercialExperimentado implements EmpleadoFinanciero {

	private CreacionInformeFinanciero informe;
	
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informe) {
		
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Esto es un informe generado por el Empleado Comercial Experimentado";
		return informe.getInformesFinanciero();
	}

	
}
