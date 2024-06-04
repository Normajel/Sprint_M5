package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspException;

import Conexion.Conexion;

public class CrearCapacitacion {

    private int id;
    private String nombre;
    private String detalle;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    // Método para obtener todas las capacitaciones
    public static List<CrearCapacitacion> obtenerCapacitaciones() {
        List<CrearCapacitacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM capacitaciones";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CrearCapacitacion capacitacion = new CrearCapacitacion();
                capacitacion.setId(rs.getInt("id"));
                capacitacion.setNombre(rs.getString("nombre"));
                capacitacion.setDetalle(rs.getString("detalle"));
                lista.add(capacitacion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Método para registrar una nueva capacitación
    public static boolean registrarCapacitacion(CrearCapacitacion capacitacion) {
        String sql = "INSERT INTO capacitaciones (nombre, detalle) VALUES (?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, capacitacion.getNombre());
            ps.setString(2, capacitacion.getDetalle());
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

	public static void setCapacitaciones(List<CrearCapacitacion> listaCapacitaciones) {
		// TODO Auto-generated method stub
		
	}
}
