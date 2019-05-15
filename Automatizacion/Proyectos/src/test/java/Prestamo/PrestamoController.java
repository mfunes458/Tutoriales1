package Prestamo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;



public class PrestamoController {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    //ATRIBUTOS-OBJETOS
    private PrestamoModelo prestamo;
    
    
    
    
    public String getFechaPrestamo(String linea)
    {
    
        String fechaActivacion=" ";
        
       try {
             Connection con=null;
             Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2); 
            CallableStatement cs = null;  
             Statement st=con.createStatement();
              
             
             	        try {
	        	  cs = con.prepareCall("{? = call  pp_pp_server.get_emergency_loan(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
 	        	     
 	        	    cs.registerOutParameter(1, Types.NUMERIC); 
 	        	    cs.setString(2,"549"+linea);
 	        	    cs.setInt(3,1); 
                            cs.registerOutParameter(4, Types.NUMERIC);
                            cs.registerOutParameter(5, Types.VARCHAR);  
                            cs.registerOutParameter(6, Types.VARCHAR);
                            cs.registerOutParameter(7, Types.NUMERIC); 
                            cs.registerOutParameter(8, Types.NUMERIC); 
                            cs.registerOutParameter(9, Types.NUMERIC);   
 	        	    cs.registerOutParameter(10, Types.VARCHAR);
                            cs.registerOutParameter(11, Types.NUMERIC); 
                            cs.registerOutParameter(12, Types.NUMERIC); 
                            cs.registerOutParameter(13, Types.NUMERIC);                
                            cs.registerOutParameter(14, Types.VARCHAR);    
                            cs.registerOutParameter(15, Types.NUMERIC);    
                            cs.registerOutParameter(16, Types.NUMERIC);    
                            cs.registerOutParameter(17, Types.VARCHAR);           
                                             
	            cs.execute(); 
	            //se recupera el resultado de la funcion pl/sql
	            int  resultado = cs.getInt(1);
                     fechaActivacion=cs.getString(6);
                    JOptionPane.showMessageDialog(null,"La fecha de Acreditacion es "+" "+fechaActivacion);
	            
	            if(resultado==0)
	            {
	            	          JOptionPane.showMessageDialog(null,"Posee Prestamo");
	            	
	            }else
	            {
	            JOptionPane.showMessageDialog(null,"No tiene  prestamo");
	            	
	            }
	            
			} catch (SQLException e1) {
				 
				e1.printStackTrace();
			}
                         
            con.close();
         } //main
         catch (SQLException ex) {
            System.out.println(ex.toString());
         }
             
    return fechaActivacion;
    }
    
    
    
             
   
    
    
    
    
