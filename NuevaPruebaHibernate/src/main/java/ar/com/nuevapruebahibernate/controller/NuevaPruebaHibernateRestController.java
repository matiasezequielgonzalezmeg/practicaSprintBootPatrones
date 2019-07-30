package ar.com.nuevapruebahibernate.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.nuevapruebahibernate.Factory.ComputerFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.Animal;
import ar.com.nuevapruebahibernate.factoryabsmascota.AnimalFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.AveFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.CaballoFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.ListaDeAnimales;
import ar.com.nuevapruebahibernate.factoryabsmascota.model.SerpienteFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo.PrototypeFactory;
import ar.com.nuevapruebahibernate.factoryabsmascota.prototipenuevo.PrototypeFactory.ModelType;
import ar.com.nuevapruebahibernate.model.Computadora;
import ar.com.nuevapruebahibernate.model.Mascota;
import ar.com.nuevapruebahibernate.model.Persona;
import ar.com.nuevapruebahibernate.model.PruebaSingleton;
import ar.com.nuevapruebahibernate.repository.PersonaRepository;



@RestController
@RequestMapping("/api")
public class NuevaPruebaHibernateRestController {

	@Autowired
	private DataSource dataSourceH;

	@Autowired
	private PersonaRepository personaRepository;

	@RequestMapping(path = "/CrearPc", method = RequestMethod.GET)
	public void CrearPc() { 

		Computadora pc = ComputerFactory.getComputer("Pc","2 GB","500 GB","2.4 GHz");
		Computadora server = ComputerFactory.getComputer("Server","16 GB","2500 GB","3.3 GHz");
		Computadora notebook = ComputerFactory.getComputer("Notebook","8 GB","1000 GB","3.0 GHz");



		System.out.println("Factory PC Config :: "+pc);

		System.out.println("Factory server Config :: "+server);

		System.out.println("Factory notebook Config :: "+notebook);

	}

	@RequestMapping(path = "/UsarNuevoPrototipo", method = RequestMethod.GET)
	public List<String> UsarNuevoPrototipo() {
		List<String> miLista = new ArrayList<String> ();
		
		try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String theatrePrototype  = PrototypeFactory.getInstance(ModelType.THEATRE).toString();
            System.out.println(theatrePrototype);
 
            String seriePrototype  = PrototypeFactory.getInstance(ModelType.SERIE).toString();
            System.out.println(seriePrototype);
            miLista.add("lo que cree fue: ");
            miLista.add(moviePrototype);
            miLista.add(theatrePrototype);
            miLista.add(seriePrototype);
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

		return miLista;
	}
	
	
	@RequestMapping(path = "/UsarPrototipe", method = RequestMethod.GET)
	public List<ArrayList> UsarPrototipe() throws CloneNotSupportedException {

		List<String> aux1 = new ArrayList<>();
		List<String> aux2 = new ArrayList<>();
		List<String> aux3 = new ArrayList<>();

		ListaDeAnimales listaA1 = new ListaDeAnimales();
		listaA1.cargarLista();

		ListaDeAnimales listaA3 = (ListaDeAnimales) listaA1.clone();
		//listaA3.cargarLista();
		ListaDeAnimales listaA2 = (ListaDeAnimales) listaA1.clone();
		//listaA2.cargarLista();

		aux1 = listaA1.getLista();
		aux2 = listaA2.getLista();
		aux2.add("Fenix");
		aux3 = listaA3.getLista();
		aux3.remove(1);

		System.out.println(aux1);
		System.out.println(aux2);
		System.out.println(aux3);

		List<ArrayList> miLista = new ArrayList<ArrayList> ();
		miLista.add((ArrayList) aux1);
		miLista.add((ArrayList) aux2);
		miLista.add((ArrayList) aux3);

		return miLista;
	}

