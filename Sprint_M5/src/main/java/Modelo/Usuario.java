package Modelo;

public class Usuario {
	
	private int id;
	private String rut;
	private String clave;
	
	public Usuario() {
		super();		
	}
	
	
	public Usuario(int id, String rut, String clave) {
		super();
		this.id = id;
		this.rut = rut;
		this.clave = clave;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}

}
