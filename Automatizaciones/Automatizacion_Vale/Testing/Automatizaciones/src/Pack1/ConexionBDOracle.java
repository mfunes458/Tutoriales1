package Pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDOracle {

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
	        
		

	}

}