	@RequestMapping(path = "/CrearAnimal", method = RequestMethod.GET)
	public List<Animal> CrearAnimal() { 

		List<Animal> aux = new ArrayList<>();
		Animal ave = AnimalFactory.getAnimal(new AveFactory("Oviparo", "gilguero", "Dos", false));
		Animal caballo = AnimalFactory.getAnimal(new CaballoFactory("Mamidero", "arabe", "cuatro",false));
		Animal Serpiente = AnimalFactory.getAnimal(new SerpienteFactory("Oviparo", "coral", "cero",false));

		System.out.println("AnimalFactory ave Config :: "+ave);

		System.out.println("AnimalFactory caballo Config :: "+caballo);

		System.out.println("AnimalFactory Serpiente Config :: "+Serpiente);

		Animal aveM = AnimalFactory.getAnimal(new AveFactory("Oviparo", "gilguero", "nueve",true));
		Animal caballoM = AnimalFactory.getAnimal(new CaballoFactory("Mamidero", "arabe", "Cuarenta y cuatro",true));
		Animal SerpienteM = AnimalFactory.getAnimal(new SerpienteFactory("Oviparo", "coral", "diez",true));

		System.out.println("AnimalFactory aveM Config :: "+aveM);

		System.out.println("AnimalFactory caballoM Config :: "+caballoM);

		System.out.println("AnimalFactory SerpienteM Config :: "+SerpienteM);

		aux.add(ave);
		aux.add(aveM);
		aux.add(caballo);
		aux.add(caballoM);
		aux.add(Serpiente);
		aux.add(SerpienteM);

		return aux;


	}

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public List<Map<String,Object>> listar() {
		System.out.println("estoy en listar");
		List<Map<String,Object>> aux = null;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceH);

		String sql = "SELECT * from SEG02.TB_USUARIO_CLAVE";
		System.out.println(sql);
		aux = jdbcTemplate.queryForList(sql);
		System.out.println(aux);

		PruebaSingleton.getPruebaSingleton("MatiasGonzalez", "Rulo") ;
		System.out.println(PruebaSingleton.getPruebaSingleton("x", "apodo").toStringByMat());

		return aux ;

	}

	@RequestMapping(path = "/listarMascota", method = RequestMethod.GET)
	public List<Map<String,Object>> listarMascota() {
		System.out.println("estoy en listarMascota");
		List<Map<String,Object>> aux = null;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceH);


		String sql = "SELECT * from SEG02.TMASCOTA";
		System.out.println(sql);
		aux = jdbcTemplate.queryForList(sql);
		System.out.println(aux);

		return aux ;

	}

	@RequestMapping(path = "/listarPersona", method = RequestMethod.GET)
	public List<Persona> listarPersona(@RequestParam Map<String, String> stringAux) {
		System.out.println("estoy en listarPersona");
		List<Persona> p = new ArrayList<>();
		try {
			if (stringAux != null) {
				String id = stringAux.get("ID");
				Integer aux = Integer.parseInt(id);//.parseInt(id); // 
				Persona p1 = personaRepository.findById(aux).orElse(null) ;
				p.add(p1);
			} else {
				p = personaRepository.findAll();
			}
			//List<Persona> p = personaRepository.findAll();
			//p.stream().forEach(System.out::println);
			return p;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@RequestMapping(path = "/insertarMascota", method = RequestMethod.POST)
	public void insertPersona(@RequestBody Mascota mascota ) {
		System.out.println("estoy en insert Mascota");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceH);
		String auxConsultaMascota = "INSERT INTO SEG02.TMASCOTA (NOMBRE,EDAD,RAZA,IDMAS)"
				+ " VALUES (\'" + mascota.getNombreMas()+"\',"+mascota.getEdadMas()+",\'"
				+mascota.getRazaMas()+"\',\'"+ mascota.getIdMas() +"\'" +mascota.getPersonaID()+")";

		jdbcTemplate.update(auxConsultaMascota);

		System.out.println("filas afectadas EN INSERT Mascota: "+auxConsultaMascota);
		System.out.println("*****************");
	}

	@RequestMapping(path = "/insertarPersona", method = RequestMethod.POST)
	public void insertPersona(@RequestBody Persona persona ) {
		System.out.println("estoy en insert Persona");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceH);
		String auxConsulta = "INSERT INTO SEG02.TPERSONA (PERSONA_ID,NOMBRE,APELLIDO,EDAD,MASCOTA)"
				+ " VALUES (" + persona.getId()+",\'"+persona.getNombre()+"\',\'"
				+persona.getApellido()+"\',"+persona.getEdad() +")";

		System.out.println("filas afectadas EN INSERT PERSONA: "+auxConsulta);
		jdbcTemplate.update(auxConsulta);

		//System.out.println("filas afectadas EN INSERT PERSONA: "+auxConsulta);
		System.out.println("*****************");

		/*String auxConsultaMascota = "INSERT INTO SEG02.TMASCOTA (NOMBRE,EDAD,RAZA,IDMAS)"
				+ " VALUES (" + mascota.getNombreMas()+",\'"+mascota.getEdadMas()+"\',\'"
				+mascota.getRazaMas()+"\',\'"+mascota.getId() +"\')";

		jdbcTemplate.update(auxConsultaMascota);

		System.out.println("filas afectadas EN INSERT Mascota: "+auxConsultaMascota);
		System.out.println("*****************");
		 */

	}

}
