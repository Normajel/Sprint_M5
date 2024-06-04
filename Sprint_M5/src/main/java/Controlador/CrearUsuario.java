package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String rut = request.getParameter("rut");
        String clave = request.getParameter("clave");

        // Validar los datos ingresados
        if (!validarDatos(rut, clave)) {
            // Si alguno de los campos está vacío o no es válido, redirigir de vuelta al formulario con un mensaje de error
            request.setAttribute("error", "Por favor ingrese un RUT y una clave válidos.");
            request.getRequestDispatcher("crearUsuario.jsp").forward(request, response);
            return;
        }

        // Aquí deberías realizar la lógica para crear el usuario con los datos recibidos
        // (Por ahora, supongamos que se ha creado exitosamente)

        // Redirigir a una página de éxito después de la creación del usuario
        response.sendRedirect("paginaDeExito.jsp"); // Cambia "paginaDeExito.jsp" por la página que desees mostrar después de crear el usuario
    }
    
    private boolean validarDatos(String rut, String clave) {
        // Verificar si el RUT y la clave no están vacíos
        return rut != null && !rut.isEmpty() && clave != null && !clave.isEmpty();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} 
}