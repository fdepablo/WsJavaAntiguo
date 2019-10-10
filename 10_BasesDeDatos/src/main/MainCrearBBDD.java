package main;

import negocio.GestorPersonas;

public class MainCrearBBDD {
	public static void main(String[] args) {
		GestorPersonas gestorPersonas = new GestorPersonas();
		boolean alta = gestorPersonas.crearBBDD();
		if(alta){
			System.out.println("La BBDD se ha creado");
		}else{
			System.out.println("La BBDD NO se ha creado");
		}
	}
}
