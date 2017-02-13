import java.io.*;

public class ExpedientePaciente {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    private String idExpediente;
    private String fechaNacimiento;
    private String nSeguroSocial;
    private String tipoSangre;
    public Padecimiento[] padecimientosSufridos = new Padecimiento[50];
    public Cita[] citasPaciente = new Cita[50];
    
    
    public ExpedientePaciente(String pID, String pNSS, String pFechaNac){
    	idExpediente = pID;
        nSeguroSocial = pNSS;
        fechaNacimiento = pFechaNac;
        tipoSangre = " ";
    }
    
    public void verExpediente()throws IOException{
    	out.println("Id Expediente: " + idExpediente + ".");
    	out.println("Fecha de Nacimiento: " + fechaNacimiento + ".");
    	out.println("Numero Seguro Social: " + nSeguroSocial + ".");
    	out.println("Tipo de Sangre: " + tipoSangre + ".");
    	for(int i = 0; i<padecimientosSufridos.length;i++){
    		out.println(padecimientosSufridos[i].obtenerNombrePad());
    	}
    }
    
    public void agregarPadecimiento(Padecimiento pPad, int pInd, String pCod)throws IOException{
    	if(pPad.obtenerIdPad() == pCod){
    		padecimientosSufridos[pInd] = pPad;
    	}else{
    		out.println("El nombre del padecimiento no corresponde con el codigo asignado.\n");
    	}
    }
    
    public void verCitasPaciente(){
    	for(int i = 0;i<citasPaciente.length; i++){
    		out.println("ID cita " + citasPaciente[i].obtenerIdCita() + ".\n");
    		out.println("Fecha cita " + citasPaciente[i].obtenerFechaCita() + ".\n" );
    	}
    }
    
}