    //Devolver Objeto Prestamo
    public PrestamoModelo devolverObjPrestamo(String linea)
    {
    
       PrestamoModelo prestamo=null;
        
       try {
             Connection con=null;
             Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2); //ccard
            CallableStatement cs = null;  
             Statement st=con.createStatement();
              
             
             	        try {
	        	  cs = con.prepareCall("{? = call  pp_pp_server.get_emergency_loan(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
 

//        
//        	        	     (RESULT)	NUMBER		
//                                    SUBID	VARCHAR2	IN OUT	
//                                    OPERATORID	NUMBER	IN	
//                                    SRRID	NUMBER	OUT	
//                                    CHARGEDATE	VARCHAR2	OUT	
//                                    ACCREDITATIONDATE	VARCHAR2	OUT	
//                                    SERVICEFLAG	NUMBER	OUT	
//                                    DEBITAMOUNT	NUMBER	OUT	
        
 	        	    cs.registerOutParameter(1, Types.NUMERIC); //RESULT
 	        	    cs.setString(2,"549"+linea);//SUBID
 	        	    cs.setInt(3,0); //OPERATORID
                            cs.registerOutParameter(4, Types.NUMERIC);//SRRID
                            cs.registerOutParameter(5, Types.VARCHAR);  //CHARGEDATE
                            cs.registerOutParameter(6, Types.VARCHAR);//ACCREDITATIONDATE
                            cs.registerOutParameter(7, Types.NUMERIC); //SERVICEFLAG
                            cs.registerOutParameter(8, Types.NUMERIC); //DEBITAMOUNT
                            
//                            FLAGFORM	NUMBER	OUT	
//USERFORM	VARCHAR2	OUT	
//CURRENTACCCREDITAMT	NUMBER	OUT	
//CURRENTACCSERVICECOST	NUMBER	OUT	
//SERVICECOSTCHARGED	NUMBER	OUT	
//FREESERVICECOSTDATE	VARCHAR2	OUT	
//LOANTIMELOANAMOUNT	NUMBER	OUT	
//LOANTIMESERVICECOST	NUMBER	OUT	
//LOANTIMEORDERDISCOUNT	VARCHAR2	OUT	
        
                            cs.registerOutParameter(9, Types.NUMERIC);  //FLAGFORM 
 	        	    cs.registerOutParameter(10, Types.VARCHAR);//USERFORM
                            cs.registerOutParameter(11, Types.NUMERIC); //CURRENTACCCREDITAMT
                            cs.registerOutParameter(12, Types.NUMERIC); //CURRENTACCSERVICECOST
                            cs.registerOutParameter(13, Types.NUMERIC); //SERVICECOSTCHARGED  
                            cs.registerOutParameter(14, Types.VARCHAR);   //FREESERVICECOSTDATE 
                            cs.registerOutParameter(15, Types.NUMERIC);    //LOANTIMELOANAMOUNT
                            cs.registerOutParameter(16, Types.NUMERIC);    //LOANTIMESERVICECOST
                            cs.registerOutParameter(17, Types.VARCHAR);    //LOANTIMEORDERDISCOUNT  
                                             
	            cs.execute(); 
                    
                      
                    
                    //Creo objeto con todos los atributos
                    prestamo=new PrestamoModelo();  
                    prestamo.setRESULT(cs.getInt(1));
                    prestamo.setSUBID(linea);
                    prestamo.setOPERATORID(0);
                    prestamo.setSRRID(cs.getInt(4));
                    prestamo.setCHARGEDATE(cs.getString(5));
                    prestamo.setACCREDITATIONDATE(cs.getString(6));
                    prestamo.setSERVICEFLAG(cs.getInt(7));
                    prestamo.setDEBITAMOUNT(cs.getInt(8));
                    prestamo.setFLAGFORM(cs.getInt(9));
                    prestamo.setUSERFORM(cs.getString(10));
                    prestamo.setCURRENTACCCREDITAMT(cs.getInt(11));
                    prestamo.setCURRENTACCSERVICECOST(cs.getInt(12));
                    prestamo.setSERVICECOSTCHARGED(cs.getInt(13));
                    prestamo.setFREESERVICECOSTDATE(cs.getString(14));
                    prestamo.setLOANTIMELOANAMOUNT(cs.getInt(15));
                    prestamo.setLOANTIMESERVICECOST(cs.getInt(16));
                    prestamo.setLOANTIMEORDERDISCOUNT(cs.getString(17));
                    
                    
// private String FREESERVICECOSTDATE;//	VARCHAR2	OUT	
//private int LOANTIMELOANAMOUNT;//	NUMBER	OUT	
//private int LOANTIMESERVICECOST;//	NUMBER	OUT	
//private String LOANTIMEORDERDISCOUNT;//	VARCHAR2	OUT	
                    
                                    
	            
			} catch (SQLException e1) {
				 
				e1.printStackTrace();
			}
                         
            con.close();
         } //main
         catch (SQLException ex) {
        	 System.out.println(ex.toString());
         }
             
    return prestamo;
    }
    
    
    
     
    public boolean editarPrestamo(PrestamoModelo prestamo)
    {
        boolean resultado;
         
       try {
             Connection con=null;
             Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2); //ccard
            CallableStatement cs = null;  
             Statement st=con.createStatement(); 
             
             	        try {
	        	  cs = con.prepareCall("{? = call  pp_pp_server.update_emergency_loan(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
 
             
//                                                    (RESULT)	NUMBER		
//                          SRRID	NUMBER	IN	
//                          SUBID	VARCHAR2	IN	
//                          CHARGEDATE	VARCHAR2	IN	Y
//                          ACCREDITATIONDATE	VARCHAR2	IN	
//                          SERVICEFLAG	NUMBER	IN	
//                          DEBITAMOUNT	NUMBER	IN	
//                          FLAGFORM	NUMBER	IN	
//                          USERFORM	VARCHAR2 IN
 	        	    cs.registerOutParameter(1, Types.NUMERIC); //RESULT
                            cs.setInt(2, Types.NUMERIC);//SRRID 
 	        	    cs.setString(3,"549"+prestamo.getSUBID());//SUBID
                            cs.setString(4, prestamo.getCHARGEDATE());  //CHARGEDATE
                            cs.setString(5, prestamo.getACCREDITATIONDATE());//ACCREDITATIONDATE
                            cs.setInt(6,prestamo.getSERVICEFLAG()); //SERVICEFLAG
                            cs.setInt(7, prestamo.getDEBITAMOUNT()); //DEBITAMOUNT 
                            cs.setInt(8, prestamo.getFLAGFORM());  //FLAGFORM 
 	        	    cs.setString(9, prestamo.getUSERFORM());//USERFORM
                              
 	
//                            CURRENTACCCREDITAMT	NUMBER	IN	
//                            CURRENTACCSERVICECOST	NUMBER	IN	
//                            SERVICECOSTCHARGED	NUMBER	IN	
                            cs.setInt(10, prestamo.getCURRENTACCCREDITAMT()); //CURRENTACCCREDITAMT
                            cs.setInt(11, prestamo.getCURRENTACCSERVICECOST()); //CURRENTACCSERVICECOST
                            cs.setInt(12, prestamo.getSERVICECOSTCHARGED()); //SERVICECOSTCHARGED  

//                            FREESERVICECOSTDATE	VARCHAR2	IN	Y
//                            LOANTIMELOANAMOUNT	NUMBER	IN	
//                            LOANTIMESERVICECOST	NUMBER	IN	
//                            OPERATORID	NUMBER	IN	
//                            LOANTIMEORDERDISCOUNT	VARCHAR2	IN	

                            cs.setString(13, prestamo.getFREESERVICECOSTDATE());   //FREESERVICECOSTDATE 
                            cs.setInt(14, prestamo.getLOANTIMELOANAMOUNT());    //LOANTIMELOANAMOUNT
                            cs.setInt(15, prestamo.getLOANTIMESERVICECOST());    //LOANTIMESERVICECOST
                            cs.setInt(16,prestamo.getOPERATORID());    //OPERATORID 
 	        	    cs.setString(17,prestamo.getLOANTIMEORDERDISCOUNT());  //LOANTIMEORDERDISCOUNT  
                            
                        cs.execute(); 
                    
	            
			} catch (SQLException e1) {
				 
				e1.printStackTrace();
			}
                         
            con.close();
         } //main
         catch (SQLException ex) {
        	 System.out.println(ex.toString());
         }
             
         
         if(prestamo.getRESULT()==0)
         {
             resultado=true;
         }else{
         
             resultado=false;
         }
     return resultado;
    
    }//editar Prestamo
    
    
    
    
    //ejecutar un script
     
    
    public void modificarPrestamo()
    {
        String linea="5493512090009";
        String fecha="31/01/2019 17:0s7:00";
        int operatorid=0;
        int debe=700000;
        Connection con=null;
             Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2);
             
