package DAO;

import java.util.List;
import Modelo.Usuario;

public interface IUsuarioDAO {
	
    public void agregarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(String rut);
    public Usuario obtenerUsuarioPorRut(String rut);
    public List<Usuario> obtenerTodosLosUsuarios();
	public boolean ingresar(Usuario usuario);


}


