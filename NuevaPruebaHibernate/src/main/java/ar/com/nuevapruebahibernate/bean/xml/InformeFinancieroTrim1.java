package ar.com.nuevapruebahibernate.bean.xml;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformesFinanciero() {
		// TODO Auto-generated method stub
		return "Informe financiero del Trimestre '1'";
	}

}
