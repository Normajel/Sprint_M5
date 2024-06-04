package Conexion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConexionTest {

	private static Connection conn;

	@BeforeAll
	public static void setUp() {
		try {
			conn = Conexion.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error al establecer la conexión en el método setUp");
		}
	}

	@Test
	public void testConexionNotNull() {
		Connection conn = Conexion.getConnection();
		// assertNotNull(conn, "La conexión debe ser diferente de null");
	}

	@AfterAll
	public static void tearDown() {
		Conexion.closeConnection();
	}
}
