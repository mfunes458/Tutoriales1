package Prestamo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

  

public class Conexion {

	
	public Connection connection = null;

	public   Connection AbrirConexion( int base)
	{
	   
	    
	    try { 
	            Class.forName("oracle.jdbc.driver.OracleDriver"); 
	        } catch (ClassNotFoundException e) { 
	            System.out.println("Where is your Oracle JDBC Driver?");
	            e.printStackTrace();
	        } 
	  
	        try {
	                
	                //1-ARTPROD
	                //2-CCARD
	                //3-EBILL
	                
//	                stl/artsat143@ARTPROD.WORLD
	//ccard/satar678@artccard
	//EBILL/tbilsat375@TEBILL
	    
	                   

	                 switch(base) {
	               case 1 :
	                  connection = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@melideo.claro.amx:1521:ARTPROD", "stl", "artsat143");

	                  break;  

	               case 2 :
	                  connection = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@melideo.claro.amx:1521:ARTCCARD", "ccard", "satar678");
	                  break;  
	                  
	                  case 3 :
	                  connection = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@cura.claro.amx:1521:TEBILL", "EBILL", "tbilsat375");
	                  break;  

	               // You can have any number of case statements.
	               default :  JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA BASE");
	            }
	                
	                 
	                
	            
	        } catch (SQLException e) {

	            System.out.println("Connection Failed! Check output console");
	            e.printStackTrace();
	        }
	 return connection;
	}





	 

	    
	public   Connection CerrarConexion()
	{
	    
	         try {
	              if (connection != null) {
	            System.out.println("You made it, take control your database now!");
	                } else {
	            System.out.println("Failed to make connection!");
	        } 
	             connection.close();
	         } catch (SQLException ex) {
	             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	         } 
	         
	   return connection;
	}

	
	
	
	//metodo main
	public static void main(String[] args) {
		Conexion con=new Conexion();
		con.AbrirConexion(341);
		
		System.out.println("HOLA");

	}

}
