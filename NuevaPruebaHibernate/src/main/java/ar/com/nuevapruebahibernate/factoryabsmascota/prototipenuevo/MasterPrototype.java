package ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo;

public interface MasterPrototype extends Cloneable {
	
	MasterPrototype clone() throws CloneNotSupportedException;

}
