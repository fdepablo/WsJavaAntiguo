package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Persona;
import modelo.negocio.GestorPersona;

/**
 * Servlet implementation class ControladorAltaPersona
 */
@WebServlet("/altaPersona")
public class ControladorAltaPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//como el formulario hace un metodo post, entramos por aqui
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String peso = request.getParameter("peso");
		
		int iEdad = Integer.parseInt(edad);
		int iPeso = Integer.parseInt(peso);
		
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setPeso(iPeso);
		p.setEdad(iEdad);
		
		//habria que comunicarse con la capa gestora dentro del modelo
		GestorPersona gp = new GestorPersona();
		int respuesta = gp.alta(p);
		switch (respuesta) {
		case -2:
			//caso nombre < 3
			break;
		case -1:
			//caso edad <19
			break;
		case 0:
			//caso error conexión
			break;
		default:
			// en caso de que se haya dado de alta
			
			break;
		}
		
		doGet(request, response);
	}

}
