package org.joedayz.acweb.dao.daoFactory;

import java.sql.*;

public class BaseDaoSupport {
	

	  public static Connection getConnexion() throws SQLException{
		  Connection connection = null;
		  try {
			  
			 Class.forName("com.mysql.jdbc.Driver"); 
		     
			connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/scaf_java", "root", "root");
			
		  }	 catch (ClassNotFoundException e) {
			System.out.println("Error "+connection+" aa");
			System.out.println("Error de Conexion");
			
			System.out.println("SQLException: " + e.getMessage());
		   // System.out.println("SQLState: " + e.getSQLState());
		   // System.out.println("VendorError: " + e.getErrorCode());
		  }
		  return connection;
	}
}