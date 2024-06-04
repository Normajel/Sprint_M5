package Controlador;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InicioTest {

    @Test
    void testDoGet() throws ServletException, IOException {
        // Crear mocks de los objetos necesarios
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        // Configurar comportamiento simulado
        when(request.getServletContext()).thenReturn(servletContext);
        when(servletContext.getRequestDispatcher("/Grupal5M5/views/inicio.jsp")).thenReturn(dispatcher);

        // Ejecutar método a probar
        new Inicio().doGet(request, response);

        // Verificar que los métodos adecuados fueron llamados
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoPost() throws ServletException, IOException {
        // Crear mocks de los objetos necesarios
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        // Ejecutar método a probar
        new Inicio().doPost(request, response);

        // Verificar que se escribe la respuesta correcta
        verify(response).setContentType("text/html;charset=UTF-8");
        verify(response).getWriter().println("<html><head><title>Información de Carga</title></head><body><h1>Información de Carga de Clientes</h1></body></html>");
    }
}
