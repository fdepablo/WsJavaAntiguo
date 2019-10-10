package persistencia;

import beans.Persona;

/**
 * Esta clase es la encargada de dar de alta en un array una persona. Cuando el programa
 * se pare se perderan las personas guardadas en el
 * @author Lucia 
 *
 */
public class DaoPersonas {
	private static Persona[] arrayPersonas = new Persona[3];
	private static int numeroPersonas = 0;
	
	/**
	 * Dar de alta una persona en el array
	 * @author Felix
	 * @param p representa la persona a dar de alta
	 * @return 0 en caso de que la persona se haya dado de alta, -1 en caso de que no haya
	 * sitio en el array
	 */
	public int altaPersonas(Persona p) {
		if(numeroPersonas <= 3) {
			arrayPersonas[numeroPersonas] = p;
			return 0;
		}else {
			return -1;
		}
	}
}
