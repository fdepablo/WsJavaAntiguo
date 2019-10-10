package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import beans.GrupoPersonas;
import beans.Persona;

public class ObjectToJson {
	public static void main(String[] args) throws FileNotFoundException {
		GrupoPersonas grupo = new GrupoPersonas();
		grupo.getPersonas().add(new Persona(1, "Homer", "Simpson", 48));
		grupo.getPersonas().add(new Persona(2, "Lisa", "Simpson", 12));
		grupo.getPersonas().add(new Persona(3, "Bart", "Simpson", 13));
		grupo.getPersonas().add(new Persona(4, "Marge", "Simpson", 40));

		//objeto para serializar y deserializar
		Gson gson = new Gson();
		
		//toJson, convertimos un objeto a json
		String json = gson.toJson(grupo);
		
		System.out.println(json);
		File file = new File("Simpson.txt");
				
		try(PrintWriter pw = new PrintWriter(file)) {
			pw.println(json);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
