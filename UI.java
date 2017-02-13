package com.tarea;

import java.io.*;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args)throws IOException{
    	String opcion = "";
    	boolean salir = false;

        CL clinica = new CL();
        out.println("Bienvenido a su sistema de medicos");

    	while(!salir){
    		out.println("Elija \"m\" para medico, y \"p\" para paciente:\n");
    		opcion = in.readLine();
    		
    		if (opcion.equalsIgnoreCase("m")){
    			menuMedico();
				opcion = in.readLine();
    			switch(Integer.parseInt(opcion)){
    			    case 1:
    			    	opcion = menuCitas();
    			    	if(opcion.equals("1")){
							clinica
    			    	}
    			    	break;
    			    case 2:
    			    	menuExpedientes();
    			    	break;
    			    case 3:
    			    	menuListaPacientes();
    			    	break;
    			    case 4:
    			    	menuPadecimientos();
    			    	break;
					case 5:
						out.println("Muchas gracias");
						salir = true;
    			    default:
    			    	out.println("La opcion escogida es incorrecta. Intente de nuevo.\n");
    			    	break;
    			}
    		}
    	}
    	
    }
    public static void menuMedico()throws IOException{
    	out.println("Escoja la opcion que desee utilizar:");
    	out.println("1. Mostrar listado de citas.");
    	out.println("2. Mostrar listado de expedientes.");
    	out.println("3. Mostrar listado de pacientes.");
    	out.println("4. Mostrar listado de padecimientos.");
        // /n fue removido porque println ya pone la separacion de linea
    }
    
    public static String menuPaciente()throws IOException{
    	String opcion;
    	out.println("Escoja la opcion que desee utilizar:\n");
    	out.println("1.Consulta de expediente");
    	opcion = in.readLine();
    	
    	return opcion;
    }
    public static String menuCitas()throws IOException{
    	String opcion;
    	out.println("Escoja la opcion que desee utilizar:\n");
    	out.println("1.Ver detalle de cita.\n");
    	out.println("2.Ingresar nueva cita.\n");
    	opcion = in.readLine();
    	
    	return opcion;
    }
    
    public static String menuExpedientes()throws IOException{
    	String opcion;
    	out.println("Escoja la opcion que desee utilizar:\n");
    	out.println("1.Ver detalle expediente\n");
    	out.println("2.Ver listado de citas del paciente.\n");
    	out.println("3.Agregar padecimiento al paciente\n");
    	opcion = in.readLine();
    	
    	return opcion;
    }
    
    public static String menuListaPacientes()throws IOException{
    	String opcion;
    	out.println("Escoja la opcion que desee utilizar:\n");
    	out.println("1.Agregar cita a paciente.\n");
    	opcion = in.readLine();
    	
    	return opcion;
    }
    
    public static String menuPadecimientos()throws IOException{
    	String opcion;
    	out.println("Escoja la opcion que desee utilizar:\n");
    	out.println("1.Ver detalle padecimiento.\n");
    	out.println("2.Agregar padecimiento");
    	opcion = in.readLine();
    	
    	return opcion;
    }
    
}
