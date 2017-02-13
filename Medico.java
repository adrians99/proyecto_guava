package com.tarea;

public class Medico {
	private String codigo;
	public String nombreCompleto;
	private String email;
	private String especialidad;
	public String clave;
	
	public Medico(String pCodigo, String pNombreCompleto, String pEmail, String pEspecialidad){
		codigo = pCodigo;
		nombreCompleto = pNombreCompleto;
		email = pEmail;
		especialidad = pEspecialidad;
	}
	public void crearClave(String pClave){
		clave = pClave;
	}
	
	public String verificarClave(){
		return clave;
	}

}
