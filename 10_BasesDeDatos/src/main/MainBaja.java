package main;

import negocio.GestorPersonas;

public class MainBaja {
	public static void main(String[] args) {
		GestorPersonas gp = new GestorPersonas();
		
		boolean baja = gp.baja(1);
		if(baja){
			System.out.println("La persona se ha dado de baja");
		}else{
			System.out.println("La persona NO se ha dado de baja");
		}
	}
}
