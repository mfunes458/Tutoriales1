package Pack1;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import oracle.net.aso.i;




//importar convert string-toDate
import java.text.ParseException;
import java.text.SimpleDateFormat;





public class Procedimiento1 {

	public static void main(String[] args) {

		
		Connection connection = null;
        
		
		 System.out.println("-------- Oracle JDBC Connection Testing ------");

	        try {

	            Class.forName("oracle.jdbc.driver.OracleDriver");

	        } catch (ClassNotFoundException e) {

	            System.out.println("No se encontro el Driver Oracle ");
	            e.printStackTrace();
	            return;

	        }

	        System.out.println("Existe el OJDBC");



	        try {

	            connection = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba", "Negro123");

	        } catch (SQLException e) {

	            System.out.println("Fallo la conexion a la BD");
	            e.printStackTrace();
	            return;

	        }

	        if (connection != null) {
	            
	            System.out.println("Tomaste el control de la base FELICITACIONES!");
	        } else {
	            System.out.println("Fallo la conexion a la BD");
	        }
	        
	        
	        
	        
	        //-----------PROCEDIMIENTO----------------
	        
	      try{  
	        
	        CallableStatement cst = connection.prepareCall("{call p_insertarPersona (?,?,?,?,?)}");

            Scanner teclado=new Scanner(System.in);
            System.out.println("INGRESE LOS DATOS DE LA PERSONA");
            System.out.println("CODIGO");
            int idPersona= teclado.nextInt();
            System.out.println("NOMBRE");
            String nombre=teclado.next();
            System.out.println("APELLIDO");
            String apellido=teclado.next();
            System.out.println("EDAD");
            int edad= teclado.nextInt();
             
            
         


                
                // Parametro 1 del procedimiento almacenado
                cst.setInt(1, idPersona);
                cst.setString(2,nombre);
                cst.setString(3,apellido);
              //  cst.setDate(3,FechaNacimiento);
                cst.setInt(4,edad);
                
                // Definimos los tipos de los parametros de salida del procedimiento almacenado
                cst.registerOutParameter(5, java.sql.Types.VARCHAR);
              
                
                // Ejecuta el procedimiento almacenado
                cst.execute();
                
                // Se obtienen la salida del procedimineto almacenado
            
                String v_salida= cst.getString(5); 
                System.out.println("MENSAJE: " + v_salida);
           

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
            	connection.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
			
        
        
        
		

	}//Clase

}//Paquete
