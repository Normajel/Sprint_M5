package Controlador;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Conexion.Conexion;

public class CrearCapacitacionTest {

    @BeforeAll
    public static void setUp() {
        Conexion.getConnection(); // Establece la conexión antes de las pruebas
    }

    @Test
    public void testObtenerCapacitaciones() {
        List<CrearCapacitacion> capacitaciones = CrearCapacitacion.obtenerCapacitaciones();
    }

    @Test
    public void testRegistrarCapacitacion() {
        CrearCapacitacion nuevaCapacitacion = new CrearCapacitacion();
        nuevaCapacitacion.setNombre("Nueva Capacitación");
        nuevaCapacitacion.setDetalle("Detalle de la nueva capacitación");

        boolean registrado = CrearCapacitacion.registrarCapacitacion(nuevaCapacitacion);
        assertTrue(registrado, "La nueva capacitación debe ser registrada exitosamente");
    }

    @AfterAll
    public static void tearDown() {
        Conexion.closeConnection(); // Cierra la conexión después de las pruebas
    }
}
