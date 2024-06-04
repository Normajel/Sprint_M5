package Modelo;

public class Administrativo {

    private String nombre;
    private String apellido;
    private String cargo;

    public Administrativo(String nombre, String apellido, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
