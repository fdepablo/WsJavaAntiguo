package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _00_Conexion {

	public static void main(String[] args) {
		
		// Paso 1: Cargar el driver Solo hace falta hacerlo una vez en todo el programa
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		
		// Paso 2: Establecer conexi�n con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
		String user = "root";
		String pass = ""; // sustituye por la contrase�a que especificaste durante la instalaci�n de MySQL.
		Connection con;
		try {
			con = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexi�n con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexi�n con la Base de datos");
		
		// Paso 3: Interactuar con la BD (todav�a pendiente)
		
		
		// Paso 4: Cerrar la conexi�n
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexi�n con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha cerrado la base de datos");

	}

}