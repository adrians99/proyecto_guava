import java.io.*;

public class CL {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
	{
	 Medico[]  listadoMedicos = new Medico[5];
	 Paciente[] listadoPacientes = new Paciente[10];
	 Cita[] listadoCitas = new Cita[10];
	 Padecimiento[] listadoPadecimientos = new Padecimiento[10];
	 ExpedientePaciente[] listadoExpedientes = new ExpedientePaciente[10];
	 
	 Medico medico1 = new Medico("1", "Casimiro Casco", "ccasco@clinica.com", "endocrinologo");
	 Medico medico2 = new Medico("2", "Benito Juarez", "bjuarez@clinica.com", "anestesiologo");
	 Medico medico3 = new Medico("3", "Teresa Sandino", "tsandino@clinica.com", "ortopedista");
	 Medico medico4 = new Medico("4", "Lucia Fernanda Bergoglio", "luciferbergoglio@clinica.com", "forense");
	 Medico medico5 = new Medico("5", "Charlie Waffles", "cwaffles@clinica.com", "pediatra");
	 
	 medico1.crearClave("12345");
	 medico2.crearClave("67890");
	 medico3.crearClave("01234");
	 medico4.crearClave("56789");
	 medico5.crearClave("98765");
	 
	 listadoMedicos[0] = medico1;
	 listadoMedicos[1] = medico2;
	 listadoMedicos[2] = medico3;
	 listadoMedicos[3] = medico4;
	 listadoMedicos[5] = medico5;
	 
	 Paciente paciente1 = new Paciente("12345", "Walter Mercado", "wmercado@gmail.com");
	 Paciente paciente2 = new Paciente("67890", "Kim Kardashian", "kkardashian@outlook.com");
     Paciente paciente3 = new Paciente("98765","Van Damme","vdamme@yahoo.com");
	 Paciente paciente4 = new Paciente("43210","Tom Cruise","tcruise@aol.com");
	 Paciente paciente5 = new Paciente("95681","Albert Einstein","aeinstein@hotmail.com");
	 Paciente paciente6 = new Paciente("24653","Max Plank","mplank@gmail.com");
	 Paciente paciente7 = new Paciente("78549","Ernest Rutherford","erutherford@yahoo.com");
	 Paciente paciente8 = new Paciente("48896","Georges Lemaitre","glemaitre@aol.com");
	 Paciente paciente9 = new Paciente("31456","Stephen Hawking","shawking@hotmail.com");
	 Paciente paciente10 = new Paciente("97564","Marie Curie","mcurie@hotmail.com");
	 
	 listadoPacientes[0] = paciente1;
	 listadoPacientes[1] = paciente2;
	 listadoPacientes[2] = paciente3;
	 listadoPacientes[3] = paciente4;
	 listadoPacientes[4] = paciente5;
	 listadoPacientes[5] = paciente6;
	 listadoPacientes[6] = paciente7;
	 listadoPacientes[7] = paciente8;
	 listadoPacientes[8] = paciente9;
	 listadoPacientes[9] = paciente10;
	 
	 Cita cita1 = new Cita("1","02/03/2004", paciente1.nombreCompleto,medico1.nombreCompleto);
	 Cita cita2 = new Cita("2","01/02/2003",paciente2.nombreCompleto,medico2.nombreCompleto);
	 Cita cita3 = new Cita("3","03/04/2005",paciente3.nombreCompleto,medico3.nombreCompleto);
	 Cita cita4 = new Cita("4","05/06/2007",paciente4.nombreCompleto,medico4.nombreCompleto);
	 Cita cita5 = new Cita("5","06/07/2008",paciente5.nombreCompleto,medico5.nombreCompleto);
	 Cita cita6 = new Cita("6","08/09/2010",paciente6.nombreCompleto,medico5.nombreCompleto);
	 Cita cita7 = new Cita("7","09/10/2011",paciente7.nombreCompleto, medico4.nombreCompleto);
	 Cita cita8 = new Cita("8","10/11/2012",paciente8.nombreCompleto,medico3.nombreCompleto);
	 Cita cita9 = new Cita("9","11/12/2013",paciente9.nombreCompleto,medico2.nombreCompleto);
	 Cita cita10 = new Cita("10","12/01/2014",paciente10.nombreCompleto,medico1.nombreCompleto);
	 
	 listadoCitas[0] = cita1;
	 listadoCitas[1] = cita1;
	 listadoCitas[2] = cita1;
	 listadoCitas[3] = cita1;
	 listadoCitas[4] = cita1;
	 listadoCitas[5] = cita1;
	 listadoCitas[6] = cita1;
	 listadoCitas[7] = cita1;
	 listadoCitas[8] = cita1;
	 listadoCitas[9] = cita1;
	 
	 Padecimiento padecimiento1 = new Padecimiento("1", "toxoplasmosis");
	 Padecimiento padecimiento2 = new Padecimiento("2", "meningitis");
	 Padecimiento padecimiento3 = new Padecimiento("3", "lepra");
	 Padecimiento padecimiento4 = new Padecimiento("4", "polio");
	 Padecimiento padecimiento5 = new Padecimiento("5", "tuberculosis");
	 Padecimiento padecimiento6 = new Padecimiento("6", "cancer");
	 Padecimiento padecimiento7 = new Padecimiento("7", "VIH");
	 Padecimiento padecimiento8 = new Padecimiento("8", "gripe");
	 Padecimiento padecimiento9 = new Padecimiento("9", "dengue");
	 Padecimiento padecimiento10 = new Padecimiento("10", "hepatitis");
	 
	 listadoPadecimientos[0] = padecimiento1;
	 listadoPadecimientos[1] = padecimiento2;
	 listadoPadecimientos[2] = padecimiento3;
	 listadoPadecimientos[3] = padecimiento4;
	 listadoPadecimientos[4] = padecimiento5;
	 listadoPadecimientos[5] = padecimiento6;
	 listadoPadecimientos[6] = padecimiento7;
	 listadoPadecimientos[7] = padecimiento8;
	 listadoPadecimientos[8] = padecimiento9;
	 listadoPadecimientos[9] = padecimiento10;
	 
	 
  }
	public static void verListadoPacientes(Paciente[] pListado)throws IOException{
    	for(int i = 0; i<pListado.length;i++){
    		pListado[i].detallePaciente();
        }
	}
    public static void verListadoPadecimiento(Padecimiento[] pPadecimiento)throws IOException{
    	for(int i = 0; i<pPadecimiento.length;i++){
    		pPadecimiento[i].detallePadecimiento();
    	}
    }
    

}