package webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import beans.Mensaje;

/*
 *  La anotación @Path indica la ruta que debe seguir el usuario 
 *  para acceder al servicio web. También puede especificarse por métodos. 
 *  Lo comprenderás mejor cuando veamos cómo se accede a un servicio web REST.
 */
@Path("mensaje")
public class WebService {
	/*
	 * La anotación @GET indica el método HTTP que se utilizará para recibir 
	 * peticiones. 
	 * El método mostrarMensaje atenderá peticiones de clientes de tipo GET, 
	 * y también podemos utilizar @POST para atender peticiones de tipo POST.
	 * 
	 * La anotación @Produces indica el tipo MIME de la respuesta del servidor.
	 */
	@GET
	@Produces({"text/plain"})
	public String mostrarMensaje() {
		Mensaje msg = new Mensaje("Hola amigo");
		return msg.getTexto();
	}
}
