package presentacion;

import java.util.Scanner;

import beans.Persona;
import negocio.GestorPersonas;

/**
 * 
 * @author Diego
 *
 */
public class Main {

	/**
	 * Funcion de entrada
	 * @param args los argumentos de entrada
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//pedir una persona a dar de alta, al usuario
		Persona p = new Persona();
		p.setId(1);
		p.setNombre("Ana");
		p.setPeso(56.6);
		
		GestorPersonas gp = new GestorPersonas();
		int resultado = gp.altaPersona(p);
		if(resultado == 1) {
			System.out.println("Por favor el numero maximo de caractes para el nombre es de 10");
		}else if(resultado == -1 ){
			System.out.println("La capacidad esta llena");
		}else {
			System.out.println("Usuario introducido correctamente");
		}
	}

}
