package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBoperation {
//	static Connection connection =null;
//	//	
//		static String databaseName ="breif";
//		static String url = "jdbc:mysql://localhost:3306/"+databaseName;
//		 
//		 static String usernameDB="root";
//		 static String passwordDB="admin";
		 
		 
		
		
		
//		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//			// TODO Auto-generated method stub
//			
////			Class.forName("com.mysql.jdbc.Driver").newInstance();
////			
////			connection = DriverManager.getConnection(url,usernameDB,passwordDB);
//			
//			
//		}
	//////////////////////////////////
	
public ResultSet CountmMnth(int month) {
		
		DataBConnect DataBConnect =new DataBConnect();
		Connection connection =DataBConnect.getConnection();
		ResultSet result = null;
		try {
			result = connection.createStatement().executeQuery("SELECT COUNT(*) as CountMonth  FROM breif.clients where MONTH(DateInscription)="+month+";");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return result;
	}
	
	
	
	
	
	///////////////////////////////////
	public ResultSet DateInscriptionMonth() {
		
		DataBConnect DataBConnect =new DataBConnect();
		Connection connection =DataBConnect.getConnection();
		ResultSet result = null;
		try {
			result = connection.createStatement().executeQuery("SELECT MONTH(DateInscription) as DateInscriptionMonth FROM breif.clients order by DateInscription desc;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return result;
	}
	
	
	
	
	
	
	
		public boolean validateLogin (String emailId, String passwordID) throws SQLException {
			
			System.out.print(emailId);
			System.out.print(passwordID);
			DataBConnect DataBConnect =new DataBConnect();
			 Connection connection =DataBConnect.getConnection();
			try 
			(
					
//					Connection connection = DriverManager.getConnection(url,usernameDB,passwordDB);
		            

		            // Step 2:Create a statement using connection object
		            PreparedStatement preparedStatement =connection.prepareStatement("SELECT * FROM breif.fonctionnaires WHERE email = ? and password = ?")) {
		            preparedStatement.setString(1, emailId);
		            preparedStatement.setString(2, passwordID);

		           

		            ResultSet resultSet = preparedStatement.executeQuery();
		            if (resultSet.next()) {
		                return true;
		            }


		        } catch (SQLException e) {
		            // print SQL exception information
		            printSQLException(e);
		        }
			
			
			
			return false;
			
			
			
			
			
		}
		///////////////////////
		/////////////////////////regitre
	public	boolean registerF(String firstname, String lastname,String cin, String phone,String emailId, String passwordID, String entity) {
			// TODO Auto-generated method stub
			
		   // Step 2:Create a statement using connection object
		DataBConnect DataBConnect =new DataBConnect();
		 Connection connection =DataBConnect.getConnection();
			try 
			(
//					Connection connection = DriverManager.getConnection(url,usernameDB,passwordDB);
		            

		            // Step 2:Create a statement using connection object
				 PreparedStatement preparedStatement =connection.prepareStatement("INSERT INTO breif.fonctionnaires (firstname,lastname ,password,cin,email,phone,entity) VALUES (?, ?, ?,?, ?, ?,?);")) {				preparedStatement.setString(1, firstname);
		         preparedStatement.setString(2, lastname);
		         preparedStatement.setString(3, passwordID);
		         preparedStatement.setString(4, cin);
		         preparedStatement.setString(5, emailId);
		         preparedStatement.setString(6, phone);
		         preparedStatement.setString(7, entity);
//		         preparedStatement.executeUpdate();
		            System.out.println(preparedStatement);

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


