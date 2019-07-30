package ar.com.nuevapruebahibernate.state;

public class TVEstado implements TVRemoteEstado{

	private TVRemoteEstado tvState;

		public void setState(TVRemoteEstado state) {
			this.tvState=state;
		}

		public TVRemoteEstado getState() {
			return this.tvState;
		}

		@Override
		public void doAction() {
			this.tvState.doAction();
		}

	
}
