package com.tarea;

import java.io.*;

public class Paciente {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    private String numeroSeguroSocial;
    public String nombreCompleto;
    private String direccion;
    private String email;
    private String telefono;
    
    public Paciente(String pSS, String pNCompleto, String pEmail){
    	numeroSeguroSocial = pSS;
    	nombreCompleto = pNCompleto;
    	email = pEmail;
    	direccion = " ";
    	telefono = "XXXXXXXX";
    }
    public void agregarDireccion(String pDir){
    	direccion = pDir;
    }
    public void agregarTelefono(String pTel){
    	telefono = pTel;
    }
    public String detallePaciente()throws IOException{
    	return "Numero Seguro Social: " + numeroSeguroSocial + ".\n" + "Nombre: " + nombreCompleto + ".";
    }
}
