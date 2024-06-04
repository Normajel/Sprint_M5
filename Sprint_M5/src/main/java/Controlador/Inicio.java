package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Inicio extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public Inicio() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Reenvía a inicio.jsp ubicado en la carpeta webapp
        getServletContext().getRequestDispatcher("/Grupal5M5/views/inicio.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Información de Carga</title></head><body><h1>Información de Carga de Clientes</h1></body></html>");
    }
}