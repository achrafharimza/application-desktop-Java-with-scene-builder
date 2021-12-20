package Controllers;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DAO.DBoperation;
import helpers.bcrypt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class RegisterController {

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField cinText;

    @FXML
    private TextField emailText;

    @FXML
    private TextField entityText;

    @FXML
    private TextField firstnameText;

    @FXML
    private TextField lastnameText;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField phoneText;

    @FXML
    void RegistreF(ActionEvent event) throws SQLException {
    	String regexEmail = "^(.+)@(\\S+)$";
        Pattern email = Pattern.compile(regexEmail);
        Matcher Memail = email.matcher(emailText.getText());
        
        
        String regexCin = "[a-zA-Z]{2}\\d{7}";
        Pattern cni = Pattern.compile(regexCin);
        Matcher Mcni = cni.matcher(cinText.getText());
        
        String regexPhone = "[0-9]+";
        Pattern phonep = Pattern.compile(regexPhone);
        Matcher Mphone = phonep.matcher(phoneText.getText());
        
        Window owner = RegisterButton.getScene().getWindow();
        
    	
    	 if (passwordText.getText().isEmpty()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","password Should not empty ");
	            return;
	        }
    	 if (firstnameText.getText().isEmpty()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","firstname Should not empty ");
	            return;
	        }
    	 if (lastnameText.getText().isEmpty()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","lastname Should not empty ");
	            return;
	        }
    	 if (entityText.getText().isEmpty()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","entity Should not empty ");
	            return;
	        }
 	 
    	 if (emailText.getText().isEmpty()|| !Memail.matches()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","Please enter a Valid email ");
	            return;
	        }
 	
 	 if (cinText.getText().isEmpty()|| !Mcni.matches()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","Please enter a Valid cin ");
	            return;
	        }
 	 if (phoneText.getText().isEmpty()|| !Mphone.matches()) {
	            showAlert(Alert.AlertType.ERROR, owner, "Form Error!","Please enter a Valid phone ");
	            return;
	        }
    	 
    	 
 	String    passwordhached= bcrypt.hashing(passwordText.getText())  ;
    	 
    	
    	String emailId = emailText.getText();
        String passwordID = passwordhached;
        String cin = cinText.getText();
        String firstname = firstnameText.getText();
        String lastname = lastnameText.getText();
        String entity = entityText.getText();
        String phone = phoneText.getText();
        
        DBoperation DBoperation = new DBoperation();
        boolean flag =DBoperation.registerF(firstname,lastname,cin,phone,emailId,passwordID,entity);
        
        if (!flag) {
            infoBox("error!!data NOT save", null, "Failed");
        } else {
            infoBox("saving Successful!", null, "Failed");
            ///// move ton next page 
            
            Stage primaryStage =new Stage();
	    	   try {
	    		   Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
	    			Scene scene = new Scene(root,821,559);
	    			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    			primaryStage.setScene(scene);
	    			primaryStage.setTitle("Login");
	    			primaryStage.show();
   		} catch(Exception e) {
   			e.printStackTrace();
   		}
            
            
            }
    	
    	
       
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    }
    
    
    
    
/////////////////////////////
    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    ///////////////////////
	public static void infoBox(String infoMessage, String headerText, String title) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
	
}
