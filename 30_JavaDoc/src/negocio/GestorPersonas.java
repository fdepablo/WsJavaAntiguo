package negocio;

import beans.Persona;
import persistencia.DaoPersonas;

/**
 * 
 * Esta clase sirve para aplicar toda la logica de negocio de la clase persona
 * 
 * @author Felix de Pablo
 * @see Persona
 *
 */
public class GestorPersonas {
	
	/**
	 * Metodo sirve para dar de alta una persona en nuestra aplicación
	 * 
	 * @author Felix de Pablo
	 * @since 26/11/2018
	 * @param p representa la persona a dar de alta
	 * @return 1 en caso de que el nombre del usuario sea mayor de 10 caracteres, 0 en 
	 * caso de que no haya habido problema, y -1 en caso de que no se haya podido guardar
	 * por motivos de espacio
	 */
	public int altaPersona(Persona p) {
		if(p.getNombre().length() >= 11) {
			DaoPersonas daoPersonas = new DaoPersonas();
			return daoPersonas.altaPersonas(p);
		}else {
			return 1;
		}
	}
	
	/**
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 * @throws ArithmeticException
	 */
	public double dividir(double d1, double d2) throws ArithmeticException{
		return d1 / d2;
	}
}
