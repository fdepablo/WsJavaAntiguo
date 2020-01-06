package test;

import java.util.List;

import entidades.Persona;
import negocio.GestorPersonas;

public class TestObtener {
	public static void main(String[] args) {
		GestorPersonas gp = new GestorPersonas();
		Persona persona = gp.obtener(1);
		System.out.println(persona);
		
		System.out.println("*******************");
		
		List<Persona> listaPersonas = gp.listar();
		for(Persona p : listaPersonas){
			System.out.println(p);
		}
	}
}
