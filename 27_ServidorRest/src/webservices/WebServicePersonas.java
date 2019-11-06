package webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import beans.Mensaje;
import beans.Persona;

@Path("personas")
public class WebServicePersonas {
	
	@GET
	@Path("xml")
	@Produces({"application/xml"})
	public Persona personaXML() {
		Persona p = new Persona(1,"RODOLFO", "LANGOSTINO", 47);
		//al retornar la p las librerias jersey lo convierten automaticamente a xml
		return p;	
	}
	
	@GET
	@Path("json")
	@Produces({"application/json"})
	public Persona personaJSON() {
		Persona p = new Persona(1,"RODOLFO", "LANGOSTINO", 47);
		//al retornar la p las librerias jersey lo convierten automaticamente a json
		return p;	
	}	

	
	//********************************************************************************
	//Fuera de temario, pero para los más curiosos :)
	@POST
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public Persona altaPersona(Persona p) {
		System.out.println(p);	
		//ahora habria que darlo de alta en bbdd
		p.setId(455);
		//devolvemos el objeto a nuestro cliente en formato json
		return p;	
	}	
	
	@DELETE
	@Path("/{id}")
	@Produces({"application/json"})
	public String borrarPersona(@PathParam("id") String id) {
		System.out.println("ID a borrar: " + id);
		//ahora habria que lanzar las queries a bbdd para borrar dicho id
		return id;
	}
	
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public Persona modificarPersona(@PathParam("id") int id, Persona p) {
		System.out.println("ID a modificar: " + id);
		System.out.println("Persona a modificar: " + p);
		p.setId(id);
		//ahora habria que modificarlo en bbdd
		
		//devolvemos el objeto a nuestro cliente en formato json
		return p;	
	}	
}
