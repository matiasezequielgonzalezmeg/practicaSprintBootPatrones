package ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo;

public class PrototypeFactory {

	public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String THEATRE = "theatre";
        public static final String SERIE = "serie";
    }
    private static java.util.Map<String , MasterPrototype> prototypes = new java.util.HashMap<String , MasterPrototype>();
 
    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.THEATRE, new Theatre());
        prototypes.put(ModelType.SERIE, new Serie());
    }
 
    public static MasterPrototype getInstance(final String s) throws CloneNotSupportedException {
        return ((MasterPrototype) prototypes.get(s)).clone();
    }
    
}
