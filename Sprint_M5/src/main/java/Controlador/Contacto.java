package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public Contacto() {
        super();
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        		throws ServletException, IOException {
        	getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        		throws ServletException, IOException {
            // Procesar datos del formulario enviado por el cliente
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String consulta = request.getParameter("consulta");

            // Aquí puedes procesar los datos, por ejemplo, guardarlos en una base de datos, enviar un correo electrónico, etc.

            // Redirigir al usuario a la página de respuesta
            //response.sendRedirect("RespuestaContacto?nombre=" + URLEncoder.encode(nombre, "UTF-8") + "&email=" + URLEncoder.encode(email, "UTF-8"));
        }
    }

