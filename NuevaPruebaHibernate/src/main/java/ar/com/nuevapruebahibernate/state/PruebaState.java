package ar.com.nuevapruebahibernate.state;

public class PruebaState {

	public static void main(String[] args) {
		TVEstado context = new TVEstado();
		TVRemoteEstado tvEstadoIniciar = new TVRemoteEstadoIniciar();
		TVRemoteEstado tvEstadoFinalizar = new TVRemoteEstadoFinalizar();
		
		context.setState(tvEstadoIniciar);
		context.doAction();
		
		
		context.setState(tvEstadoFinalizar);
		context.doAction();
		
	}
	
}
