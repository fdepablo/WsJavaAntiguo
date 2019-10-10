package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//por doGet entran las peticiones HTTP Rest
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String password = request.getParameter("pass");
		
		System.out.println(nombre);
		System.out.println(password);
		
		//aqui lo que habria que hacer es hablar con la capa de negocio para
		//que se comunique con la bbdd
		//if("felix".equals(nombre) && "123456".equals(password)) {
		//	response.sendRedirect("inicio.html");//300
		//}else {
		//	response.sendRedirect("error.html");//300
		//}
		response.getWriter().append("Hola caracola");//200 OK
		response.sendError(404);
	}

	//por doPost entras las peticiones http Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
