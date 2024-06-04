package Modelo;

public class Profesional {

    private String nombre;
    private String apellido;
    private String titulo;
    private String especialidad;

    public Profesional(String nombre, String apellido, String titulo, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.especialidad = especialidad;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", titulo='" + titulo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
