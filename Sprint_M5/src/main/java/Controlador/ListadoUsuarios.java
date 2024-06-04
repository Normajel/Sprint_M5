package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IUsuarioDAO;
import DAO.UsuarioDAOImpl;
import Modelo.Usuario;

@WebServlet("/listadoUsuarios")
public class ListadoUsuarios extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Obtener la instancia del DAO de usuario
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();

        // Obtener la lista de todos los usuarios
        List<Usuario> listaUsuarios = usuarioDAO.obtenerTodosLosUsuarios();

        // Establecer la lista de usuarios como atributo de solicitud
        request.setAttribute("listausuarios", listaUsuarios);

        // Redirigir a la página JSP para mostrar la lista de usuarios
        request.getRequestDispatcher("/views/Usuario.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
	}
}
