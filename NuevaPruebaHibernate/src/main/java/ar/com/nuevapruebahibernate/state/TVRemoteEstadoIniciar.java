package ar.com.nuevapruebahibernate.state;

public class TVRemoteEstadoIniciar implements TVRemoteEstado{

	@Override
	public void doAction() {
		System.out.println("TV ya esta encendida");		
	}

}
