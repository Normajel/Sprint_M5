package Controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.CrearCapacitacion;

@WebServlet("/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ListarCapacitacion() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CrearCapacitacion> listaCapacitaciones = CrearCapacitacion.obtenerCapacitaciones();
        request.setAttribute("listaCapacitaciones", listaCapacitaciones);
        getServletContext().getRequestDispatcher("/listarCapacitacion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String detalle = request.getParameter("detalle");

        CrearCapacitacion nuevaCapacitacion = new CrearCapacitacion();
        nuevaCapacitacion.setNombre(nombre);
        nuevaCapacitacion.setDetalle(detalle);

        boolean registrado = CrearCapacitacion.registrarCapacitacion(nuevaCapacitacion);

        if (registrado) {
            response.sendRedirect(request.getContextPath() + "/ListarCapacitacion");
        } else {
            response.getWriter().write("Error al registrar la capacitación.");
        }
    }
}
