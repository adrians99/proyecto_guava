import java.io.*;

public class Padecimiento {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    private String idPadecimiento;
    private String nombrePadecimiento;
    private String descripcion;
    
    public Padecimiento(String pID, String pNPadecimiento){
    	idPadecimiento = pID;
    	nombrePadecimiento = pNPadecimiento;
    	descripcion = " ";
    }
    public String detallePadecimiento()throws IOException{
    	return "ID padecimiento: " + idPadecimiento + ".\n" + "Nombre del padecimiento: " + nombrePadecimiento +".";
    }
    public void agregarDescripcion(String pDesc){
    	descripcion = pDesc;
    }
    
    public String obtenerIdPad(){
    	return idPadecimiento;
    }
    
    public String obtenerNombrePad(){
    	return nombrePadecimiento;
    }
}
