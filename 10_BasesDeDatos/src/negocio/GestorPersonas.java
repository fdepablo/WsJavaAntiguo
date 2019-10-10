package negocio;

import java.util.List;

import entidades.Persona;
import persistencia.PersonaDaoDerby;
import persistencia.PersonaDaoMySql;
import persistencia.interfaces.PersonaDao;

public class GestorPersonas {
	
	PersonaDao personaDao = new PersonaDaoDerby();
	
	public boolean alta(Persona p){
		//PersonaDao personaDao = new PersonaDaoMySql();
		boolean alta = personaDao.alta(p);
		return alta;
	}
	
	public boolean baja(int id){
		//PersonaDao personaDao = new PersonaDaoMySql();
		boolean baja = personaDao.baja(id);
		return baja;
	}
	
	public boolean modificar(Persona p){
		//PersonaDao personaDao = new PersonaDaoMySql();
		boolean modificar = personaDao.modificar(p);
		return modificar;
	}
	
	public Persona obtener(int id){
		//PersonaDao personaDao = new PersonaDaoMySql();
		Persona persona = personaDao.obtener(id);
		return persona;
	}
	
	public List<Persona> listar(){
		//PersonaDao personaDao = new PersonaDaoMySql();
		List<Persona> listaPersonas = personaDao.listar();
		return listaPersonas;
	}
	
	public boolean crearBBDD(){
		return personaDao.crearBBDD();
	}
	
	
}
