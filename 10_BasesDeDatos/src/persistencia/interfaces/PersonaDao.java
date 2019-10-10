package persistencia.interfaces;

import java.util.List;

import entidades.Persona;

public interface PersonaDao {
	boolean alta(Persona p);
	boolean baja(int id);
	boolean modificar(Persona p);
	Persona obtener(int id);
	List<Persona> listar();
	boolean crearBBDD();
}
