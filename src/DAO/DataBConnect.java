package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBConnect {
	
	public Connection connection;
	static String databaseName ="breif";
	static String url = "jdbc:mysql://localhost:3306/"+databaseName;
	 
	 static String usernameDB="root";
	 static String passwordDB="admin";
	public Connection getConnection() {
		
		
		
		 
		 try {
			 
			 
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				connection = DriverManager.getConnection(url,usernameDB,passwordDB);
			
		} catch (Exception e) {
			// TODO: handle exception
			 printSQLException(e);
		}
		
		
		
		
		return connection;
		
		
		
	}

	private void printSQLException(Exception e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
