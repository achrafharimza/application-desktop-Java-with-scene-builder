package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddClient {

		 
	
public	boolean AddC(String Prenom,String Adresse,String Email, String DateDebut,String IdentificationNum,String Phone,String NomEntreprise,String NumBadge,String Nom) {
		// TODO Auto-generated method stub
		
	   // Step 2:Create a statement using connection object
	 String DateInscription = java.time.LocalDate.now().toString();
	 
	 DataBConnect DataBConnect =new DataBConnect();
	 Connection connection =DataBConnect.getConnection();
		try 
		(

	            
				
				
	            // Step 2:Create a statement using connection object
			 PreparedStatement preparedStatement =connection.prepareStatement("INSERT INTO breif.clients (Prenom,Adresse,Email ,DateDebut,IdentificationNum,Phone,NomEntreprise,NumBadge,Nom,DateInscription) VALUES (?, ?, ?,?, ?, ?,?,?,?,?);")) {				
	         preparedStatement.setString(1, Prenom);
	         preparedStatement.setString(2, Adresse);
	         preparedStatement.setString(3, Email);
	         preparedStatement.setString(4, DateDebut);
	         preparedStatement.setString(5, IdentificationNum);
	         preparedStatement.setString(6, Phone);
	         preparedStatement.setString(7, NomEntreprise);
	         preparedStatement.setString(8, NumBadge);
	         preparedStatement.setString(9, Nom);
	         preparedStatement.setString(10, DateInscription);

	           

	            int resultSet = preparedStatement.executeUpdate();
	            

	            if (resultSet==1) {
	                return true;
	            }


	        } catch (SQLException e) {
	            // print SQL exception information
	            printSQLException(e);
	        }
		
		
		
		return false;
	
		
	

	}


private void printSQLException(SQLException e) {
	// TODO Auto-generated method stub
	
}
	
	
	
	

}
