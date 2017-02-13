import java.io.*;
public class Cita {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    private String idCita;
    private String fecha;
    private String paciente;
    private String medico;
    private String descripcion;
    private String resultado;
    
    public Cita(String pID, String pFecha, String pPaciente, String pMedico){
    	idCita = pID;
    	fecha = pFecha;
    	paciente = pPaciente;
    	medico = pMedico;
    	descripcion = " ";
    	resultado = " ";
    }
    public void agregarDescripcion(String pDesc){
    	descripcion = pDesc;
    }
    public void agregarResultado(String pResul){
    	resultado = pResul;
    }
    public String verCita()throws IOException{
    	return idCita + "-" + fecha + "-" + paciente + "-" + medico + "-" + descripcion + "-" + resultado;
    }
    public String obtenerIdCita(){
    	return idCita;
    }
    public String obtenerFechaCita(){
    	return fecha;
    }
}