        try {
            Statement st=con.createStatement();
            
         String    script= "  begin "+ 
                    " result := pp_pp_server.update_emergency_loan(srrid => srrid, "+
                     "                           subid => "+linea+", "+
                     "                           chargedate =>"+fecha+", "+
                     "                           accreditationdate => accreditationdate, "+
                     "                           serviceflag => serviceflag, "+
                      "                          debitamount => debitamount, "+
                       "                         flagform => flagform, "+
                        "                        userform => userform, "+
                         "                       currentacccreditamt => "+debe+ ","+
                          "                      currentaccservicecost => currentaccservicecost, "+
                           "                     servicecostcharged => servicecostcharged, "+
                            "                    freeservicecostdate => freeservicecostdate, "+
                             "                   loantimeloanamount => loantimeloanamount, "+
                              "                  loantimeservicecost => loantimeservicecost, "+
                               "                 operatorid => "+operatorid+", "+
                                "                loantimeorderdiscount => loantimeorderdiscount); "+
                               " end;";
         
        st.executeUpdate(script);
            
        } catch (SQLException ex) {
        	System.out.println(ex.toString());
        }
             
              
				
        
         
    }//meto
    
    
    
    
    
    
    
    
    
    
    
    
    //Eliminar Prestamo
    
    public int  eliminarPrestamo1(String linea, String FechaActivacion)
    { 
        int Resultado=0; 
          Connection con=null;
              Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2); 
            CallableStatement cs = null;  
        try {
            Statement st=con.createStatement();
             cs = con.prepareCall("{? = call  pp_pp_server.remove_emergency_loan(?,?,?)}");
                
 	        	   
 	        	    cs.setString(2,"549"+linea);
 	        	    cs.setString(3,FechaActivacion); 
                            cs.setFloat(4,0); 
                             cs.registerOutParameter(1, Types.NUMERIC); 
                             
                          cs.execute();     
                  Resultado=cs.getInt(1);
//             if(resultado==0)
//             {
//             respuesta=true;
//             }else
//             {
//              respuesta=false;
//             } 
        } catch (SQLException ex) {
        	System.out.println(ex.toString());
        } 	     
        return Resultado;
    }
    
    
    
    
    
    
     public boolean  eliminarPrestamo(String linea)
    { 
          boolean respuesta=false;
          Connection con=null;
              Conexion conexion=new Conexion();
             con=conexion.AbrirConexion(2); 
            CallableStatement cs = null;  
            
            prestamo=devolverObjPrestamo(linea);
            String fechaActivacion=prestamo.getACCREDITATIONDATE();
            
            
        try {
            Statement st=con.createStatement();
             cs = con.prepareCall("{? = call  pp_pp_server.remove_emergency_loan(?,?,?)}");
                
 	        	    cs.registerOutParameter(1, Types.NUMERIC); 
 	        	    cs.setString(2,"549"+linea);
 	        	    cs.setString(3,fechaActivacion); 
                            cs.setInt(4,0); 
                 cs.execute();     
                  
                 int resultado=cs.getInt(1);
//             if(resultado==0)
//             {
//             respuesta=true;
//             }else
//             {
//              respuesta=false;
//             } 
        } catch (SQLException ex) {
        	System.out.println(ex.toString());
        } 	     
        return respuesta;
    }
    
     
    
    public void mostrarPrestamo(String linea)
    {
        
       prestamo=devolverObjPrestamo(linea);
       System.out.println("RESULT "+"  "+prestamo.getRESULT());
       System.out.println("SUBID"+"  "+prestamo.getSUBID());
       System.out.println("OPERATORID"+"  "+prestamo.getOPERATORID());
       System.out.println("SRRID"+"  "+prestamo.getSRRID());
       System.out.println("CHARGEDATE"+"  "+prestamo.getCHARGEDATE());
       System.out.println("ACCREDITATIONDATE"+"  "+prestamo.getACCREDITATIONDATE());
       System.out.println("SERVICEFLAG"+"  "+prestamo.getSERVICEFLAG());
       
       
        System.out.println("DEBITAMOUNT"+"  "+prestamo.getDEBITAMOUNT());
       System.out.println("FLAGFORM"+"  "+prestamo.getFLAGFORM());
       System.out.println("USERFORM"+"  "+prestamo.getUSERFORM());
       System.out.println("CURRENTACCCREDITAMT"+"   "+prestamo.getCURRENTACCCREDITAMT());
       System.out.println("CURRENTACCSERVICECOST"+"  "+prestamo.getCURRENTACCSERVICECOST());
       System.out.println("SERVICECOSTCHARGED"+"  "+prestamo.getSERVICECOSTCHARGED());
       System.out.println("FREESERVICECOSTDATE"+"  "+prestamo.getFREESERVICECOSTDATE());
       
         System.out.println("LOANTIMELOANAMOUNT"+"   "+prestamo.getLOANTIMELOANAMOUNT());
       System.out.println("LOANTIMESERVICECOST"+"  "+prestamo.getLOANTIMESERVICECOST());
       System.out.println("LOANTIMEORDERDISCOUNT"+"  "+prestamo.getLOANTIMEORDERDISCOUNT());
    }//mostrarPrestamo
    
     
     
    
    
    
    public void verificarPoseePrestamo(String linea)
    {
        boolean resultado;
        Connection con=null;
        Conexion conexion=new Conexion();
        con=conexion.AbrirConexion(2); 
        CallableStatement cs = null;  
            
        prestamo=devolverObjPrestamo(linea);
        String fechaActivacion=prestamo.getACCREDITATIONDATE();
        if(prestamo.getRESULT()==0)
        {
        resultado=true;
        }else{
        
            resultado=false;
        }
        mensaje(resultado); 
    }
    
    public boolean verificarPoseePrestamo1(String linea)
    {
        boolean resultado;
        Connection con=null;
        Conexion conexion=new Conexion();
        con=conexion.AbrirConexion(2); 
        CallableStatement cs = null;  
            
        prestamo=devolverObjPrestamo(linea);
        String fechaActivacion=prestamo.getACCREDITATIONDATE();
        if(prestamo.getRESULT()==0)
        {
        resultado=true;
        }else{
        
            resultado=false;
        }
      return resultado;
    }
    
    
    
    public void mensaje(boolean resultado)
    {
            if(resultado==true)
            {
                System.out.println("RESULTADO EXITOSO");     
            }else{
            System.out.println("RESULTADO FALLIDO");     
            }
    
    }
    
      
    
    
    public void vencerPrestamo(String linea)
    {
         boolean resultado;
         Connection con=null;
        Conexion conexion=new Conexion();
        con=conexion.AbrirConexion(2); 
        CallableStatement cs = null;   
        prestamo=devolverObjPrestamo(linea);
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         String fechaString =prestamo.getACCREDITATIONDATE(); 
//         Date date; 
//        try {
//            date = formatter.parse(dateInString);
//          Calendar calendar = Calendar.getInstance(); 
//        calendar.setTime(date); // Configuramos la fecha que se recibe 
//         calendar.add(Calendar.DAY_OF_YEAR, 30);  // numero de días a añadir, o restar en caso de días<0 
//         System.out.println("VENCER PRESTAMO"+"  "+ calendar.getTime()); // Devuelve el objeto Date con los nuevos días añadidos
//        } catch (ParseException ex) {
//            Logger.getLogger(PrestamoController.class.getName()).log(Level.SEVERE, null, ex);
//        }  
          
           
            Date fecha = null;
            try {

            fecha = formato.parse(fechaString);

            } catch (ParseException ex) {

            ex.printStackTrace();

            }
//            System.out.println("VENCIMIENTO "+fecha);
//             System.out.println("VENCIMIENTO"+formato.format(fecha));
//               System.out.println("VENCIMIENTO"+formato.format(fecha));
               
                Calendar calendar = Calendar.getInstance(); 
                calendar.setTime(fecha); // Configuramos la fecha que se recibe 
                  calendar.add(Calendar.YEAR,-1);  // numero de días a añadir, o restar en caso de días<0
 	
         Date nuevaFecha=calendar.getTime();
         convertirDateString(nuevaFecha);
        //  System.out.println("VENCIMIENTO"+"  "+formato.format(nuevaFecha));//transforma el formato fecha-hora
        
        //editar Prestamo
        
        

    }
    
    
    
    public String convertirDateString(Date fecha)
    {
    SimpleDateFormat formatoString = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String fechaString = formatoString.format(fecha);
    System.out.println(fechaString);
    return fechaString;
    }

    public Date convertirStringDate(String fecha)
    {
             SimpleDateFormat formatoDate= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
            Date fechaFinal = null;
            try { 
            fechaFinal = formatoDate.parse(fecha);

            } catch (ParseException ex) { 
            ex.printStackTrace(); 
            }
      //System.out.println(fechaFinal.toString()); //formato calendario pero es date
      //System.out.println("VENCIMIENTO"+"  "+formatoDate.format(fechaFinal));//transforma el formato fecha-hora
            
  
      return fechaFinal;
    }
    
	

    
    public void vencerCostoServicio(PrestamoModelo prestamo)
     {
          Connection con=null;
            Conexion conexion=new Conexion();
            con=conexion.AbrirConexion(2); 
            CallableStatement cs = null;   
         int resultado=0;
         
         //si esta vencido no hace nada
         //si esta activo = hoy-10 dias
         
         
         PrestamoController pc=new PrestamoController();
         Date fechaCostoServicio=pc.convertirStringDate(prestamo.getFREESERVICECOSTDATE());
          Calendar calendar = Calendar.getInstance(); 
          calendar.setTime(fechaCostoServicio); // Configuramos la fecha que se recibe 
         calendar.add(Calendar.DATE,-3); //RESTO DOS DIAS A LA FECHA ACTUAL
     
         Date fechaCostoServicioVencido=calendar.getTime();
         prestamo.setFREESERVICECOSTDATE(pc.convertirDateString(fechaCostoServicioVencido));
         
       
     }
    
    
    
    
    public void saldarPrestamoParcialmente(PrestamoModelo prestamo)
    {
        PrestamoController pc=new PrestamoController();
        int resultado1= prestamo.getCURRENTACCCREDITAMT()/2;
        int resultado2=prestamo.getCURRENTACCCREDITAMT();
        int total=resultado2-resultado1;
        prestamo.setCURRENTACCCREDITAMT(total); 
        prestamo.setDEBITAMOUNT(resultado1);
        pc.editarPrestamo(prestamo);
     
    
    }
     
     
    
    
    
    
    
     public void activarCostoServicio(PrestamoModelo prestamo)
     {
     Connection con=null;
            Conexion conexion=new Conexion();
            con=conexion.AbrirConexion(2); 
            CallableStatement cs = null;   
         int resultado=0;
         
         //si esta vencido no hace nada
         //si esta activo = hoy-10 dias
         
         
         PrestamoController pc=new PrestamoController();
         Date fechaCostoServicio=pc.convertirStringDate(prestamo.getFREESERVICECOSTDATE());
          Calendar calendar = Calendar.getInstance(); 
          calendar.setTime(fechaCostoServicio); // Configuramos la fecha que se recibe 
         calendar.add(Calendar.DATE,+3); //RESTO DOS DIAS A LA FECHA ACTUAL
     
         Date fechaCostoServicioVencido=calendar.getTime();
         prestamo.setFREESERVICECOSTDATE(pc.convertirDateString(fechaCostoServicioVencido));
     }
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}//clase
