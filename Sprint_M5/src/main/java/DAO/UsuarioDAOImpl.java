package DAO;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Usuario;
import Conexion.Conexion;

public class UsuarioDAOImpl implements IUsuarioDAO {
	
    private Connection conn = null;

    // Método para inyectar la conexión en la clase
    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        // Implementación para agregar un usuario a la base de datos
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        // Implementación para actualizar un usuario en la base de datos
    }

    @Override
    public void eliminarUsuario(String rut) {
        // Implementación para eliminar un usuario de la base de datos
    }

    @Override
    public Usuario obtenerUsuarioPorRut(String rut) {
        // Implementación para obtener un usuario por su ID de la base de datos
        return null;
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        Statement stm = null;
        ResultSet rs = null;
        
        String sql = "select id, rut, clave FROM usuario;";
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try {
			conn = Conexion.getConnection();
			System.out.println("desde DAO: "+ conn);
			
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("id"), 
                                          rs.getString("rut"),
                                          rs.getString("clave")));
            }
            
			rs.close();
			stm.close();
			//conn.close();
            
        } catch (SQLException e) {
        	// Manejar la excepción adecuadamente, por ejemplo, 
        	// lanzando una excepción personalizada o devolviendo una lista vacía
            e.printStackTrace();
        } 

        return usuarios;
    }

	public boolean ingresar(List<Usuario> usuario) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ingresar(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}


