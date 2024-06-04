package DAO;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.junit.jupiter.api.Test;

import Modelo.Usuario;

public class UsuarioDAOImplTest {

    @Test
    void testObtenerTodosLosUsuarios() throws SQLException {
        // Simular la conexión a la base de datos y el Statement
        Connection conn = mock(Connection.class);
        Statement stm = mock(Statement.class);
        
        // Crear un ResultSet simulado con datos de usuarios
        ResultSet rs = mock(ResultSet.class);
        when(stm.executeQuery(anyString())).thenReturn(rs);
        when(rs.next()).thenReturn(true).thenReturn(false); // Simular un usuario en el ResultSet
        when(rs.getInt("id")).thenReturn(1);
        when(rs.getString("rut")).thenReturn("12345678-9");
        when(rs.getString("clave")).thenReturn("password");

        // Simular la creación del Statement a partir de la conexión
        when(conn.createStatement()).thenReturn(stm);

        // Crear una instancia de UsuarioDAOImpl y llamar al método obtenerTodosLosUsuarios()
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
        usuarioDAO.setConnection(conn); // Inyectar la conexión simulada
        List<Usuario> usuarios = usuarioDAO.obtenerTodosLosUsuarios();

        // Verificar que se obtenga el usuario esperado en la lista
        assertEquals(1, usuarios.size());
        Usuario usuario = usuarios.get(0);
        assertEquals(1, usuario.getId());
        assertEquals("12345678-9", usuario.getRut());
        assertEquals("password", usuario.getClave());
    }
}
