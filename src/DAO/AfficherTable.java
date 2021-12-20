package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AfficherTable {

	
	
	
	
	
	

	public static  void ListeClients() {
		
		DataBConnect DataBConnect =new DataBConnect();
		 Connection connection =DataBConnect.getConnection();
		
		

					
					
		            // Step 2:Create a statement using connection object
					
		         
		            

		             try {
		            	 PreparedStatement preparedStatement =connection.prepareStatement("SELECT * FROM breif.clients");	
						ResultSet result = preparedStatement.executeQuery();
						System.out.println(result);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		            

		            
		
			
			
		
		
			
		
		
		
	}



	
	
	
	
	
	
	
	
}
