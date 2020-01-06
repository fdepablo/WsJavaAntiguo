package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_Insertar {

	public static void main(String[] args) {
		
		// Paso 1: Cargar el driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		
		// Paso 2: Establecer conexión con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
		String user = "root";
		String pass = "";
		Connection con;
		try {
			con = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");
		
		// Paso 3: Interactuar con la BD 
		try {
			String nombre = "DELGADO PEREZ CARLOS";
			int edad = 34;
			double peso = 78.9;
			//esta menera NO se debe usar nunca, se debe usar SIEMPRE
			//preparedStatement
			String sql = "INSERT INTO PERSONAS " +
				"(NOMBRE, EDAD, PESO) " +
				"VALUES ('" + nombre + "', '" + edad + "', '" + peso +  "');";
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			Statement sentencia;
			sentencia = con.createStatement();
			int afectados = sentencia.executeUpdate(sql);
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: "+afectados);
		} catch (SQLException e) {
			System.out.println("Error al añadir nuevo cliente");
			System.out.println(e.getMessage());
		}
		
		
		// Paso 4: Cerrar la conexión
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha cerrado la base de datos");

	}

}