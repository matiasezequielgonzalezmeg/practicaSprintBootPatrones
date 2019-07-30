package ar.com.nuevapruebahibernate.state;

public class TVRemoteEstadoFinalizar implements TVRemoteEstado{

	@Override
	public void doAction() {
		System.out.println("TV ya esta apagada");
	}

}
