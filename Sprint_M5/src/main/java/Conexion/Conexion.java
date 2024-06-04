package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	// Propiedades
	private static Connection conn = null;

	// Constructor privado
	private Conexion() {
		String url = "jdbc:mysql://localhost:3306/prevencion_riesgos";
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "212926";

		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			}
		} catch (Exception ex) {
			// Handle errors for Class.forName;
			ex.printStackTrace();
		}
	}

	// Método para obtener la conexión
	public static Connection getConnection() {
		if (conn == null) {
			new Conexion();
			System.out.println("Se creo la conexion"); // DEBUG
			System.out.println("Metodo getConnection: " + conn);

			return conn;
		} else {
			System.out.println("Retorno conexion..."); // DEBUG
			return conn;
		}
	}

	// Método para cerrar la conexión
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Conexión cerrada"); // DEBUG
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Error al cerrar la conexión con la base de datos.", e);
			} finally {
				conn = null;
			}
		}
	}
}
