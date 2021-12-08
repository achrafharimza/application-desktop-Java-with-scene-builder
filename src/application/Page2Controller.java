package application;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Page2Controller {
	  @FXML
	    private TextField Adresse;

	    @FXML
	    private Button Ajouter;

	    @FXML
	    private RadioButton CINC;

	    @FXML
	    private DatePicker DateDébut;

	    @FXML
	    private TextField EmailC;

	    @FXML
	    private ToggleGroup Identification;
	    
	    @FXML
	    private TextField IdentificationNum;

	    @FXML
	    private TextField Nbadge;

	    @FXML
	    private TextField NomC;

	    @FXML
	    private TextField NomEntreprise;

	    @FXML
	    private RadioButton PasseportC;

	    @FXML
	    private TextField PhoneC;

	    @FXML
	    private TextField PrénomC;

	    @SuppressWarnings("unchecked")
		@FXML
	    void Ajouter(ActionEvent event) {
	    	
	    	 JSONObject obj = new JSONObject();
	         JSONArray jrr = new JSONArray();
	         JSONParser jp = new JSONParser();
	         try{
	             FileReader file = new FileReader("clients.json");
	             jrr=(JSONArray)jp.parse(file);
	             System.out.println(jrr.getClass());
	             
	            
	             
	         }catch(Exception ex){
	             JOptionPane.showMessageDialog(null,"Error occured");
	         }
	         
	         obj.put("Num-badge", Nbadge.getText());
	         obj.put("Nom-Entreprise",NomEntreprise.getText());
	         obj.put("Date-Debut", DateDébut.getPromptText());
	         obj.put("Prenom",PrénomC.getText());
	         obj.put("Nom", NomC.getText());
	         obj.put("Identification-Num",IdentificationNum.getText());
	         obj.put("Phone",PhoneC.getText());
	         obj.put("Email", EmailC.getText());
	         obj.put("Adresse",Adresse.getText());
	        
	         jrr.add(obj);
	         
	        
	        
	         
	         try{
	             FileWriter file = new FileWriter("clients.json");
	             file.write(jrr.toJSONString());
	             file.close();
	         }catch(Exception ex){
	             JOptionPane.showMessageDialog(null,"Error occured");
	         }
	         JOptionPane.showMessageDialog(null,"Data Saved");;

	    	
	    	
	    	
	    	

	    }
	    @FXML
	    void GoToList(ActionEvent event) {
	    	Stage primaryStage =new Stage();
	    	   try {
        			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ListClients.fxml"));
        			Scene scene = new Scene(root,786,468);
        			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        			primaryStage.setScene(scene);
        			primaryStage.show();
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
	    	   
	    	   
	    	////////////////////////////////////////   
	    	   
	    	   
	    		
	    	///////////
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    }

	    @FXML
	    void Quitter(ActionEvent event) {

	    }

	
	

}
