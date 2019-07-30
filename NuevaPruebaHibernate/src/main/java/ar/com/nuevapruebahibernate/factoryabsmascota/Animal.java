package ar.com.nuevapruebahibernate.factoryabsmascota;

public abstract class Animal {

	public abstract String getTipo();
    public abstract String getRaza();
    public abstract String getExtremidades();
    public abstract String soyMutante();
    
	@Override
    public String toString(){
        return "TIPO= "+this.getTipo()+", RAZA="+this.getRaza()+", EXTREMIDADES="+this.getExtremidades()+" "+this.soyMutante();
    }
}


