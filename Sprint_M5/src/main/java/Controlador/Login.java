package Controlador;;

public class Login {

    private String usuario;
    private String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean validarCredenciales() {
        // Aquí podrías implementar la lógica para validar las credenciales
        // Por ejemplo, consultar una base de datos o comparar con credenciales almacenadas
        // En este ejemplo, simplemente se compara si el usuario es "admin" y la clave es "admin123"
        return "admin".equals(usuario) && "admin123".equals(clave);
    }
}
