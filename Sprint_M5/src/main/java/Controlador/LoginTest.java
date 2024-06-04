package Controlador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testValidarCredenciales_CredencialesCorrectas() {
        // Arrange
        String usuario = "admin";
        String clave = "admin123";
        Login login = new Login(usuario, clave);

        // Act
        boolean resultado = login.validarCredenciales();

        // Assert
        assertTrue(resultado, "Las credenciales son válidas");
    }

    @Test
    void testValidarCredenciales_UsuarioIncorrecto() {
        // Arrange
        String usuario = "usuarioincorrecto";
        String clave = "admin123";
        Login login = new Login(usuario, clave);

        // Act
        boolean resultado = login.validarCredenciales();

        // Assert
        assertFalse(resultado, "El usuario es incorrecto");
    }

    @Test
    void testValidarCredenciales_ClaveIncorrecta() {
        // Arrange
        String usuario = "admin";
        String clave = "claveincorrecta";
        Login login = new Login(usuario, clave);

        // Act
        boolean resultado = login.validarCredenciales();

        // Assert
        assertFalse(resultado, "La clave es incorrecta");
    }
}
